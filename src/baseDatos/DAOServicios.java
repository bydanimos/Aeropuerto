/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.*;
import aplicacion.servicios.Tienda;
import java.sql.*;
import java.util.List;


public class DAOServicios extends AbstractDAO {

   public DAOServicios (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public List<Tienda> obtenerTiendas(String nombre, int terminal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}