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

   public DAOServicios (Connection conexion, aplicacion.FachadaAplicacion fa){
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
                + "where nombre like ? "
                + "and terminal = ?";

        try {
            stmTiendas = con.prepareStatement(consulta);
            stmTiendas.setString(1, "%" + nombre + "%");
            stmTiendas.setInt(2, terminal);

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
}