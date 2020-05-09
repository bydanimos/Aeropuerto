/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.aviones.Terminal;
import aplicacion.servicios.CocheAlquiler;
import aplicacion.servicios.Tienda;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

public class DAOServicios extends AbstractDAO {

    // -------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public DAOServicios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Tiendas ---------------------------------
    public List<Tienda> obtenerTiendas(String nombre, int codigo, int terminal) {
        List<Tienda> resultado = new ArrayList<>();
        ArrayList<Terminal> terminales = this.obtenerTerminales();
        Tienda tiendaActual;
        Terminal terminalAux;
        Connection con;
        PreparedStatement stmTiendas = null;
        ResultSet rsTienda;

        con = this.getConexion();

        String consulta = "SELECT terminal, codigo, tipoventas, nombre "
                        + "FROM tiendas "
                        + "WHERE nombre LIKE ? ";
        if (terminal != 0) {
            consulta += "AND terminal = ? ";
        }
        if (codigo != 0) {
            consulta += "AND codigo = ? ";
        }
        consulta += "order by terminal, codigo";

        try {
            stmTiendas = con.prepareStatement(consulta);
            stmTiendas.setString(1, "%" + nombre + "%");
            if (terminal != 0) {
                stmTiendas.setInt(2, terminal);
            }
            if (codigo != 0) {
                stmTiendas.setInt(3, codigo);
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

    public void anhadirTienda(String nombre, int terminal, String tipo) {
        Connection con;
        PreparedStatement stmTienda = null;
        ResultSet rsTienda;

        con = super.getConexion();

        try {
            String consulta = "INSERT INTO tiendas(terminal, tipoventas, nombre) "
                            + "VALUES (?, ?, ?)";
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

    public void borrarTienda(int terminal, int codigo) {
        Connection con;
        PreparedStatement stmTienda = null;

        con = super.getConexion();

        try {
            stmTienda = con.prepareStatement("DELETE FROM tiendas "
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

    public void editarTienda(int terminal, int codigo, String nombre, String tipo) {
        Connection con;
        PreparedStatement stmTiendas = null;

        con = super.getConexion();

        try {
            stmTiendas = con.prepareStatement("UPDATE tiendas "
                                            + "SET nombre = ?, "
                                            + "tipoventas = ? "
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
    public ArrayList<Terminal> obtenerTerminales() {
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

    public int obtenerNumTerminales() {
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
    // --------------------------------- Fechas --------------------------------
    public Timestamp timestampActual() {
        Timestamp resultado = null;
        Connection con;
        PreparedStatement stmFecha = null;
        ResultSet rsFecha;

        con = this.getConexion();

        String consulta = "SELECT current_timestamp";

        try {
            stmFecha = con.prepareStatement(consulta);
            rsFecha = stmFecha.executeQuery();
            resultado = rsFecha.getTimestamp(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmFecha.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Coches --------------------------------
    public ArrayList<CocheAlquiler> obtenerCoches(String matricula, int numPlazas, String modelo) {
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

    public void borrarCocheAlquiler(String matricula) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;

        con = this.getConexion();

        String consulta = "UPDATE cochealquiler "
                        + "SET retirado = ? "
                        + "WHERE matricula = ? ";

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

    public void insertarCocheAlquiler(CocheAlquiler coche) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;

        con = this.getConexion();

        String consulta = "INSERT INTO cochealquiler VALUES "
                        + "( ?, ?, ?, ?, ?, ?, ?, ?);";

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
    private boolean cocheAlquilerAlquilado(String matricula) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;
        con = this.getConexion();
        Boolean result = true;

        String consulta = "SELECT a.fechaAlquiler, a.fechaDevolucion "
                        + "FROM alquilar AS a, cochealquiler AS c "
                        + "WHERE c.matricula = a.matricula AND c.matricula = ? AND "
                        + "      a.fechaAlquiler < current_timestamp AND "
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
    private boolean cocheAlquilerReservado(String matricula) {
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

    public void actualizarCocheAlquiler(CocheAlquiler coche) {
        Connection con;
        PreparedStatement stmCoche = null;
        ResultSet rsCoche;
        String consulta;
        con = this.getConexion();

        consulta = "UPDATE cochealquiler "
                 + "SET modelo = ?, caballos = ?, nplazas = ?, "
                 + "    npuertas = ?, preciopordia = ?, "
                 + "    tipocombustible = ?, retirado = ? "
                 + "WHERE matricula = ? ";

        try {
            stmCoche = con.prepareStatement(consulta);
            stmCoche.setString(1, coche.getModelo());
            stmCoche.setInt(2, coche.getCaballos());
            stmCoche.setInt(3, coche.getNumeroPlazas());
            stmCoche.setInt(4, coche.getNumeroPuertas());
            stmCoche.setFloat(5, coche.getPrecioPorDia());
            stmCoche.setString(6, coche.getTipoCombustible());
            stmCoche.setBoolean(7, coche.isRetirado());
            stmCoche.setString(8, coche.getMatricula());

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
