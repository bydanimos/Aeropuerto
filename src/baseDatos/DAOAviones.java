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
   
   public void modificarAerolinea(Aerolinea aerolinea){
        Connection con;
        PreparedStatement stmAerolinea = null;

        con = super.getConexion();

        try {
            stmAerolinea = con.prepareStatement("update aerolinea "
                    + "set paissede=?, "
                    + "    pesobasemaleta=?, "
                    + "    preciobasemaleta=? "
                    + "where nombre=?");

            stmAerolinea.setString(1, aerolinea.getPaisSede());
            stmAerolinea.setFloat(2, aerolinea.getPesoBaseMaleta());
            stmAerolinea.setFloat(3, aerolinea.getPrecioBaseMaleta());
            stmAerolinea.setString(4, aerolinea.getNombre());

            stmAerolinea.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolinea.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public Aerolinea getAerolinea(String nombre) {
        Aerolinea resultado = null;
        Connection con;
        PreparedStatement stmAerolineas = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        String consulta = "select nombre, paissede, pesobasemaleta, preciobasemaleta " +
                "from aerolinea " +
                "where nombre = ?";

        try {
            stmAerolineas = con.prepareStatement(consulta);
            stmAerolineas.setString(1, nombre);

            rsAerolinea = stmAerolineas.executeQuery();
            while (rsAerolinea.next()) {

                resultado = new Aerolinea(rsAerolinea.getString("nombre"),rsAerolinea.getString("paissede"),rsAerolinea.getFloat("preciobasemaleta"),rsAerolinea.getFloat("pesobasemaleta"));
                
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
    
    public void anhadirAerolinea(Aerolinea aerolinea){
        Connection con;
        PreparedStatement stmAerolinea = null;
        ResultSet rsAerolinea;

        con = super.getConexion();

        try {
            stmAerolinea = con.prepareStatement("insert into aerolinea(nombre,paissede,preciobasemaleta,pesobasemaleta ) "
                    + "values (?,?,?,?)");
            stmAerolinea.setString(1, aerolinea.getNombre());
            stmAerolinea.setString(2, aerolinea.getPaisSede());
            stmAerolinea.setFloat(3, aerolinea.getPrecioBaseMaleta());
            stmAerolinea.setFloat(4, aerolinea.getPesoBaseMaleta());
            
            stmAerolinea.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolinea.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public void eliminarAerolineas(List<Aerolinea> aerolineas) {
        Connection con;
        PreparedStatement stmAerolinea = null;
        con = super.getConexion();

        try {
            for(Aerolinea a: aerolineas){
                stmAerolinea = null;
                stmAerolinea = con.prepareStatement("delete from aerolinea where nombre = ?");
                stmAerolinea.setString(1, a.getNombre());
                stmAerolinea.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolinea.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public boolean esAerolineaBorrable(Aerolinea aerolinea){
        boolean resultado = true;
        
        Connection con;
        PreparedStatement stmAerolineas = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        String consulta1 = "select * " +
                "from vuelo " +
                "where avion in (select codigo "+
                                 "from avion " +
                                 "where aerolinea = ? )";
        String consulta2 = "select * " +
                "from avion " +
                "where aerolinea = ? ";

        try {
            stmAerolineas = con.prepareStatement(consulta1);
            stmAerolineas.setString(1, aerolinea.getNombre());

            rsAerolinea = stmAerolineas.executeQuery();
            if (rsAerolinea.next()) {
                resultado = false;
            }else{
                stmAerolineas = con.prepareStatement(consulta2);
                stmAerolineas.setString(1, aerolinea.getNombre());

                rsAerolinea = stmAerolineas.executeQuery();
                if(rsAerolinea.next()){
                    resultado = false;
                }
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
