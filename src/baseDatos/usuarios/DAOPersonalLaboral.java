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
public class DAOPersonalLaboral extends AbstractDAO{
    public DAOPersonalLaboral (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
    public PersonalLaboral validarPersonalLaboral(String id, String clave){
        PersonalLaboral resultado=null;
        Connection con;
        PreparedStatement stmPersonalLaboral=null;
        ResultSet rsPersonalLaboral;

        con=this.getConexion();

                    
        try {
            stmPersonalLaboral=con.prepareStatement("select u.dni,u.id,u.correoelectronico,u.contrasenha,u.nombre,u.primerapellido,u.segundoapellido,"+
                                                  "u.paisprocedencia,u.telefono,u.sexo,pl.labor,pl.descripciontarea,pl.fechainicio "+
                                                  "from usuario as u, personallaboral as pl "+
                                                  "where u.dni = pe.usuario "+
                                                  "and u.id = ? and u.contrasenha = ? ");
            stmPersonalLaboral.setString(1, id);
            stmPersonalLaboral.setString(2, clave);
            rsPersonalLaboral=stmPersonalLaboral.executeQuery();
           
            if (rsPersonalLaboral.next()){
                resultado = new PersonalLaboral(rsPersonalLaboral.getString("dni"), rsPersonalLaboral.getString("id"),rsPersonalLaboral.getString("contrasenha"),
                                              rsPersonalLaboral.getString("correoelectronico"), rsPersonalLaboral.getString("nombre"),
                                              rsPersonalLaboral.getString("primerapellido"),rsPersonalLaboral.getString("segundoapellido"),
                                              TipoSexo.valueOf(rsPersonalLaboral.getString("sexo")),rsPersonalLaboral.getString("paisprocedencia"),rsPersonalLaboral.getString("telefono"),
                                              rsPersonalLaboral.getString("labor"),rsPersonalLaboral.getString("descripciontarea"),rsPersonalLaboral.getTimestamp("fechainicio"));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try {stmPersonalLaboral.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
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
    
    public void modificarPersonalLaboral(PersonalLaboral pl){
        Connection con;
        PreparedStatement stmPersonalLaboral=null;

        con=super.getConexion();

               
        try {
            stmPersonalLaboral=con.prepareStatement("update personallaboral "+
                                        "set labor=?, "+
                                        "   descripcionTarea=? " +
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
            
            stmPersonalLaboral.setString(1, pl.getLabor());
            stmPersonalLaboral.setString(2, pl.getDescripcionTarea());
            stmPersonalLaboral.setString(3, pl.getDni());
            stmPersonalLaboral.setString(4, pl.getId());
            stmPersonalLaboral.setString(5, pl.getNombre());
            stmPersonalLaboral.setString(6, pl.getApellido1());
            stmPersonalLaboral.setString(7, pl.getApellido2());
            stmPersonalLaboral.setString(8, pl.getCorreoElectronico());
            stmPersonalLaboral.setString(9, pl.getContrasenha());
            stmPersonalLaboral.setString(10, pl.getPaisProcedencia());
            stmPersonalLaboral.setString(11, pl.getTelefono());
            stmPersonalLaboral.setString(13, pl.getDni());
            
            String ts;
                
            if(pl.getSexo()==TipoSexo.H){
                ts = "H";
            }else if(pl.getSexo() == TipoSexo.M){
                ts = "M";
            }else{
                ts = "Otro";
            }
            stmPersonalLaboral.setString(12, ts);
             
            stmPersonalLaboral.executeUpdate();

        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try {stmPersonalLaboral.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
}