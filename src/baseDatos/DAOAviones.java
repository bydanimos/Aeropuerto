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
public class DAOAviones extends AbstractDAO {

   public DAOAviones (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
}