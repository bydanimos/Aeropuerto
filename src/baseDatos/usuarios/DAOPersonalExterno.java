
package baseDatos.usuarios;

import aplicacion.usuarios.*;
import baseDatos.AbstractDAO;
import java.sql.*;

public final class DAOPersonalExterno extends AbstractDAO {
          
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public DAOPersonalExterno (Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
     
    // ------------------------------------------------------------------------
    // ----------------------------- Validación -------------------------------
    public final PersonalExterno validarPersonalExterno(String id, String clave) {
        PersonalExterno resultado = null;
        Connection con;
        PreparedStatement stmPersonalExterno = null;
        ResultSet rsPersonalExterno;
        String consulta;

        con = this.getConexion();
                      
        try {
            consulta = "SELECT u.dni,u.id,u.correoelectronico,u.contrasenha,"
                     + "       u.nombre,u.primerapellido,u.segundoapellido,"
                     + "       u.paisprocedencia,u.telefono,u.sexo,pe.estardentro "
                     + "FROM usuario as u, personalexterno as pe "
                     + "WHERE u.dni = pe.usuario AND u.id = ? AND u.contrasenha = ? ";
            stmPersonalExterno = con.prepareStatement(consulta);
            stmPersonalExterno.setString(1, id);
            stmPersonalExterno.setString(2, clave);
            rsPersonalExterno = stmPersonalExterno.executeQuery();
           
            if (rsPersonalExterno.next()){
                /*resultado = new PersonalExterno(rsPersonalExterno.getString("dni"), rsPersonalExterno.getString("id"),
                                              rsPersonalExterno.getString("contrasenha"),
                                              rsPersonalExterno.getString("correoelectronico"), 
                                              rsPersonalExterno.getString("nombre"),
                                              rsPersonalExterno.getString("primerapellido"),
                                              rsPersonalExterno.getString("segundoapellido"),
                                              TipoSexo.valueOf(rsPersonalExterno.getString("sexo")),
                                              rsPersonalExterno.getString("paisprocedencia"),
                                              rsPersonalExterno.getInt("telefono"),
                                              rsPersonalExterno.getBoolean("estardentro"));
                */
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {stmPersonalExterno.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------- Getter ---------------------------------
    public final PersonalExterno getPersonalExterno(String dni) {
        PersonalExterno resultado = null;
        Connection con;
        PreparedStatement stmPersonalExterno = null;
        ResultSet rsPersonalExterno;
        String consulta;

        con = this.getConexion();
           
        try {
            consulta = "SELECT u.dni, u.id, u.correoelectronico, u.contrasenha, "
                     + "       u.nombre, u.primerapellido, u.segundoapellido, "
                     + "       u.paisprocedencia, u.telefono, u.sexo, pe.estardentro "
                     + "FROM usuario as u, personalexterno as pe "
                     + "WHERE u.dni = pe.usuario AND u.dni = ? ";
            stmPersonalExterno = con.prepareStatement(consulta);
            stmPersonalExterno.setString(1, dni);
            rsPersonalExterno = stmPersonalExterno.executeQuery();
           
            if (rsPersonalExterno.next()) {
                resultado = new PersonalExterno(rsPersonalExterno.getString("dni"), 
                                                rsPersonalExterno.getString("id"),
                                                rsPersonalExterno.getString("contrasenha"),
                                                rsPersonalExterno.getString("correoelectronico"),
                                                rsPersonalExterno.getString("nombre"),
                                                rsPersonalExterno.getString("primerapellido"),
                                                rsPersonalExterno.getString("segundoapellido"),
                                                TipoSexo.valueOf(rsPersonalExterno.getString("sexo")),
                                                rsPersonalExterno.getString("paisprocedencia"),
                                                rsPersonalExterno.getInt("telefono"),
                                                rsPersonalExterno.getBoolean("estardentro"));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalExterno.close();
            } catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }
    
    // ------------------------------------------------------------------------
    // ----------------------------- Inserción --------------------------------
    public final void insertarPersonalExterno(PersonalExterno pe) {
        Connection con;
        PreparedStatement stmPersonalExterno = null;
        ResultSet rsPersonalExterno;
        String consulta;

        con = super.getConexion();

        try {
            consulta = "INSERT INTO personalexterno(usuario,estardentro) "
                     + "VALUES (?,?)";
            stmPersonalExterno = con.prepareStatement(consulta);
            stmPersonalExterno.setString(1, pe.getDni());
            stmPersonalExterno.setBoolean(2, pe.isEstarDentro());
                
            stmPersonalExterno.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalExterno.close();
            } catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Eliminar --------------------------------
    public final void borrarPersonalExterno(String dni) {
        Connection con;
        PreparedStatement stmPersonalExterno = null;

        con = super.getConexion();

        try {
            stmPersonalExterno = con.prepareStatement("DELETE FROM personalexterno "
                                                    + "WHERE usuario = ?");
            stmPersonalExterno.setString(1, dni);
            stmPersonalExterno.executeUpdate();

        } catch (SQLException e) {
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
          try {
            stmPersonalExterno.close();
          } catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Modificar -------------------------------
    public final void modificarPersonalExterno(PersonalExterno pe) {
        Connection con;
        PreparedStatement stmPersonalExterno = null;
        String consulta;

        con = super.getConexion();

               
        try {
            consulta = "UPDATE personalexterno "
                     + "SET estardentro = ? "
                     + "WHERE dni = ? "
                     + "UPDATE usuario "
                     + "SET id = ?, nombre = ?, primerapellido = ?, "
                     + "    segundoapellido = ?, correoelectronico = ?, "
                     + "    contrasenha = ?, paisprocedencia = ?, telefono = ?, "
                     + "    sexo = ? " 
                     + "WHERE dni = ?";
            stmPersonalExterno = con.prepareStatement(consulta);
            
            stmPersonalExterno.setBoolean(1, pe.isEstarDentro());
            stmPersonalExterno.setString(2,pe.getDni());
            stmPersonalExterno.setString(3, pe.getId());
            stmPersonalExterno.setString(4, pe.getNombre());
            stmPersonalExterno.setString(5, pe.getApellido1());
            stmPersonalExterno.setString(6, pe.getApellido2());
            stmPersonalExterno.setString(7, pe.getCorreoElectronico());
            stmPersonalExterno.setString(8, pe.getContrasenha());
            stmPersonalExterno.setString(9, pe.getPaisProcedencia());
            stmPersonalExterno.setInt(10, pe.getTelefono());
            
            String ts;
                
            if (null == pe.getSexo()) {
                ts = "o";
            } else switch (pe.getSexo()) {
                case h:
                    ts = "h";
                    break;
                case m:
                    ts = "m";
                    break;
                default:
                    ts = "o";
                    break;
            }
            stmPersonalExterno.setString(11, ts);
            stmPersonalExterno.setString(12,pe.getDni());
             
            stmPersonalExterno.executeUpdate();

        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalExterno.close();
            } catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
}
