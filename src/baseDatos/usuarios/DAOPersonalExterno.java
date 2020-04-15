/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos.usuarios;
import aplicacion.*;
import aplicacion.usuarios.*;
import baseDatos.AbstractDAO;
import java.sql.*;

/**
 *
 * @author ruben
 */
public class DAOPersonalExterno extends AbstractDAO{
    public DAOPersonalExterno (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
    public PersonalExterno validarPersonalExterno(String id, String clave){
        PersonalExterno resultado=null;
        Connection con;
        PreparedStatement stmPersonalExterno=null;
        ResultSet rsPersonalExterno;

        con=this.getConexion();

        
        /*String dni, String id, String contrasenha, String correoElectronico, String nombre,
                        String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, String telefono,
                         java.sql.Timestamp fechaInicio, String curriculum)*/
                         
        try {
            stmPersonalExterno=con.prepareStatement("select u.dni,u.id,u.correoelectronico,u.contrasenha,u.nombre,u.primerapellido,u.segundoapellido,"+
                                                  "u.paisprocedencia,u.telefono,u.sexo,pe.estardentro "+
                                                  "from usuario as u, personalexterno as pe "+
                                                  "where u.dni = pe.usuario "+
                                                  "and u.id = ? and u.contrasenha = ? ");
            stmPersonalExterno.setString(1, id);
            stmPersonalExterno.setString(2, clave);
            rsPersonalExterno=stmPersonalExterno.executeQuery();
           
            if (rsPersonalExterno.next()){
                resultado = new PersonalExterno(rsPersonalExterno.getString("dni"), rsPersonalExterno.getString("id"),rsPersonalExterno.getString("contrasenha"),
                                              rsPersonalExterno.getString("correoelectronico"), rsPersonalExterno.getString("nombre"),
                                              rsPersonalExterno.getString("primerapellido"),rsPersonalExterno.getString("segundoapellido"),
                                              TipoSexo.valueOf(rsPersonalExterno.getString("sexo")),rsPersonalExterno.getString("paisprocedencia"),rsPersonalExterno.getString("telefono"),
                                              rsPersonalExterno.getBoolean("estardentro"));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try {stmPersonalExterno.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }
    
    public void insertarPersonalExterno(PersonalExterno pe){

        Connection con;
            PreparedStatement stmPersonalExterno=null;
            ResultSet rsPersonalExterno;

            con=super.getConexion();

            try {
                stmPersonalExterno=con.prepareStatement("insert into administrador(usuario,fechainicio,curriculum) "+
                                              "values (?,?)");
                stmPersonalExterno.setString(1, pe.getDni());
                stmPersonalExterno.setBoolean(2, pe.isEstarDentro());
                
                stmPersonalExterno.executeUpdate();
            } catch (SQLException e){
              System.out.println(e.getMessage());
              this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
              try {stmPersonalExterno.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
    }
    
    public void borrarPersonalExterno(String dni){
        Connection con;
        PreparedStatement stmPersonalExterno=null;

        con=super.getConexion();

        try {
            stmPersonalExterno=con.prepareStatement("delete from personalexterno where usuario = ?");
            stmPersonalExterno.setString(1, dni);
            stmPersonalExterno.executeUpdate();

        } catch (SQLException e){
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
          try {stmPersonalExterno.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
    
    public void modificarPersonalExterno(PersonalExterno pe){
        Connection con;
        PreparedStatement stmPersonalExterno=null;

        con=super.getConexion();

               
        try {
            stmPersonalExterno=con.prepareStatement("update personalexterno "+
                                        "set estardentro=? "+
                                        "where dni=? "+
                                        "update usuario "+
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
            
            stmPersonalExterno.setBoolean(1, pe.isEstarDentro());
            stmPersonalExterno.setString(2,pe.getDni());
            stmPersonalExterno.setString(3, pe.getId());
            stmPersonalExterno.setString(4, pe.getNombre());
            stmPersonalExterno.setString(5, pe.getApellido1());
            stmPersonalExterno.setString(6, pe.getApellido2());
            stmPersonalExterno.setString(7, pe.getCorreoElectronico());
            stmPersonalExterno.setString(8, pe.getContrasenha());
            stmPersonalExterno.setString(9, pe.getPaisProcedencia());
            stmPersonalExterno.setString(10, pe.getTelefono());
            
            String ts;
                
            if(pe.getSexo()==TipoSexo.H){
                ts = "H";
            }else if(pe.getSexo() == TipoSexo.M){
                ts = "M";
            }else{
                ts = "Otro";
            }
            stmPersonalExterno.setString(9, ts);
             
            stmPersonalExterno.executeUpdate();

        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try {stmPersonalExterno.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
}
