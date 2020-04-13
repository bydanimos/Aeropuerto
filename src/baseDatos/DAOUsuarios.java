/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.*;
import aplicacion.usuarios.*;
import java.sql.*;
/**
 *
 * @author basesdatos
 */
public class DAOUsuarios extends AbstractDAO {

   public DAOUsuarios (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
   
   
   public Usuario validarUsuario(String idUsuario, String clave){
        Usuario resultado=null;
        Connection con;
        PreparedStatement stmUsuario=null;
        ResultSet rsUsuario;

        con=this.getConexion();

        try {
            stmUsuario=con.prepareStatement("select dni,id,correoelectronico,contrasenha,nombre,primerapellido,segundoapellido,"+
                                            "paisprocedencia,telefono,sexo "+
                                            "from usuario "+
                                            "where id = ? and contrasenha = ?");
            stmUsuario.setString(1, idUsuario);
            stmUsuario.setString(2, clave);
            rsUsuario=stmUsuario.executeQuery();
           
            if (rsUsuario.next()){
                resultado = new Usuario(rsUsuario.getString("dni"), rsUsuario.getString("id"),rsUsuario.getString("contrasenha"),
                                        rsUsuario.getString("correoelectronico"), rsUsuario.getString("nombre"),
                                        rsUsuario.getString("primerapellido"),rsUsuario.getString("segundoapellido"),
                                        TipoSexo.valueOf(rsUsuario.getString("sexo")),rsUsuario.getString("paisprocedencia"),rsUsuario.getString("telefono"));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try {stmUsuario.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }
   
   public java.util.List<Usuario> consultarRegistroUsuarios(String id, String dni, String nombre, String ap1, String ap2){
        java.util.List<Usuario> resultado = new java.util.ArrayList<Usuario>();
        Usuario usuarioActual;
        Connection con;
        PreparedStatement stmUsuarios=null;
        ResultSet rsUsuario;

        con=this.getConexion();
        
        String consulta = "select dni,id,correoelectronico,contrasenha,nombre,primerapellido,segundoapellido,"+
                                            "paisprocedencia,telefono,sexo "+
                                            "from usuario "+
                                            "where id like ? " +
                                            "and dni like ? " +
                                            "and nombre like ? "+
                                            "and primerapellido like ? " +
                                            "and segundoapellido like ? ";

        try  {
            stmUsuarios=con.prepareStatement(consulta);
            stmUsuarios.setString(1, "%"+id+"%");
            stmUsuarios.setString(2, "%"+dni+"%");
            stmUsuarios.setString(3, "%"+nombre+"%");
            stmUsuarios.setString(4, "%"+ap1+"%");
            stmUsuarios.setString(5, "%"+ap2+"%");
            
            rsUsuario=stmUsuarios.executeQuery();
            while (rsUsuario.next()){
             
               usuarioActual = new Usuario(rsUsuario.getString("dni"), rsUsuario.getString("id"),rsUsuario.getString("contrasenha"),
                                        rsUsuario.getString("correoelectronico"), rsUsuario.getString("nombre"),
                                        rsUsuario.getString("primerapellido"),rsUsuario.getString("segundoapellido"),
                                        TipoSexo.valueOf(rsUsuario.getString("sexo")),rsUsuario.getString("paisprocedencia"),rsUsuario.getString("telefono"));

               resultado.add(usuarioActual);
            }

        } catch (SQLException e){
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
          try {stmUsuarios.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }

   public void insertarUsuario(Usuario u){

        Connection con;
            PreparedStatement stmUsuario=null;
            ResultSet rsUsuario;

            con=super.getConexion();

            try {
                stmUsuario=con.prepareStatement("insert into usuario(dni,id,correoelectronico,contrasenha,nombre,primerapellido,segundoapellido,paisprocedencia,telefono,sexo ) "+
                                              "values (?,?,?,?,?,?,?,?,?,?)");
                stmUsuario.setString(1, u.getDni());
                stmUsuario.setString(2, u.getId());
                stmUsuario.setString(3, u.getCorreoElectronico());
                stmUsuario.setString(4, u.getContrasenha());
                stmUsuario.setString(5, u.getNombre());
                stmUsuario.setString(6, u.getApellido1());
                stmUsuario.setString(7, u.getApellido2());
                stmUsuario.setString(8, u.getPaisProcedencia());
                stmUsuario.setString(9, u.getTelefono());
                String ts;
                
                if(u.getSexo()==TipoSexo.H){
                    ts = "H";
                }else if(u.getSexo() == TipoSexo.M){
                    ts = "M";
                }else{
                    ts = "Otro";
                }
                stmUsuario.setString(10, ts);
                stmUsuario.executeUpdate();
            } catch (SQLException e){
              System.out.println(e.getMessage());
              this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
              try {stmUsuario.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
    }
   
   public void borrarUsuario(String dni){
        Connection con;
        PreparedStatement stmUsuario=null;

        con=super.getConexion();

        try {
            stmUsuario=con.prepareStatement("delete from usuario where dni = ?");
            stmUsuario.setString(1, dni);
            stmUsuario.executeUpdate();

        } catch (SQLException e){
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
          try {stmUsuario.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
   
   public void modificarUsuario(Usuario u){
        Connection con;
        PreparedStatement stmUsuario=null;

        con=super.getConexion();

               
        try {
            stmUsuario=con.prepareStatement("update usuario "+
                                        "set id=?, "+
                                        "    nombre=?, "+
                                        "    primerapellido=?, "+
                                        "    segundoapellido=?, "+
                                        "    correoelectronico=?, "+
                                        "    contrasenha=?, "+
                                        "    paisprocedencia=? "+
                                        "    telefono=?, "+
                                        "    sexo=?, " +
                                        "where dni=?");
            
            stmUsuario.setString(1, u.getId());
            stmUsuario.setString(2, u.getNombre());
            stmUsuario.setString(3, u.getApellido1());
            stmUsuario.setString(4, u.getApellido2());
            stmUsuario.setString(5, u.getCorreoElectronico());
            stmUsuario.setString(6, u.getContrasenha());
            stmUsuario.setString(7, u.getPaisProcedencia());
            stmUsuario.setString(8, u.getTelefono());
            
            String ts;
                
            if(u.getSexo()==TipoSexo.H){
                ts = "H";
            }else if(u.getSexo() == TipoSexo.M){
                ts = "M";
            }else{
                ts = "Otro";
            }
            stmUsuario.setString(9, ts);
             
            stmUsuario.executeUpdate();

        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try {stmUsuario.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
}
