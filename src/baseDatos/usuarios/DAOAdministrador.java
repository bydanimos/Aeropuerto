
package baseDatos.usuarios;

import aplicacion.usuarios.*;
import baseDatos.AbstractDAO;
import java.sql.*;

public final class DAOAdministrador extends AbstractDAO {
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public DAOAdministrador(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
    // ------------------------------------------------------------------------
    // ----------------------------- Validación -------------------------------
    public final Administrador validarAdministrador(String id, String clave) {
        Administrador resultado = null;
        Connection con;
        PreparedStatement stmAdministrador = null;
        ResultSet rsAdministrador;
        String consulta;

        con = this.getConexion();

        try {
            consulta = "SELECT u.dni, u.id, u.correoelectronico, u.contrasenha, u.nombre, "
                     + "       u.primerapellido, u.segundoapellido, u.paisprocedencia, "
                     + "       u.telefono,u.sexo,ad.fechainicio,ad.curriculum "
                     + "FROM usuario as u, administrador as ad "
                     + "WHERE u.dni = ad.usuario AND u.id = ? AND "
                     + "      u.contrasenha = crypt(?, contrasenha) ";
            stmAdministrador = con.prepareStatement(consulta);
            stmAdministrador.setString(1, id);
            stmAdministrador.setString(2, clave);
            rsAdministrador = stmAdministrador.executeQuery();

            if (rsAdministrador.next()) {
                resultado = new Administrador(rsAdministrador.getString("dni"), 
                                              rsAdministrador.getString("id"), 
                                              rsAdministrador.getString("contrasenha"),
                                              rsAdministrador.getString("correoelectronico"), 
                                              rsAdministrador.getString("nombre"),
                                              rsAdministrador.getString("primerapellido"), 
                                              rsAdministrador.getString("segundoapellido"),
                                              TipoSexo.valueOf(rsAdministrador.getString("sexo")), 
                                              rsAdministrador.getString("paisprocedencia"), 
                                              rsAdministrador.getInt("telefono"),
                                              rsAdministrador.getTimestamp("fechainicio"), 
                                              rsAdministrador.getString("curriculum"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAdministrador.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    // ------------------------------------------------------------------------
    // ------------------------------ Inserción -------------------------------
    public final void insertarAdministrador(Administrador ad) {

        Connection con;
        PreparedStatement stmAdministrador = null;
        ResultSet rsAdministrador;

        con = super.getConexion();

        try {
            stmAdministrador = con.prepareStatement("INSERT INTO administrador(usuario,curriculum) "
                                                  + "VALUES (?,?)");
            stmAdministrador.setString(1, ad.getDni());
            stmAdministrador.setString(2, ad.getCurriculum());

            stmAdministrador.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAdministrador.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    // ------------------------------------------------------------------------
    // ------------------------------ Eliminar --------------------------------
    public final void borrarAdministrador(String dni) {
        Connection con;
        PreparedStatement stmAdministrador = null;

        con = super.getConexion();

        try {
            stmAdministrador = con.prepareStatement("DEELETE from administrador "
                                                  + "WHERE usuario = ?");
            stmAdministrador.setString(1, dni);
            stmAdministrador.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAdministrador.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    // ------------------------------------------------------------------------
    // ----------------------------- Modificar --------------------------------
    public final void modificarAdministrador(Administrador ad) {
        Connection con;
        PreparedStatement stmAdministrador = null;
        String consulta;

        con = super.getConexion();

        try {
            consulta = "UPDATE administrador "
                     + "SET curriculum = ? "
                     + "WHERE dni = ? "
                     + "UPDATE usuario "
                     + "SET id = ?, nombre = ?, primerapellido = ?, "
                     + "    segundoapellido = ?, correoelectronico = ?, "
                     + "    contrasenha = crypt(?, gen_salt('md5')), "
                     + "    paisprocedencia = ?, telefono = ?, sexo = ? "
                     + "WHERE dni = ?";
            stmAdministrador = con.prepareStatement(consulta);

            stmAdministrador.setString(1, ad.getCurriculum());
            stmAdministrador.setString(2, ad.getDni());

            stmAdministrador.setString(3, ad.getId());
            stmAdministrador.setString(4, ad.getNombre());
            stmAdministrador.setString(5, ad.getApellido1());
            stmAdministrador.setString(6, ad.getApellido2());
            stmAdministrador.setString(7, ad.getCorreoElectronico());
            stmAdministrador.setString(8, ad.getContrasenha());
            stmAdministrador.setString(9, ad.getPaisProcedencia());
            stmAdministrador.setInt(10, ad.getTelefono());
            stmAdministrador.setString(12, ad.getDni());

            String ts;

            if (null == ad.getSexo()) {
                ts = "otro";
            } else switch (ad.getSexo()) {
                case h:
                    ts = "h";
                    break;
                case m:
                    ts = "m";
                    break;
                default:
                    ts = "otro";
                    break;
            }
            stmAdministrador.setString(11, ts);

            stmAdministrador.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAdministrador.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    // ------------------------------------------------------------------------
    // -------------------------------- Getter --------------------------------
    public final Administrador getAdministrador(String dni) {
        Administrador resultado = null;
        Connection con;
        PreparedStatement stmAdministrador = null;
        ResultSet rsAdministrador;
        String consulta;

        con = this.getConexion();
                    
        try {
            consulta = "SELECT u.dni, u.id, u.correoelectronico, u.contrasenha, "
                     + "       u.nombre, u.primerapellido, u.segundoapellido, "
                     + "       u.paisprocedencia, u.telefono, u.sexo, "
                     + "       ad.fechainicio, ad.curriculum "
                     + "FROM usuario as u, administrador as ad "
                     + "WHERE u.dni = ad.usuario AND u.dni = ? ";
            stmAdministrador=con.prepareStatement(consulta);
            stmAdministrador.setString(1, dni);
            rsAdministrador = stmAdministrador.executeQuery();
           
            if (rsAdministrador.next()){
                resultado = new Administrador(rsAdministrador.getString("dni"), 
                                              rsAdministrador.getString("id"),
                                              rsAdministrador.getString("contrasenha"),
                                              rsAdministrador.getString("correoelectronico"),
                                              rsAdministrador.getString("nombre"),
                                              rsAdministrador.getString("primerapellido"),
                                              rsAdministrador.getString("segundoapellido"),
                                              TipoSexo.valueOf(rsAdministrador.getString("sexo")),
                                              rsAdministrador.getString("paisprocedencia"),
                                              rsAdministrador.getInt("telefono"),
                                              rsAdministrador.getTimestamp("fechainicio"),
                                              rsAdministrador.getString("curriculum"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAdministrador.close();
            } catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }
}
