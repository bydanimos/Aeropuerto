/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.*;
import aplicacion.aviones.Aerolinea;
import java.sql.*;
/**
 *
 * @author basesdatos
 */
public class DAOAviones extends AbstractDAO {

    public DAOAviones (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
    public java.util.List<Aerolinea> obtenerAerolineas(String nombre) {
        java.util.List<Aerolinea> resultado = new java.util.ArrayList<Aerolinea>();
        Aerolinea aerolineaActual;
        Connection con;
        PreparedStatement stmAerolineas = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        String consulta = "select nombre, paissede, pesobasemaleta, preciobasemaleta " +
                "from aerolinea " +
                "where nombre like ?";

        try {
            stmAerolineas = con.prepareStatement(consulta);
            stmAerolineas.setString(1, "%" + nombre + "%");

            rsAerolinea = stmAerolineas.executeQuery();
            while (rsAerolinea.next()) {

                aerolineaActual = new Aerolinea(rsAerolinea.getString("nombre"),rsAerolinea.getString("paissede"),rsAerolinea.getFloat("pesobasemaleta"),rsAerolinea.getFloat("preciobasemaleta"));
                resultado.add(aerolineaActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolineas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
   
   
}