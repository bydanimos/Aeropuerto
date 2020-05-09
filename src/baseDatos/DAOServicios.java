
package baseDatos;

import aplicacion.aviones.Terminal;
import aplicacion.servicios.CocheAlquiler;
import aplicacion.servicios.Tienda;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

public final class DAOServicios extends AbstractDAO {

    // -------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public DAOServicios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Tiendas ---------------------------------
    public final List<Tienda> obtenerTiendas(String nombre, int codigo, int terminal) {
        List<Tienda> resultado = new ArrayList<>();
        ArrayList<Terminal> terminales = this.obtenerTerminales();
        Tienda tiendaActual;
        Terminal terminalAux;
        Connection con;
        PreparedStatement stmTiendas = null;
        ResultSet rsTienda;

        con = this.getConexion();

        String consulta = "SELECT terminal, codigo, tipoventas, nombre "
                        + "FROM tienda "
                        + "WHERE nombre LIKE ? ";
        if (terminal != 0) {
            consulta += "AND terminal = ? ";
        }
        if (codigo != 0) {
            consulta += "AND codigo = ? ";
        }
        consulta += "ORDER BY terminal, codigo";

        try {
            stmTiendas = con.prepareStatement(consulta);
            stmTiendas.setString(1, "%" + nombre + "%");
            if (terminal != 0) {
                stmTiendas.setInt(2, terminal);
            }
            if (terminal != 0 && codigo != 0) {
                stmTiendas.setInt(3, codigo);
            } else if (terminal == 0 && codigo != 0) {
                stmTiendas.setInt(2, codigo);
            }

            rsTienda = stmTiendas.executeQuery();
            while (rsTienda.next()) {
                terminalAux = terminales.get(rsTienda.getInt("terminal") - 1);
                tiendaActual = new Tienda(terminalAux,
                        rsTienda.getInt("codigo"),
                        rsTienda.getString("tipoventas"),
                        rsTienda.getString("nombre"));

                resultado.add(tiendaActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTiendas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final void anhadirTienda(String nombre, int terminal, String tipo) {
        Connection con;
        PreparedStatement stmTienda = null;
        ResultSet rsTienda;

        con = super.getConexion();

        try {
            String consulta = "INSERT INTO tienda(terminal, tipoventas, nombre) "
                            + "       VALUES (?, ?, ?)";
            stmTienda = con.prepareStatement(consulta);

            stmTienda.setInt(1, terminal);
            stmTienda.setString(2, tipo);
            stmTienda.setString(3, nombre);

            stmTienda.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTienda.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public final void borrarTienda(int terminal, int codigo) {
        Connection con;
        PreparedStatement stmTienda = null;

        con = super.getConexion();

        try {
            stmTienda = con.prepareStatement("DELETE FROM tienda "
                                           + "WHERE terminal = ? AND codigo = ?");
            stmTienda.setInt(1, terminal);
            stmTienda.setInt(2, codigo);
            stmTienda.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTienda.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public final void editarTienda(int terminal, int codigo, String nombre, String tipo) {
        Connection con;
        PreparedStatement stmTiendas = null;

        con = super.getConexion();

        try {
            stmTiendas = con.prepareStatement("UPDATE tienda "
                                            + "SET nombre = ?, "
                                            + "    tipoventas = ? "
                                            + "WHERE codigo = ? AND terminal = ?");

            stmTiendas.setString(1, nombre);
            stmTiendas.setString(2, tipo);
            stmTiendas.setInt(3, codigo);
            stmTiendas.setInt(4, terminal);

            stmTiendas.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTiendas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    // -------------------------------------------------------------------------
    // ------------------------------ Terminales -------------------------------
    public final ArrayList<Terminal> obtenerTerminales() {
        ArrayList<Terminal> resultado = new ArrayList<>();
        Terminal terminalActual;
        Connection con;
        PreparedStatement stmTerminal = null;
        ResultSet rsTerminal;

        con = this.getConexion();

        String consulta = "SELECT numero, primeraPuerta, ultimaPuerta "
                        + "FROM terminal "
                        + "ORDER BY numero";

        try {
            stmTerminal = con.prepareStatement(consulta);

            rsTerminal = stmTerminal.executeQuery();
            while (rsTerminal.next()) {

                terminalActual = new Terminal(rsTerminal.getInt("numero"),
                        rsTerminal.getInt("primeraPuerta"),
                        rsTerminal.getInt("ultimaPuerta"));

                resultado.add(terminalActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTerminal.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final int obtenerNumTerminales() {
        int resultado = 0;
        Connection con;
        PreparedStatement stmTerminal = null;
        ResultSet rsTerminal;

        con = this.getConexion();

        String consulta = "SELECT COUNT(numero) FROM terminal";

        try {
            stmTerminal = con.prepareStatement(consulta);

            rsTerminal = stmTerminal.executeQuery();
            resultado = rsTerminal.getInt(0);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTerminal.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Coches --------------------------------
    public final ArrayList<CocheAlquiler> obtenerCoches(String matricula, int numPlazas, String modelo) {
        ArrayList<CocheAlquiler> resultado = new ArrayList<>();
        CocheAlquiler cocheActual;
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;
        String mat;

        con = this.getConexion();

        String consulta = "SELECT matricula, modelo, caballos, preciopordia, "
                        + "       tipocombustible, nplazas, npuertas, retirado "
                        + "FROM cochealquiler "
                        + "WHERE matricula LIKE ? AND modelo LIKE ? ";
        if (numPlazas != 0) {
            consulta += "and nplazas = ? ";
        }
        consulta += "order by matricula";

        try {
            stmCoche = con.prepareStatement(consulta);
            stmCoche.setString(1, "%" + matricula + "%");
            stmCoche.setString(2, "%" + modelo + "%");
            if (numPlazas != 0) {
                stmCoche.setInt(3, numPlazas);
            }
            rsCoche = stmCoche.executeQuery();
            while (rsCoche.next()) {
                mat = rsCoche.getString("matricula");
                cocheActual = new CocheAlquiler(mat, rsCoche.getString("modelo"),
                        rsCoche.getInt("caballos"),
                        rsCoche.getFloat("preciopordia"),
                        rsCoche.getString("tipocombustible"),
                        rsCoche.getInt("nplazas"), rsCoche.getInt("npuertas"),
                        rsCoche.getBoolean("retirado"));
                cocheActual.setAlquilado(this.cocheAlquilerAlquilado(mat));
                cocheActual.setReservado(this.cocheAlquilerReservado(mat));
                resultado.add(cocheActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmCoche.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public final void borrarCocheAlquiler(String matricula) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;
        String consulta;

        con = this.getConexion();

        consulta = "UPDATE cochealquiler AS c "
                 + "SET retirado = ? "
                 + "WHERE c.matricula = ? AND "
                 + "      NOT EXISTS (SELECT co.matricula " 
                 + "		      FROM cochealquiler AS co, alquilar AS a " 
                 + "		      WHERE co.matricula = a.matricula AND "
                 + "                        co.matricula = c.matricula AND " 
                 + "                        a.fechaAlquiler < current_timestamp " 
                 + "                        AND a.fechaDevolucion = null) AND " 
                 + "	  NOT EXISTS (SELECT r.fechaInicioReserva, r.fechaFinReserva " 
                 + "                  FROM reservar AS r, cochealquiler AS co " 
                 + "                  WHERE co.matricula = r.cocheAlquiler AND "
                 + "                        co.matricula = c.matricula AND " 
                 + "                        r.fechaFinReserva > current_timestamp)";

        try {
            stmCoche = con.prepareStatement(consulta);
            stmCoche.setBoolean(1, true);
            stmCoche.setString(2, matricula);

            stmCoche.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmCoche.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public final void insertarCocheAlquiler(CocheAlquiler coche) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;

        con = this.getConexion();

        String consulta = "INSERT INTO cochealquiler VALUES "
                        + "       ( ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            stmCoche = con.prepareStatement(consulta);
            stmCoche.setString(1, coche.getMatricula());
            stmCoche.setString(2, coche.getModelo());
            stmCoche.setInt(3, coche.getCaballos());
            stmCoche.setInt(4, coche.getNumeroPlazas());
            stmCoche.setInt(5, coche.getNumeroPuertas());
            stmCoche.setFloat(6, coche.getPrecioPorDia());
            stmCoche.setString(7, coche.getTipoCombustible());
            stmCoche.setBoolean(8, coche.isRetirado());

            stmCoche.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmCoche.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    // Nos indica si un coche se encuentra alquilado en este momento
    private final boolean cocheAlquilerAlquilado(String matricula) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;
        con = this.getConexion();
        Boolean result = true;

        String consulta = "SELECT a.fechaAlquiler, a.fechaDevolucion "
                        + "FROM alquilar AS a, cochealquiler AS c "
                        + "WHERE c.matricula = a.matricula AND c.matricula = ? "
                        + "      AND a.fechaAlquiler < current_timestamp AND "
                        + "      fechaDevolucion = null";

        try {
            stmCoche = con.prepareStatement(consulta);
            stmCoche.setString(1, matricula);
            rsCoche = stmCoche.executeQuery();

            if (!rsCoche.next()) {
                result = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            // this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmCoche.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return result;
    }

    // Nos indica si un coche se encuentra reservado en este momento
    private final boolean cocheAlquilerReservado(String matricula) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;
        Boolean result = true;
        con = this.getConexion();
        String consulta;

        consulta = "SELECT r.fechaInicioReserva, r.fechaFinReserva "
                 + "FROM reservar AS r, cochealquiler AS c "
                 + "WHERE c.matricula = r.cocheAlquiler AND c.matricula = ? "
                 + "      AND r.fechaInicioReserva < current_timestamp AND "
                 + "      r.fechaFinReserva > current_timestamp";

        try {
            stmCoche = con.prepareStatement(consulta);
            stmCoche.setString(1, matricula);
            rsCoche = stmCoche.executeQuery();

            if (!rsCoche.next()) {
                result = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            // this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmCoche.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return result;
    }

    public final void actualizarCocheAlquiler(String matricula, float precio) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;
        String consulta;
        con = this.getConexion();

        consulta = "UPDATE cochealquiler "
                 + "SET preciopordia = ? "
                 + "WHERE matricula = ? ";

        try {
            stmCoche = con.prepareStatement(consulta);
            stmCoche.setFloat(1, precio);
            stmCoche.setString(2, matricula);

            stmCoche.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmCoche.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
}
