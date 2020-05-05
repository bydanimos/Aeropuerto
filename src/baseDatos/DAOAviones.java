
package baseDatos;

import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import aplicacion.aviones.ModeloAvion;
import java.sql.*;
import java.util.List;

public class DAOAviones extends AbstractDAO {

    // -------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public DAOAviones(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public java.util.List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        java.util.List<Avion> resultado = new java.util.ArrayList<>();

        ModeloAvion modeloAvionActual;
        Aerolinea aerolineaActual;
        Avion avionActual;

        Connection con;
        PreparedStatement stmAviones = null;
        ResultSet rsAviones;

        con = this.getConexion();

        try {
            String consulta = "select * "
                    + "from avion as a, aerolinea as ae, modeloavion as ma "
                    + "where a.modeloavion = ma.nombre and "
                    + "a.aerolinea = ae.nombre and "
                    + "a.codigo like ? and "
                    + "a.aerolinea like ? ";
            if (retirado == 0) {
                consulta += "and retirado = false";
            }
            if (retirado == 1) {
                consulta += "and retirado = true";
            }
            //si se le pasa cualquier otro valor, los muestra todos

            stmAviones = con.prepareStatement(consulta);
            stmAviones.setString(1, "%" + codigo + "%");
            stmAviones.setString(2, "%" + aerolinea + "%");

            rsAviones = stmAviones.executeQuery();
            while (rsAviones.next()) {
                modeloAvionActual = new ModeloAvion(rsAviones.getString("modeloavion"), rsAviones.getInt("capacidadnormal"),
                        rsAviones.getInt("capacidadpremium"), rsAviones.getFloat("consumo"), rsAviones.getString("empresafabricante"));
                aerolineaActual = new Aerolinea(rsAviones.getString("nombre"), rsAviones.getString("paissede"),
                        rsAviones.getFloat("preciobasemaleta"), rsAviones.getFloat("pesobasemaleta"));
                avionActual = new Avion(modeloAvionActual, aerolineaActual, rsAviones.getString("codigo"),
                        rsAviones.getInt("anhofabricacion"), rsAviones.getBoolean("retirado"));

                resultado.add(avionActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAviones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public java.util.List<Aerolinea> obtenerAerolineas(String nombre) {
        java.util.List<Aerolinea> resultado = new java.util.ArrayList<>();
        Aerolinea aerolineaActual;
        Connection con;
        PreparedStatement stmAerolineas = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        String consulta = "select nombre, paissede, pesobasemaleta, preciobasemaleta "
                + "from aerolinea "
                + "where nombre like ?";

        try {
            stmAerolineas = con.prepareStatement(consulta);
            stmAerolineas.setString(1, "%" + nombre + "%");

            rsAerolinea = stmAerolineas.executeQuery();
            while (rsAerolinea.next()) {

                aerolineaActual = new Aerolinea(rsAerolinea.getString("nombre"), 
                        rsAerolinea.getString("paissede"), rsAerolinea.getFloat("pesobasemaleta"), 
                        rsAerolinea.getFloat("preciobasemaleta"));
                resultado.add(aerolineaActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolineas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void modificarAerolinea(Aerolinea aerolinea) {
        Connection con;
        PreparedStatement stmAerolinea = null;

        con = super.getConexion();

        try {
            stmAerolinea = con.prepareStatement("update aerolinea "
                    + "set paissede=?, "
                    + "    pesobasemaleta=?, "
                    + "    preciobasemaleta=? "
                    + "where nombre=?");

            stmAerolinea.setString(1, aerolinea.getPaisSede());
            stmAerolinea.setFloat(2, aerolinea.getPesoBaseMaleta());
            stmAerolinea.setFloat(3, aerolinea.getPrecioBaseMaleta());
            stmAerolinea.setString(4, aerolinea.getNombre());

            stmAerolinea.executeUpdate();

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
    }

    public Aerolinea getAerolinea(String nombre) {
        Aerolinea resultado = null;
        Connection con;
        PreparedStatement stmAerolineas = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        String consulta = "select nombre, paissede, pesobasemaleta, preciobasemaleta "
                + "from aerolinea "
                + "where nombre = ?";

        try {
            stmAerolineas = con.prepareStatement(consulta);
            stmAerolineas.setString(1, nombre);

            rsAerolinea = stmAerolineas.executeQuery();
            while (rsAerolinea.next()) {

                resultado = new Aerolinea(rsAerolinea.getString("nombre"),
                        rsAerolinea.getString("paissede"), rsAerolinea.getFloat("preciobasemaleta"),
                        rsAerolinea.getFloat("pesobasemaleta"));

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolineas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void anhadirAerolinea(Aerolinea aerolinea) {
        Connection con;
        PreparedStatement stmAerolinea = null;
        ResultSet rsAerolinea;

        con = super.getConexion();

        try {
            stmAerolinea = con.prepareStatement("insert into aerolinea(nombre,paissede,preciobasemaleta,pesobasemaleta ) "
                    + "values (?,?,?,?)");
            stmAerolinea.setString(1, aerolinea.getNombre());
            stmAerolinea.setString(2, aerolinea.getPaisSede());
            stmAerolinea.setFloat(3, aerolinea.getPrecioBaseMaleta());
            stmAerolinea.setFloat(4, aerolinea.getPesoBaseMaleta());

            stmAerolinea.executeUpdate();
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
    }

    public void eliminarAerolineas(List<Aerolinea> aerolineas) {
        Connection con;
        PreparedStatement stmAerolinea = null;
        con = super.getConexion();

        try {
            for (Aerolinea a : aerolineas) {
                stmAerolinea = null;
                stmAerolinea = con.prepareStatement("delete from aerolinea where nombre = ?");
                stmAerolinea.setString(1, a.getNombre());
                stmAerolinea.executeUpdate();
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
    }

    public boolean esAerolineaBorrable(Aerolinea aerolinea) {
        boolean resultado = true;

        Connection con;
        PreparedStatement stmAerolineas = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        String consulta1 = "select * "
                + "from vuelo "
                + "where avion in (select codigo "
                + "from avion "
                + "where aerolinea = ? )";
        String consulta2 = "select * "
                + "from avion "
                + "where aerolinea = ? ";

        try {
            stmAerolineas = con.prepareStatement(consulta1);
            stmAerolineas.setString(1, aerolinea.getNombre());

            rsAerolinea = stmAerolineas.executeQuery();
            if (rsAerolinea.next()) {
                resultado = false;
            } else {
                stmAerolineas = con.prepareStatement(consulta2);
                stmAerolineas.setString(1, aerolinea.getNombre());

                rsAerolinea = stmAerolineas.executeQuery();
                if (rsAerolinea.next()) {
                    resultado = false;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAerolineas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;

    }

    public boolean actualizarAvion(Avion avion) {
        boolean resultado = false;
        Connection con;
        PreparedStatement stmAvion = null;

        if (this.getAerolinea(avion.getAerolinea().getNombre()) != null) {

            con = super.getConexion();

            try {
                stmAvion = con.prepareStatement("update avion "
                        + "set aerolinea=?, "
                        + "modeloavion=?, "
                        + "anhofabricacion=?, "
                        + "retirado=? "
                        + "where codigo=?");

                stmAvion.setString(1, avion.getAerolinea().getNombre());
                stmAvion.setString(2, avion.getModeloAvion().getNombre());
                stmAvion.setInt(3, avion.getAnhoFabricacion());
                stmAvion.setBoolean(4, avion.isRetirado());
                stmAvion.setString(5, avion.getCodigo());

                stmAvion.executeUpdate();

                resultado = true;

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmAvion.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
        }
        return resultado;
    }

    public java.util.List<ModeloAvion> obtenerModelosAvion(String nombre) {
        java.util.List<ModeloAvion> resultado = new java.util.ArrayList<>();
        ModeloAvion modeloAvionActual;
        Connection con;
        PreparedStatement stmModelos = null;
        ResultSet rsModelos;

        con = this.getConexion();

        String consulta = "(select ma.*, false as eliminable "
                + "from modeloavion as ma, avion as a "
                + "where ma.nombre = a.modeloavion "
                + "and ma.nombre like ?"
                + "group by ma.nombre) "
                + "union "
                + "(select ma.*, true as eliminable "
                + "from modeloavion as ma left join avion as a "
                + "on ma.nombre = a.modeloavion "
                + "where a.modeloavion is null "
                + "and ma.nombre like ?)";

        try {
            stmModelos = con.prepareStatement(consulta);
            stmModelos.setString(1, "%" + nombre + "%");
            stmModelos.setString(2, "%" + nombre + "%");

            rsModelos = stmModelos.executeQuery();
            while (rsModelos.next()) {

                modeloAvionActual = new ModeloAvion(rsModelos.getString("nombre"),
                        rsModelos.getInt("capacidadnormal"), rsModelos.getInt("capacidadpremium"),
                        rsModelos.getFloat("consumo"), rsModelos.getString("empresafabricante"),
                        rsModelos.getBoolean("eliminable"));
                resultado.add(modeloAvionActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmModelos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public boolean añadirAvion(String codigo, Aerolinea aerolinea, ModeloAvion modeloAvion, int anhoFabricacion) {
        boolean resultado = false;
        Connection con;
        PreparedStatement stmAvion = null;
        PreparedStatement stmAux = null;
        ResultSet rsAux = null;

        con = super.getConexion();

        try {
            stmAux = con.prepareStatement("select * from avion where codigo = ?");
            stmAux.setString(1, codigo);

            rsAux = stmAux.executeQuery();
            if (!rsAux.next()) {
                try {
                    stmAvion = con.prepareStatement("insert into avion(codigo, modeloavion,aerolinea,anhofabricacion,retirado ) "
                            + "values (?,?,?,?,?)");
                    stmAvion.setString(1, codigo);
                    stmAvion.setString(2, modeloAvion.getNombre());
                    stmAvion.setString(3, aerolinea.getNombre());
                    stmAvion.setInt(4, anhoFabricacion);
                    stmAvion.setBoolean(5, false);

                    stmAvion.executeUpdate();
                    resultado = true;
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
                } finally {
                    try {
                        stmAvion.close();
                    } catch (SQLException e) {
                        System.out.println("Imposible cerrar cursores");
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAux.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void borrarModeloAvion(ModeloAvion modeloAvion) {
        Connection con;
        PreparedStatement stmModelo = null;
        PreparedStatement stmAux = null;
        ResultSet rsAux = null;
        con = super.getConexion();

        try {
            stmAux = con.prepareStatement("select * "
                    + "from modeloavion as ma, avion as a "
                    + "where ma.nombre = a.modeloavion "
                    + "and ma.nombre like ?");
            stmAux.setString(1, modeloAvion.getNombre());
            rsAux = stmAux.executeQuery();
            if (!rsAux.next()) {
                try {
                    stmModelo = con.prepareStatement("delete from modeloavion where nombre = ?");
                    stmModelo.setString(1, modeloAvion.getNombre());
                    stmModelo.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
                } finally {
                    try {
                        stmModelo.close();
                    } catch (SQLException e) {
                        System.out.println("Imposible cerrar cursores");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAux.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public boolean actualizarModeloAvion(ModeloAvion modeloAvion) {
        boolean update = false;
        boolean resultado = false;

        Connection con;
        PreparedStatement stmExiste = null;
        ResultSet rsExiste;
        PreparedStatement stmModelo = null;

        con = super.getConexion();

        try {
            String consulta = "select * from modeloavion where nombre = ?";
            stmExiste = con.prepareStatement(consulta);
            stmExiste.setString(1, modeloAvion.getNombre());
            rsExiste = stmExiste.executeQuery();
            if (rsExiste.next()) {
                consulta = "update modeloavion "
                        + "set nombre = ?, "
                        + "    capacidadnormal = ?, "
                        + "    capacidadpremium = ?, "
                        + "    consumo = ?, "
                        + "    empresafabricante = ? "
                        + "where nombre = ?";
                update = true;
            } else {
                consulta = "insert into modeloavion "
                        + "values (?,?,?,?,?)";
            }

            try {
                stmModelo = con.prepareStatement(consulta);
                stmModelo.setString(1, modeloAvion.getNombre());
                stmModelo.setInt(2, modeloAvion.getCapacidadNormal());
                stmModelo.setInt(3, modeloAvion.getCapacidadPremium());
                stmModelo.setFloat(4, modeloAvion.getConsumo());
                stmModelo.setString(5, modeloAvion.getEmpresaFabricante());
                if (update) {
                    stmModelo.setString(6, modeloAvion.getNombre());
                }
                stmModelo.executeUpdate();
                resultado = true;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmModelo.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmExiste.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
}
