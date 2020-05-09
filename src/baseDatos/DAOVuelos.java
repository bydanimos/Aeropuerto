
package baseDatos;

import aplicacion.*;
import aplicacion.aviones.*;
import aplicacion.aviones.Terminal;
import aplicacion.vuelos.Vuelo;
import java.sql.*;
import aplicacion.usuarios.TipoSexo;
import aplicacion.vuelos.TipoAsiento;

public final class DAOVuelos extends AbstractDAO {

    // -------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public DAOVuelos(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    // -------------------------------------------------------------------------
    // ------------------------------ Funciones --------------------------------
    public final java.util.List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, 
                                                     Timestamp fechaSalida, Timestamp fechaLlegada) {
        java.util.List<Vuelo> resultado = new java.util.ArrayList<Vuelo>();

        int a = 0, b = 0;
        Vuelo vueloActual;
        Terminal terminalActual;
        ModeloAvion modeloAvionActual;
        Aerolinea aerolineaActual;
        Avion avionActual;

        Connection con;
        PreparedStatement stmVuelos = null;
        ResultSet rsVuelos;

        con = this.getConexion();

        try {
            String consulta;
            consulta = "SELECT * "
                     + "FROM vuelo AS v, terminal AS t, avion AS a, modeloavion AS ma,"
                     + "     aerolinea AS ae "
                     + "WHERE v.terminal = t.numero AND v.avion = a.codigo AND "
                     + "      a.modeloavion = ma.nombre AND "
                     + "      a.aerolinea = ae.nombre AND "
                     + "      numvuelo like ? AND origen like ? "
                     + "      AND destino like ? ";
            if (fechaSalida != null) {
                consulta += "AND CAST(fechasalidateorica AS DATE) = ? ";
                a++;
            }
            if (fechaLlegada != null) {
                consulta += "AND CAST(fechallegadateorica AS DATE) = ? ";
                b++;
            }

            stmVuelos = con.prepareStatement(consulta);
            stmVuelos.setString(1, "%" + codigo + "%");
            stmVuelos.setString(2, "%" + origen + "%");
            stmVuelos.setString(3, "%" + destino + "%");
            if (fechaSalida != null) {
                stmVuelos.setTimestamp(3 + a, fechaSalida);
            }
            if (fechaLlegada != null) {
                stmVuelos.setTimestamp(3 + a + b, fechaLlegada);
            }

            rsVuelos = stmVuelos.executeQuery();
            while (rsVuelos.next()) {

                terminalActual = new Terminal(rsVuelos.getInt("numero"), rsVuelos.getInt("primerapuerta"), 
                                              rsVuelos.getInt("ultimapuerta"));
                modeloAvionActual = new ModeloAvion(rsVuelos.getString("nombre"), rsVuelos.getInt("capacidadnormal"),
                                                    rsVuelos.getInt("capacidadpremium"), rsVuelos.getFloat("consumo"),
                                                    rsVuelos.getString("empresafabricante"));
                aerolineaActual = new Aerolinea(rsVuelos.getString("nombre"), rsVuelos.getString("paissede"),
                                                rsVuelos.getFloat("preciobasemaleta"), rsVuelos.getFloat("pesobasemaleta"));
                avionActual = new Avion(modeloAvionActual, aerolineaActual, rsVuelos.getString("codigo"),
                                        rsVuelos.getInt("anhofabricacion"), rsVuelos.getBoolean("retirado"));

                vueloActual = new Vuelo(terminalActual, avionActual, rsVuelos.getString("numvuelo"), 
                                        rsVuelos.getString("destino"), rsVuelos.getString("origen"), 
                                        rsVuelos.getTimestamp("fechasalidateorica"), rsVuelos.getTimestamp("fechasalidareal"),
                                        rsVuelos.getTimestamp("fechallegadateorica"), rsVuelos.getTimestamp("fechasalidareal"),
                                        rsVuelos.getFloat("precioactual"), rsVuelos.getInt("puertaembarque"), 
                                        rsVuelos.getBoolean("cancelado"));

                resultado.add(vueloActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVuelos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final boolean guardarVuelo(Vuelo vuelo) {
        boolean update = false;

        Connection con;
        PreparedStatement stmExiste = null;
        ResultSet rsExiste;
        PreparedStatement stmVuelo = null;

        con = super.getConexion();

        try {
            String consulta = "SELECT * FROM vuelo WHERE numvuelo = ?";
            stmExiste = con.prepareStatement(consulta);
            stmExiste.setString(1, vuelo.getNumeroVuelo());
            rsExiste = stmExiste.executeQuery();
            if (rsExiste.next()) {
                consulta = "UPDATE vuelo "
                         + "SET numvuelo = ?, origen = ?, destino = ?, "
                         + "    fechasalidateorica = ?, fechasalidareal = ?, "
                         + "    fechallegadateorica = ?, fechallegadareal = ?, "
                         + "    precioactual = ?, puertaembarque = ?, "
                         + "    cancelado = ?, terminal = ?, "
                         + "    avion = ? "
                         + "WHERE numvuelo = ?";
                update = true;
            } else {
                consulta = "INSERT INTO vuelo "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            try {
                stmVuelo = con.prepareStatement(consulta);
                stmVuelo.setString(1, vuelo.getNumeroVuelo());
                stmVuelo.setString(2, vuelo.getOrigen());
                stmVuelo.setString(3, vuelo.getDestino());
                stmVuelo.setTimestamp(4, vuelo.getFechaSalida());
                stmVuelo.setTimestamp(5, vuelo.getFechaSalidaReal());
                stmVuelo.setTimestamp(6, vuelo.getFechaLlegada());
                stmVuelo.setTimestamp(7, vuelo.getFechaLlegadaReal());
                stmVuelo.setFloat(8, vuelo.getPrecioActual());
                stmVuelo.setInt(9, vuelo.getPuertaEmbarque());
                stmVuelo.setBoolean(10, vuelo.isCancelado());
                stmVuelo.setInt(11, vuelo.getTerminal().getNumero());
                stmVuelo.setString(12, vuelo.getAvion().getCodigo());
                if (update) {
                    stmVuelo.setString(13, vuelo.getNumeroVuelo());
                }
                stmVuelo.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
                return false;
            } finally {
                try {
                    stmVuelo.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            return false;
        } finally {
            try {
                stmExiste.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return true;
    }

    // -------------------------------------------------------------------------
    // ------------------------- Estadísticas Vuelos ---------------------------
    public final Aerolinea getAerolineaVuelo(Vuelo vuelo) {
        Aerolinea resultado = null;

        Connection con;
        PreparedStatement stmAerolinea = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        try {
            String consulta;
            consulta = "SELECT nombre, paissede, preciobasemaleta, pesobasemaleta "
                     + "FROM aerolinea "
                     + "WHERE nombre IN (SELECT aerolinea "
                     + "                FROM avion "
                     + "                WHERE codigo IN (SELECT avion "
                     + "                                 FROM vuelo "
                     + "                                 WHERE numvuelo = ? )) ";

            stmAerolinea = con.prepareStatement(consulta);
            stmAerolinea.setString(1, vuelo.getNumeroVuelo());

            rsAerolinea = stmAerolinea.executeQuery();
            if (rsAerolinea.next()) {
                resultado = new Aerolinea(rsAerolinea.getString("nombre"), 
                                          rsAerolinea.getString("paissede"), 
                                          rsAerolinea.getFloat("preciobasemaleta"), 
                                          rsAerolinea.getFloat("pesobasemaleta"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolinea.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final Integer getNSexoVuelo(Vuelo vuelo, TipoSexo ts) {
        Integer resultado = 0;
        Connection con;
        PreparedStatement stmNum = null;
        ResultSet rsNum;
        String sexo;

        con = this.getConexion();

        try {
            String consulta;
            consulta = "SELECT COUNT(*) AS num "
                     + "FROM comprarbillete "
                     + "WHERE vuelo = ? AND "
                     + "      usuario IN (SELECT dni "
                     + "                  FROM usuario "
                     + "                  WHERE sexo = ? )";

            if (TipoSexo.h.equals(ts)) {
                sexo = "h";
            } else if (TipoSexo.m.equals(ts)) {
                sexo = "m";
            } else {
                sexo = "o";
            }

            stmNum = con.prepareStatement(consulta);
            stmNum.setString(1, vuelo.getNumeroVuelo());
            stmNum.setString(2, sexo);

            rsNum = stmNum.executeQuery();
            if (rsNum.next()) {
                resultado = rsNum.getInt("num");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmNum.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final Integer getNTipoVuelo(Vuelo vuelo, TipoAsiento ta) {
        Integer resultado = 0;
        Connection con;
        PreparedStatement stmNum = null;
        ResultSet rsNum;
        String tipoAsiento;

        con = this.getConexion();

        try {
            String consulta = "SELECT COUNT(*) AS num "
                            + "FROM comprarbillete "
                            + "WHERE vuelo = ? AND tipoasiento = ? ";

            if (TipoAsiento.Normal.equals(ta)) {
                tipoAsiento = "normal";
            } else {
                tipoAsiento = "premium";
            }

            stmNum = con.prepareStatement(consulta);
            stmNum.setString(1, vuelo.getNumeroVuelo());
            stmNum.setString(2, tipoAsiento);

            rsNum = stmNum.executeQuery();
            if (rsNum.next()) {
                resultado = rsNum.getInt("num");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmNum.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final String getNacionalidadMayoritariaVuelo(Vuelo vuelo) {
        String resultado = "";
        Connection con;
        PreparedStatement stmNum = null;
        ResultSet rsNum;

        con = this.getConexion();

        try {
            String consulta;
            consulta = "SELECT paisprocedencia "
                     + "FROM usuario "
                     + "WHERE dni IN (SELECT usuario "
                     + "              FROM comprarbillete "
                     + "              WHERE vuelo = ?) "
                     + "GROUP BY paisprocedencia "
                     + "HAVING COUNT(*) >= ALL (SELECT COUNT(*) "
                     + "                        FROM usuario "
                     + "                        WHERE dni IN (SELECT usuario "
                     + "                                      FROM comprarbillete "
                     + "                                      WHERE vuelo = ?) "
                     + "GROUP BY paisprocedencia)";

            stmNum = con.prepareStatement(consulta);
            stmNum.setString(1, vuelo.getNumeroVuelo());
            stmNum.setString(2, vuelo.getNumeroVuelo());

            rsNum = stmNum.executeQuery();
            if (rsNum.next()) {
                resultado = rsNum.getString("paisprocedencia");
                while (rsNum.next()) {
                    resultado += "/" + rsNum.getString("paisprocedencia");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmNum.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    //--------------------------------------------------------------------------
    // ----------------------- Estadísticas Usuarios ---------------------------
    public final float calcularEstSexo(TipoSexo sexo) {
        float resultado = 0.0f;

        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta;
        consulta = "SELECT ((CAST(COUNT(*) AS float) * 100) / (SELECT COUNT(*) "
                 + "                                           FROM comprarbillete)) AS porcentaje "
                 + "FROM vuelo AS v, usuario AS u, comprarbillete AS b "
                 + "WHERE b.vuelo = v.numvuelo AND b.usuario = u.dni AND u.sexo = ?";

        try {
            stmUsuarios = con.prepareStatement(consulta);
            stmUsuarios.setString(1, sexo.toString());

            rsUsuario = stmUsuarios.executeQuery();
            if (rsUsuario.next()) {
                resultado = rsUsuario.getFloat("porcentaje");
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

    public final float calcularEstBillete(String tipo) {
        float resultado = 0.0f;

        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        if (tipo.equals("normal") || tipo.equals("premium")) {
            con = this.getConexion();

            String consulta;
            consulta = "SELECT ((CAST(COUNT(*) AS float) * 100) / (SELECT COUNT(*) "
                     + "                                           FROM comprarbillete)) AS porcentaje "
                     + "FROM comprarbillete "
                     + "WHERE tipoasiento = ?";

            try {
                stmUsuarios = con.prepareStatement(consulta);
                stmUsuarios.setString(1, tipo);

                rsUsuario = stmUsuarios.executeQuery();
                if (rsUsuario.next()) {
                    resultado = rsUsuario.getFloat("porcentaje");
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
        }

        return resultado;
    }

    public final float calcularEstCoche() {
        float resultado = 0.0f;

        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta;
        consulta = "SELECT ((CAST(COUNT(*) AS float) * 100) / (SELECT COUNT(*) "
                 + "                                           FROM comprarbillete)) AS porcentaje "
                 + "FROM comprarbillete AS b, reservar AS r "
                 + "WHERE b.usuario = r.usuario";

        try {
            stmUsuarios = con.prepareStatement(consulta);

            rsUsuario = stmUsuarios.executeQuery();
            if (rsUsuario.next()) {
                resultado = rsUsuario.getFloat("porcentaje");
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

    public final float calcularEstAcompanhante() {
        float resultado = 0.0f;

        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta;
        consulta = "SELECT ((CAST(COUNT(*) AS float) * 100) / (SELECT COUNT(*) "
                 + "                                           FROM comprarbillete)) AS porcentaje "
                 + "FROM comprarbillete "
                 + "WHERE teneracompanhante = true";

        try {
            stmUsuarios = con.prepareStatement(consulta);

            rsUsuario = stmUsuarios.executeQuery();
            if (rsUsuario.next()) {
                resultado = rsUsuario.getFloat("porcentaje");
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

    public final float calcularEstMaletas() {
        float resultado = 0.0f;

        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta;
        consulta = "SELECT ((CAST(COUNT(DISTINCT(usuario, vuelo)) AS float) * 100) / (SELECT COUNT(*) "
                 + "                                                                  FROM comprarbillete)) AS porcentaje "
                 + "FROM facturarmaleta";

        try {
            stmUsuarios = con.prepareStatement(consulta);

            rsUsuario = stmUsuarios.executeQuery();
            if (rsUsuario.next()) {
                resultado = rsUsuario.getFloat("porcentaje");
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

    public final float calcularEstMediaMaletas() {
        float resultado = 0.0f;

        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        String consulta;
        consulta = "SELECT (CAST(COUNT(*) AS float)/ (SELECT COUNT(*) "
                 + "                                  FROM comprarbillete)) AS media "
                 + "FROM facturarmaleta";

        try {
            stmUsuarios = con.prepareStatement(consulta);

            rsUsuario = stmUsuarios.executeQuery();
            if (rsUsuario.next()) {
                resultado = rsUsuario.getFloat("media");
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
