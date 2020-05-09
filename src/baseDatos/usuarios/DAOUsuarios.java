
package baseDatos.usuarios;

import baseDatos.*;
import aplicacion.usuarios.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class DAOUsuarios extends AbstractDAO {

    // -------------------------------------------------------------------------
    // ------------------------------ Constructor ------------------------------
    public DAOUsuarios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Usuarios --------------------------------
    public final Usuario validarUsuario(String idUsuario, String clave) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("SELECT dni,id,correoelectronico,contrasenha,nombre,primerapellido,segundoapellido,"
                    + "paisprocedencia,telefono,sexo "
                    + "FROM usuario "
                    + "WHERE id = ? AND contrasenha = crypt(?, contrasenha)");
            stmUsuario.setString(1, idUsuario);
            stmUsuario.setString(2, clave);
            rsUsuario = stmUsuario.executeQuery();

            if (rsUsuario.next()) {
                resultado = new Usuario(rsUsuario.getString("dni"), rsUsuario.getString("id"), rsUsuario.getString("contrasenha"),
                        rsUsuario.getString("correoelectronico"), rsUsuario.getString("nombre"),
                        rsUsuario.getString("primerapellido"), rsUsuario.getString("segundoapellido"),
                        TipoSexo.valueOf(rsUsuario.getString("sexo")), rsUsuario.getString("paisprocedencia"), rsUsuario.getInt("telefono"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final java.util.List<Usuario> consultarRegistroUsuarios(String id, String dni, String nombre, String ap1, String ap2) {
        java.util.List<Usuario> resultado = new java.util.ArrayList<>();
        Usuario usuarioActual;
        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta = "SELECT dni,id,correoelectronico,contrasenha,nombre,primerapellido,segundoapellido,"
                + "paisprocedencia,telefono,sexo "
                + "FROM usuario "
                + "WHERE id like ? "
                + "AND dni like ? "
                + "AND nombre like ? "
                + "AND primerapellido like ? "
                + "AND segundoapellido like ? ";

        try {
            stmUsuarios = con.prepareStatement(consulta);
            stmUsuarios.setString(1, "%" + id + "%");
            stmUsuarios.setString(2, "%" + dni + "%");
            stmUsuarios.setString(3, "%" + nombre + "%");
            stmUsuarios.setString(4, "%" + ap1 + "%");
            stmUsuarios.setString(5, "%" + ap2 + "%");

            rsUsuario = stmUsuarios.executeQuery();
            while (rsUsuario.next()) {

                usuarioActual = new Usuario(rsUsuario.getString("dni"), rsUsuario.getString("id"), rsUsuario.getString("contrasenha"),
                        rsUsuario.getString("correoelectronico"), rsUsuario.getString("nombre"),
                        rsUsuario.getString("primerapellido"), rsUsuario.getString("segundoapellido"),
                        TipoSexo.valueOf(rsUsuario.getString("sexo")), rsUsuario.getString("paisprocedencia"), rsUsuario.getInt("telefono"));

                resultado.add(usuarioActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuarios.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final boolean insertarUsuario(Usuario u) {
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;
        boolean resultado = false;

        con = super.getConexion();

        try {
            stmUsuario = con.prepareStatement("INSERT INTO usuario(dni, id, "
                    + "correoelectronico, contrasenha, nombre, primerapellido, "
                    + "segundoapellido, paisprocedencia, telefono, sexo) "
                    + "values (?,?,?,crypt(?, gen_salt('md5')),?,?,?,?,?,?)");
            stmUsuario.setString(1, u.getDni());
            stmUsuario.setString(2, u.getId());
            stmUsuario.setString(3, u.getCorreoElectronico());
            stmUsuario.setString(4, u.getContrasenha());
            stmUsuario.setString(5, u.getNombre());
            stmUsuario.setString(6, u.getApellido1());
            stmUsuario.setString(7, u.getApellido2());
            stmUsuario.setString(8, u.getPaisProcedencia());
            stmUsuario.setInt(9, u.getTelefono());
            String ts;

            if (null == u.getSexo()) {
                ts = "o";
            } else {
                switch (u.getSexo()) {
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
            }
            stmUsuario.setString(10, ts);
            // Si se completó correctamente lo indicamos
            if (stmUsuario.executeUpdate() == 1) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final boolean borrarUsuario(String dni) {
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;
        boolean resultado = false;

        con = super.getConexion();

        try {
            stmUsuario = con.prepareStatement("SELECT * "
                    + "FROM comprarbillete as cb, reservar as r, alquilar as al, reservarparking as p "
                    + "WHERE cb.usuario = ? "
                    + "OR r.usuario = ? "
                    + "OR al.usuario = ? "
                    + "OR p.usuario = ? ");
            stmUsuario.setString(1, dni);
            stmUsuario.setString(2, dni);
            stmUsuario.setString(3, dni);
            stmUsuario.setString(4, dni);
            rsUsuario = stmUsuario.executeQuery();
            if (!rsUsuario.next()) {
                stmUsuario = con.prepareStatement("delete from usuario where dni = ?");
                stmUsuario.setString(1, dni);
                stmUsuario.executeUpdate();
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final void modificarUsuario(Usuario u) {
        Connection con;
        PreparedStatement stmUsuario = null;

        con = super.getConexion();

        try {
            stmUsuario = con.prepareStatement("UPDATE usuario "
                    + "SET id=?, "
                    + "    nombre=?, "
                    + "    primerapellido=?, "
                    + "    segundoapellido=?, "
                    + "    correoelectronico=?, "
                    //+ "    contrasenha=crypt(?, gen_salt('md5')), "
                    + "    paisprocedencia=?, "
                    + "    telefono=?, "
                    + "    sexo=? "
                    + "WHERE dni=?");

            stmUsuario.setString(1, u.getId());
            stmUsuario.setString(2, u.getNombre());
            stmUsuario.setString(3, u.getApellido1());
            stmUsuario.setString(4, u.getApellido2());
            stmUsuario.setString(5, u.getCorreoElectronico());
            //stmUsuario.setString(6, u.getContrasenha());
            stmUsuario.setString(6, u.getPaisProcedencia());
            stmUsuario.setInt(7, u.getTelefono());

            String ts;

            if (null == u.getSexo()) {
                ts = "o";
            } else {
                switch (u.getSexo()) {
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
            }
            stmUsuario.setString(8, ts);
            stmUsuario.setString(9, u.getDni());

            stmUsuario.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public final boolean comprobarId(String text) {
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;
        boolean resultado = false;

        con = super.getConexion();

        try {
            stmUsuario = con.prepareStatement("SELECT * "
                    + "FROM usuario "
                    + "WHERE id = ?");
            stmUsuario.setString(1, text);
            rsUsuario = stmUsuario.executeQuery();
            if (rsUsuario.next()) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final Usuario getUsuario(String dni) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("SELECT dni,id,correoelectronico,contrasenha,nombre,primerapellido,segundoapellido,"
                    + "paisprocedencia,telefono,sexo "
                    + "FROM usuario "
                    + "WHERE dni = ? ");
            stmUsuario.setString(1, dni);
            rsUsuario = stmUsuario.executeQuery();

            if (rsUsuario.next()) {
                resultado = new Usuario(rsUsuario.getString("dni"), rsUsuario.getString("id"), rsUsuario.getString("contrasenha"),
                        rsUsuario.getString("correoelectronico"), rsUsuario.getString("nombre"),
                        rsUsuario.getString("primerapellido"), rsUsuario.getString("segundoapellido"),
                        TipoSexo.valueOf(rsUsuario.getString("sexo")), rsUsuario.getString("paisprocedencia"), rsUsuario.getInt("telefono"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final java.util.List<Usuario> obtenerUsuariosControl(String dni, String id, String nombre, String primerApellido, String segundoApellido) {
        java.util.List<Usuario> resultado = new java.util.ArrayList<>();
        Usuario usuarioActual;
        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta = "SELECT dni,id,correoelectronico,contrasenha,nombre,primerapellido,segundoapellido,"
                + "paisprocedencia,telefono,sexo "
                + "FROM usuario "
                + "WHERE id like ? "
                + "AND dni like ? "
                + "AND nombre like ? "
                + "AND primerapellido like ? "
                + "AND segundoapellido like ? "
                + "AND dni in (select usuario "
                + "FROM comprarbillete "
                + "WHERE pasarcontrol = true )";

        try {
            stmUsuarios = con.prepareStatement(consulta);
            stmUsuarios.setString(1, "%" + id + "%");
            stmUsuarios.setString(2, "%" + dni + "%");
            stmUsuarios.setString(3, "%" + nombre + "%");
            stmUsuarios.setString(4, "%" + primerApellido + "%");
            stmUsuarios.setString(5, "%" + segundoApellido + "%");

            rsUsuario = stmUsuarios.executeQuery();
            while (rsUsuario.next()) {

                usuarioActual = new Usuario(rsUsuario.getString("dni"), rsUsuario.getString("id"), rsUsuario.getString("contrasenha"),
                        rsUsuario.getString("correoelectronico"), rsUsuario.getString("nombre"),
                        rsUsuario.getString("primerapellido"), rsUsuario.getString("segundoapellido"),
                        TipoSexo.valueOf(rsUsuario.getString("sexo")), rsUsuario.getString("paisprocedencia"), rsUsuario.getInt("telefono"));

                resultado.add(usuarioActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuarios.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    //--------------------------------------------------------------------------
    // ----------------------- Estadísticas Usuarios ---------------------------
    public final List<String> calcularEstNacionalidades() {
        List<String> resultado = new ArrayList<>();

        String nacionalidadActual;
        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta = "SELECT count(*) as numero, paisprocedencia\n"
                + "FROM usuario\n"
                + "GROUP BY paisprocedencia\n"
                + "ORDER BY numero DESC";

        try {
            stmUsuarios = con.prepareStatement(consulta);

            rsUsuario = stmUsuarios.executeQuery();
            while (rsUsuario.next()) {

                nacionalidadActual = rsUsuario.getString("paisprocedencia");

                resultado.add(nacionalidadActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuarios.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }
}
