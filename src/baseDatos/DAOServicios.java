/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.*;
import java.sql.*;
/**
 *
 * @author basesdatos
 */
public class DAOServicios extends AbstractDAO {

   public DAOServicios (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
}