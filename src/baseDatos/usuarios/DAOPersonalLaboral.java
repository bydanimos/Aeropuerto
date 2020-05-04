package baseDatos.usuarios;

import aplicacion.FachadaAplicacion;
import aplicacion.usuarios.*;
import baseDatos.AbstractDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOPersonalLaboral extends AbstractDAO {

    // -------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public DAOPersonalLaboral(Connection conexion, FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    // -------------------------------------------------------------------------
    // ------------------------------ Validacion -------------------------------
    public PersonalLaboral validarPersonalLaboral(String id, String clave) {
        PersonalLaboral resultado = null;
        Connection con;
        PreparedStatement stmPersonalLaboral = null;
        ResultSet rsPersonalLaboral;
        String consulta;

        con = this.getConexion();

        try {
            consulta = "SELECT u.dni, u.id, u.correoelectronico, u.contrasenha,"
                    + "        u.nombre, u.primerapellido, u.segundoapellido,"
                    + "        u.paisprocedencia, u.telefono, u.sexo, pl.labor, "
                    + "        pl.descripciontarea,pl.fechainicio "
                    + "FROM usuario as u, personallaboral as pl "
                    + "WHERE u.dni = pe.usuario "
                    + "      AND u.id = ? AND u.contrasenha = ? ";
            stmPersonalLaboral = con.prepareStatement(consulta);
            stmPersonalLaboral.setString(1, id);
            stmPersonalLaboral.setString(2, clave);
            rsPersonalLaboral = stmPersonalLaboral.executeQuery();

            if (rsPersonalLaboral.next()) {
                /* resultado = new PersonalLaboral(rsPersonalLaboral.getString("dni"), 
                                rsPersonalLaboral.getString("id"),rsPersonalLaboral.getString("contrasenha"),
                                rsPersonalLaboral.getString("correoelectronico"), 
                                rsPersonalLaboral.getString("nombre"),
                                rsPersonalLaboral.getString("primerapellido"),
                                rsPersonalLaboral.getString("segundoapellido"),
                                TipoSexo.valueOf(rsPersonalLaboral.getString("sexo")),
                                rsPersonalLaboral.getString("paisprocedencia"),
                                rsPersonalLaboral.getString("telefono"),
                                rsPersonalLaboral.getString("labor"),
                                rsPersonalLaboral.getString("descripciontarea"),
                                rsPersonalLaboral.getTimestamp("fechainicio"));
                 */
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Getter ----------------------------------
    public PersonalLaboral getPersonalLaboral(String dni) {
        PersonalLaboral resultado = null;
        Connection con;
        PreparedStatement stmPersonalLaboral = null;
        ResultSet rsPersonalLaboral;
        String consulta;

        con = this.getConexion();

        try {
            consulta = "SELECT u.dni, u.id, u.correoelectronico, u.contrasenha,"
                    + "        u.nombre, u.primerapellido, u.segundoapellido, "
                    + "        u.paisprocedencia, u.telefono, u.sexo, pl.labor, "
                    + "        pl.descripciontarea, pl.fechainicio "
                    + "FROM usuario AS u, personallaboral AS pl "
                    + "WHERE u.dni = pl.usuario AND u.dni = ? ";
            stmPersonalLaboral = con.prepareStatement(consulta);
            stmPersonalLaboral.setString(1, dni);
            rsPersonalLaboral = stmPersonalLaboral.executeQuery();

            if (rsPersonalLaboral.next()) {
                String id = rsPersonalLaboral.getString("id");
                String password = rsPersonalLaboral.getString("contrasenha");
                String email = rsPersonalLaboral.getString("correoelectronico");
                String nombre = rsPersonalLaboral.getString("nombre");
                String ape1 = rsPersonalLaboral.getString("primerapellido");
                String ape2 = rsPersonalLaboral.getString("segundoapellido");
                TipoSexo sexo = TipoSexo.valueOf(rsPersonalLaboral.getString("sexo"));
                String pais = rsPersonalLaboral.getString("paisprocedencia");
                int telefono = rsPersonalLaboral.getInt("telefono");
                String labor = rsPersonalLaboral.getString("labor");
                String tarea = rsPersonalLaboral.getString("descripciontarea");

                resultado = new PersonalLaboral(dni, id, password, email,
                        nombre, ape1, ape2, sexo, pais, telefono, labor,
                        tarea, rsPersonalLaboral.getTimestamp("fechainicio"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public List<PersonalLaboral> obtenerPersonalLaboral(String dni, String id,
            String nombre, String ape1, String ape2, boolean servicio) {

        List<PersonalLaboral> resultado = new ArrayList<>();
        PersonalLaboral perLabActual;
        Connection con;
        PreparedStatement stmPerLab = null;
        ResultSet rsPerLab;
        String dniTabla;

        con = this.getConexion();

        String consulta;
        consulta = "SELECT DISTINCT(u.dni), u.id, u.correoelectronico, "
                + "        u.contrasenha, u.nombre, u.primerapellido, "
                + "        u.segundoapellido, u.paisprocedencia, u.telefono, "
                + "        u.sexo, pl.labor, pl.descripciontarea, pl.fechainicio,"
                + "        h.fechaentrada, h.fechasalida "
                + "FROM usuario AS u, personallaboral AS pl, historialtrabajo AS h "
                + "WHERE u.dni = h.personallaboral AND u.dni = pl.usuario AND "
                + "      u.dni LIKE ? AND u.id LIKE ? AND u.nombre LIKE ? AND "
                + "      u.primerapellido LIKE ? AND u.segundoapellido LIKE ? ";
        if (servicio) {
            consulta += "AND h.fechasalida IS NULL ";
        } else {
            consulta += "AND h.fechasalida IS NOT NULL ";
        }
        consulta += "AND NOT EXISTS ( "
                + "SELECT * "
                + "FROM historialtrabajo AS h2, usuario AS u2 "
                + "WHERE h2.fechaentrada > h.fechaentrada AND u.dni = u2.dni "
                + "      AND u2.dni = h2.personallaboral AND h2.fechasalida IS NULL)";
        
        try {
            stmPerLab = con.prepareStatement(consulta);
            stmPerLab.setString(1, "%" + dni + "%");
            stmPerLab.setString(2, "%" + id + "%");
            stmPerLab.setString(3, "%" + nombre + "%");
            stmPerLab.setString(4, "%" + ape1 + "%");
            stmPerLab.setString(5, "%" + ape2 + "%");

            rsPerLab = stmPerLab.executeQuery();
            while (rsPerLab.next()) {
                dniTabla = rsPerLab.getString("dni");
                perLabActual = new PersonalLaboral(dniTabla,
                        rsPerLab.getString("id"), rsPerLab.getString("contrasenha"),
                        rsPerLab.getString("correoelectronico"),
                        rsPerLab.getString("nombre"),
                        rsPerLab.getString("primerapellido"),
                        rsPerLab.getString("segundoapellido"),
                        TipoSexo.valueOf(rsPerLab.getString("sexo")),
                        rsPerLab.getString("paisprocedencia"),
                        rsPerLab.getInt("telefono"), rsPerLab.getString("labor"),
                        rsPerLab.getString("descripciontarea"),
                        rsPerLab.getTimestamp("fechainicio"));

                perLabActual.setDeServicio(servicio);
                perLabActual.setFechaEntrada(rsPerLab.getTimestamp("fechaentrada"));
                perLabActual.setHorasSemana(this.horasTrabajadasEnDias(dniTabla, 7));
                perLabActual.setHorasMes(this.horasTrabajadasEnDias(dniTabla, 30));
                perLabActual.setHorasAnho(this.horasTrabajadasEnDias(dniTabla, 365));
                resultado.add(perLabActual);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPerLab.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    // -------------------------------------------------------------------------
    // ------------------------------ Inserción --------------------------------
    public void insertarPersonalLaboral(PersonalLaboral pl) {

        Connection con;
        PreparedStatement stmPersonalLaboral = null;
        ResultSet rsPersonalLaboral;
        String consulta;

        con = super.getConexion();

        try {
            consulta = "INSERT INTo personallaboral(usuario,labor,descripciontarea) "
                    + "VALUES (?, ?, ?)";
            stmPersonalLaboral = con.prepareStatement(consulta);
            stmPersonalLaboral.setString(1, pl.getDni());
            stmPersonalLaboral.setString(2, pl.getLabor());
            stmPersonalLaboral.setString(3, pl.getDescripcionTarea());

            stmPersonalLaboral.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------- Delete ---------------------------------
    public void borrarPersonalLaboral(String dni) {
        Connection con;
        PreparedStatement stmPersonalLaboral = null;
        String consulta;

        con = super.getConexion();

        try {
            consulta = "DELETE FROM personallaboral WHERE usuario = ?";
            stmPersonalLaboral = con.prepareStatement(consulta);
            stmPersonalLaboral.setString(1, dni);
            stmPersonalLaboral.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    // -------------------------------------------------------------------------
    // ------------------------------ Modificar --------------------------------
    public void modificarPersonalLaboral(PersonalLaboral pl) {
        Connection con;
        PreparedStatement stmPersonalLaboral = null;

        con = super.getConexion();

        try {
            stmPersonalLaboral = con.prepareStatement("update personallaboral "
                    + "set labor = ?, descripcionTarea = ? "
                    + "where dni = ? "
                    + "update usuario; " // comprobar funcionamiento
                    + "set id = ?, "
                    + "    nombre = ?, "
                    + "    primerapellido = ?, "
                    + "    segundoapellido = ?, "
                    + "    correoelectronico = ?, "
                    + "    contrasenha = ?, "
                    + "    paisprocedencia = ?, "
                    + "    telefono = ?, "
                    + "    sexo = ? "
                    + "where dni = ?");

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
            stmPersonalLaboral.setInt(11, pl.getTelefono());
            stmPersonalLaboral.setString(13, pl.getDni());

            String ts;
            if (null == pl.getSexo()) {
                ts = "o";
            } else {
                switch (pl.getSexo()) {
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
            stmPersonalLaboral.setString(12, ts);

            stmPersonalLaboral.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public void modLaborDescripPersonalLaboral(PersonalLaboral pl) {
        Connection con;
        PreparedStatement stmPersonalLaboral = null;
        String consulta;

        con = super.getConexion();

        try {
            consulta = "UPDATE personallaboral "
                    + "SET labor = ?, descripcionTarea = ? "
                    + "WHERE usuario in (SELECT dni "
                    + "                  FROM usuario "
                    + "                  WHERE dni = ?) ";

            stmPersonalLaboral = con.prepareStatement(consulta);

            stmPersonalLaboral.setString(1, pl.getLabor());
            stmPersonalLaboral.setString(2, pl.getDescripcionTarea());
            stmPersonalLaboral.setString(3, pl.getDni());

            stmPersonalLaboral.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    // -------------------------------------------------------------------------
    // ---------------------- Estadísticas Trabajadores ------------------------
    public String trabajadorSemana(int dias) {
        String resultado = null;
        Connection con;
        PreparedStatement stmPersonalLaboral = null;
        ResultSet rsPersonalLaboral;
        String consulta;

        con = this.getConexion();

        try {
            consulta = "SELECT SUM(h.fechasalida - h.fechaentrada) AS num, "
                    + "        u.nombre, u.primerapellido, u.segundoapellido, "
                    + "        u.dni "
                    + "FROM usuario AS u, personallaboral AS pl, "
                    + "     historialtrabajo AS h "
                    + "WHERE u.dni = pl.usuario AND u.dni = h.personallaboral "
                    + "      AND h.fechasalida IS NOT NULL AND h.fechaentrada "
                    + "      BETWEEN current_timestamp::timestamp - ";
            switch (dias) {
                case 7: consulta += "'7 days'::interval AND "; break;
                case 30: consulta += "'30 days'::interval AND "; break;
                case 365: consulta += "'365 days'::interval AND "; break;
                default: break;
            }    
            consulta += " current_timestamp::timestamp "
                    + "GROUP BY u.dni, u.nombre, u.primerapellido, "
                    + "         u.segundoapellido "
                    + "HAVING SUM(h.fechasalida - h.fechaentrada) IS NOT NULL "
                    + "ORDER BY num DESC";
            stmPersonalLaboral = con.prepareStatement(consulta);
            rsPersonalLaboral = stmPersonalLaboral.executeQuery();

            if (rsPersonalLaboral.next()) {
                resultado = rsPersonalLaboral.getString("nombre") + " "
                        + rsPersonalLaboral.getString("primerapellido") + " "
                        + rsPersonalLaboral.getString("segundoapellido");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public String trabajadorMes() {
        return this.trabajadorSemana(30);
    }

    public String trabajadorAnho() {
        return this.trabajadorSemana(365);
    }
    
    private String horasTrabajadasEnDias(String dni, int dias) {
        String resultado = null;
        Connection con;
        PreparedStatement stmPersonalLaboral = null;
        ResultSet rsPersonalLaboral;
        String consulta;

        con = this.getConexion();

        try {
            consulta = "SELECT SUM(h.fechasalida - h.fechaentrada) AS num "
                    + "FROM usuario AS u, personallaboral AS pl, "
                    + "     historialtrabajo AS h "
                    + "WHERE u.dni = pl.usuario AND u.dni = h.personallaboral "
                    + "      AND h.fechasalida IS NOT NULL and u.dni = ? AND "
                    + "      h.fechaentrada BETWEEN current_timestamp::timestamp";
            switch (dias) {
                case 7: consulta += " - '7 days'::interval AND "; break;
                case 30: consulta += " - '30 days'::interval AND "; break;
                case 365: consulta += " - '365 days'::interval AND "; break;
                default: break;
            }
            consulta += " current_timestamp::timestamp";
            stmPersonalLaboral = con.prepareStatement(consulta);
            stmPersonalLaboral.setString(1, dni);
            rsPersonalLaboral = stmPersonalLaboral.executeQuery();

            if (rsPersonalLaboral.next()) {
                resultado = "" + rsPersonalLaboral.getObject(1);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPersonalLaboral.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
}
