/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.aviones.Terminal;
import aplicacion.servicios.CocheAlquiler;
import aplicacion.servicios.Tienda;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOServicios extends AbstractDAO {

    public DAOServicios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Tiendas ---------------------------------
    public List<Tienda> obtenerTiendas(String nombre, int codigo, int terminal) {
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
            consulta += "and terminal = ? ";
        } 
        if (codigo != 0) {
            consulta += "and codigo = ? ";
        }
        consulta += "order by terminal, codigo";

        try {
            stmTiendas = con.prepareStatement(consulta);
            stmTiendas.setString(1, "%" + nombre + "%");
            if (terminal != 0) {
                stmTiendas.setInt(2, terminal);
            }
            if (codigo != 0) {
                stmTiendas.setInt(3, codigo);
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

    public void editarTienda(int terminal, int codigo, String nombre, String tipo) {
        Connection con;
        PreparedStatement stmTiendas = null;

        con = super.getConexion();

        try {
            stmTiendas = con.prepareStatement("update tiendas "
                    + "set nombre = ?, "
                    + "tipoventas = ? "
                    + "where codigo = ? and terminal = ?");

            stmTiendas.setString(1, nombre);
            stmTiendas.setString(2, tipo);
            stmTiendas.setInt(3, codigo);
            stmTiendas.setInt(4, terminal);

            stmTiendas.executeUpdate();

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
    }
    
    // -------------------------------------------------------------------------
    // ------------------------------ Terminales -------------------------------
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
    
    public int obtenerNumTerminales() {
        int resultado = 0;
        Connection con;
        PreparedStatement stmTerminal = null;
        ResultSet rsTerminal;

        con = this.getConexion();

        String consulta = "select count(numero) from terminal";

        try {
            stmTerminal = con.prepareStatement(consulta);

            rsTerminal = stmTerminal.executeQuery();
            resultado = rsTerminal.getInt(0);

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
    
    // -------------------------------------------------------------------------
    // --------------------------------- Coches --------------------------------
    public ArrayList<CocheAlquiler> obtenerCoches(String matricula, int numPlazas, String modelo) {
        ArrayList<CocheAlquiler> resultado = new ArrayList<>();
        CocheAlquiler cocheActual;
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;

        con = this.getConexion();

        String consulta = "select numero, primeraPuerta, ultimaPuerta "
                + "from terminal "
                + "order by numero";

        try {
            stmCoche = con.prepareStatement(consulta);

            rsCoche = stmCoche.executeQuery();
            while (rsCoche.next()) {

                cocheActual = new CocheAlquiler(rsCoche.getString("matricula"),
                        rsCoche.getString("modelo"), rsCoche.getInt("caballos"),
                        rsCoche.getFloat("preciopordia"), 
                        rsCoche.getString("tipocombustible"), 
                        rsCoche.getInt("numeroplazas"), 
                        rsCoche.getInt("numeropuertas"), 
                        rsCoche.getBoolean("retirado"));

                resultado.add(cocheActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmCoche.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
}
