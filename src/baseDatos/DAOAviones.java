/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.*;
import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import aplicacion.aviones.ModeloAvion;
import aplicacion.aviones.Terminal;
import aplicacion.vuelos.Vuelo;
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
   
   public java.util.List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        java.util.List<Avion> resultado = new java.util.ArrayList<>();
        
        ModeloAvion modeloAvionActual;
        Aerolinea aerolineaActual;
        Avion avionActual;
        
        Connection con;
        PreparedStatement stmAviones = null;
        ResultSet rsAviones;

        con = this.getConexion();

        try {
            String consulta = "select * "
                    + "from avion as a, aerolinea as ae, modeloavion as ma "
                    + "where a.modeloavion = ma.nombre and "
                    + "a.aerolinea = ae.nombre and "
                    + "a.codigo like ? and "
                    + "a.aerolinea like ? ";
            if(retirado == 0) consulta += "and retirado = false";
            if(retirado == 1) consulta += "and retirado = true";
            //si se le pasa cualquier otro valor, los muestra todos

            stmAviones = con.prepareStatement(consulta);
            stmAviones.setString(1, "%" + codigo + "%");
            stmAviones.setString(2, "%" + aerolinea + "%");

            rsAviones = stmAviones.executeQuery();
            while (rsAviones.next()) {
                modeloAvionActual = new ModeloAvion(rsAviones.getString("nombre"), rsAviones.getInt("capacidadnormal"), 
                                rsAviones.getInt("capacidadpremium"), rsAviones.getFloat("consumo"), rsAviones.getString("empresafabricante"));
                aerolineaActual = new Aerolinea(rsAviones.getString("nombre"), rsAviones.getString("paissede"), 
                                rsAviones.getFloat("preciobasemaleta"), rsAviones.getFloat("pesobasemaleta"));
                avionActual = new Avion(modeloAvionActual, aerolineaActual, rsAviones.getString("codigo"), 
                                rsAviones.getInt("anhofabricacion"), rsAviones.getBoolean("retirado"));

                resultado.add(avionActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAviones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
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