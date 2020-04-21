/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.aviones.Terminal;
import aplicacion.servicios.Tienda;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOServicios extends AbstractDAO {

    public DAOServicios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public List<Tienda> obtenerTiendas(String nombre, int terminal) {
        List<Tienda> resultado = new ArrayList<>();
        ArrayList<Terminal> terminales = this.obtenerTerminales();
        Tienda tiendaActual;
        Terminal terminalAux;
        Connection con;
        PreparedStatement stmTiendas = null;
        ResultSet rsTienda;

        con = this.getConexion();

        String consulta = "select terminal, codigo, tipoventas, nombre "
                + "from tiendas "
                + "where nombre like ? ";
        if (terminal != 0) {
            consulta += "and terminal = ?";
        }

        try {
            stmTiendas = con.prepareStatement(consulta);
            stmTiendas.setString(1, "%" + nombre + "%");
            if (terminal != 0) {
                stmTiendas.setInt(2, terminal);
            }

            rsTienda = stmTiendas.executeQuery();
            while (rsTienda.next()) {
                terminalAux = terminales.get(rsTienda.getInt("terminal") - 1);
                tiendaActual = new Tienda(terminalAux,
                        rsTienda.getInt("codigo"),
                        rsTienda.getString("tipoventas"),
                        rsTienda.getString("nombre"));

                resultado.add(tiendaActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTiendas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public ArrayList<Terminal> obtenerTerminales() {
        ArrayList<Terminal> resultado = new ArrayList<>();
        Terminal terminalActual;
        Connection con;
        PreparedStatement stmTerminal = null;
        ResultSet rsTerminal;

        con = this.getConexion();

        String consulta = "select numero, primeraPuerta, ultimaPuerta "
                + "from terminal "
                + "order by numero";

        try {
            stmTerminal = con.prepareStatement(consulta);

            rsTerminal = stmTerminal.executeQuery();
            while (rsTerminal.next()) {

                terminalActual = new Terminal(rsTerminal.getInt("numero"),
                        rsTerminal.getInt("primeraPuerta"),
                        rsTerminal.getInt("ultimaPuerta"));

                resultado.add(terminalActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTerminal.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void anhadirTienda(String nombre, int terminal, String tipo) {
        Connection con;
        PreparedStatement stmTienda = null;
        ResultSet rsTienda;

        con = super.getConexion();

        try {
            String consulta = "insert into tiendas(terminal, tipoventas, nombre) "
                    + "values (?, ?, ?)";
            stmTienda = con.prepareStatement(consulta);
            
            stmTienda.setInt(1, terminal);
            stmTienda.setString(2, tipo);
            stmTienda.setString(3, nombre);

            stmTienda.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTienda.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public void borrarTienda(int terminal, int codigo) {
        Connection con;
        PreparedStatement stmTienda = null;

        con = super.getConexion();

        try {
            stmTienda = con.prepareStatement("delete from tiendas "
                    + "where terminal = ? and codigo = ?");
            stmTienda.setInt(1, terminal);
            stmTienda.setInt(2, codigo);
            stmTienda.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTienda.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
}
