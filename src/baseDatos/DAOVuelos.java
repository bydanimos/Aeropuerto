/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.*;
import aplicacion.aviones.*;
import aplicacion.aviones.Terminal;
import aplicacion.vuelos.Vuelo;
import java.sql.*;

/**
 *
 * @author basesdatos
 */
public class DAOVuelos extends AbstractDAO {

    public DAOVuelos(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public java.util.List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada) {
        java.util.List<Vuelo> resultado = new java.util.ArrayList<Vuelo>();

        int a = 0,b=0;
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
            String consulta = "select * "
                    + "from vuelo as v, terminal as t, avion as a, modeloavion as ma, aerolinea as ae "
                    + "where v.terminal = t.numero and "
                    + "v.avion = a.codigo and "
                    + "a.modeloavion = ma.nombre and "
                    + "a.aerolinea = ae.nombre and "
                    + "numvuelo like ? "
                    + "and origen like ? "
                    + "and destino like ? ";
            if (fechaSalida != null) {
                consulta += "and cast(fechasalidateorica as DATE) = ? ";
                a ++;
            }
            if (fechaLlegada != null) {
                consulta += "and cast(fechallegadateorica as DATE) = ? ";
                b++;
            }

            stmVuelos = con.prepareStatement(consulta);
            stmVuelos.setString(1, "%" + codigo + "%");
            stmVuelos.setString(2, "%" + origen + "%");
            stmVuelos.setString(3, "%" + destino + "%");
            if (fechaSalida != null) {
                stmVuelos.setTimestamp(3+a, fechaSalida);
            }
            if (fechaLlegada != null) {
                stmVuelos.setTimestamp(3+a+b, fechaLlegada);
            }

            rsVuelos = stmVuelos.executeQuery();
            while (rsVuelos.next()) {

                terminalActual = new Terminal(rsVuelos.getInt("numero"), rsVuelos.getInt("primerapuerta"), rsVuelos.getInt("ultimapuerta"));
                modeloAvionActual = new ModeloAvion(rsVuelos.getString("nombre"), rsVuelos.getInt("capacidadnormal"),
                        rsVuelos.getInt("capacidadpremium"), rsVuelos.getFloat("consumo"), rsVuelos.getString("empresafabricante"));
                aerolineaActual = new Aerolinea(rsVuelos.getString("nombre"), rsVuelos.getString("paissede"),
                        rsVuelos.getFloat("preciobasemaleta"), rsVuelos.getFloat("pesobasemaleta"));
                avionActual = new Avion(modeloAvionActual, aerolineaActual, rsVuelos.getString("codigo"),
                        rsVuelos.getInt("anhofabricacion"), rsVuelos.getBoolean("retirado"));

                vueloActual = new Vuelo(terminalActual, avionActual, rsVuelos.getString("numvuelo"), rsVuelos.getString("destino"),
                        rsVuelos.getString("origen"), rsVuelos.getTimestamp("fechasalidateorica"), rsVuelos.getTimestamp("fechasalidareal"),
                        rsVuelos.getTimestamp("fechallegadateorica"), rsVuelos.getTimestamp("fechasalidareal"),
                        rsVuelos.getFloat("precioactual"), rsVuelos.getInt("puertaembarque"), rsVuelos.getBoolean("cancelado"));

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

    public boolean guardarVuelo(Vuelo vuelo) {
        boolean update = false;

        Connection con;
        PreparedStatement stmExiste = null;
        ResultSet rsExiste;
        PreparedStatement stmVuelo = null;

        con = super.getConexion();

        try {
            String consulta = "select * from vuelo where numvuelo = ?";
            stmExiste = con.prepareStatement(consulta);
            stmExiste.setString(1, vuelo.getNumeroVuelo());
            rsExiste = stmExiste.executeQuery();
            if (rsExiste.next()) {
                consulta = "update vuelo "
                        + "set numvuelo = ?, "
                        + "    origen = ?, "
                        + "    destino = ?, "
                        + "    fechasalidateorica = ?, "
                        + "    fechasalidareal = ?, "
                        + "    fechallegadateorica = ?, "
                        + "    fechallegadareal = ?, "
                        + "    precioactual = ?, "
                        + "    puertaembarque = ?, "
                        + "    cancelado = ?, "
                        + "    terminal = ?, "
                        + "    avion = ? "
                        + "where numvuelo = ?";
                update = true;
            } else {
                consulta = "insert into vuelo "
                        + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
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
                if(update) stmVuelo.setString(13, vuelo.getNumeroVuelo());
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
    
    //---------------------------------Estadísticas Vuelos------------------
    public Aerolinea getAerolineaVuelo(Vuelo vuelo){
        Aerolinea resultado = null;

        Connection con;
        PreparedStatement stmAerolinea = null;
        ResultSet rsAerolinea;

        con = this.getConexion();

        try {
            String consulta = "select nombre, paissede, preciobasemaleta, pesobasemaleta " +
                    "from aerolinea " +
                    "where nombre in (Select aerolinea "+
                                     "from avion " +
                                     "where codigo in (Select avion "+
                                                      "from vuelo " +
                                                      "where numvuelo = ? )) ";
            

            stmAerolinea = con.prepareStatement(consulta);
            stmAerolinea.setString(1, vuelo.getNumeroVuelo());
            

            rsAerolinea = stmAerolinea.executeQuery();
            if (rsAerolinea.next()) {
                resultado = new Aerolinea(rsAerolinea.getString("nombre"),rsAerolinea.getString("paissede"),rsAerolinea.getFloat("preciobasemaleta"),rsAerolinea.getFloat("pesobasemaleta"));
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
    
    
    public Integer getNSexoVuelo(Vuelo vuelo, TipoSexo ts){
        Integer resultado = 0;
        Connection con;
        PreparedStatement stmNum = null;
        ResultSet rsNum;
        String sexo;

        con = this.getConexion();

        try {
            String consulta = "select count(*) as num " +
                    "from comprarbillete " +
                    "where vuelo = ? " +
                    "and usuario in (Select dni "+
                                    "from usuario "+
                                    "where sexo = ? )";
            
            
            if(TipoSexo.h.equals(ts)){
                sexo = "h";
            }else if(TipoSexo.m.equals(ts)){
                sexo = "m";
            }else{
                sexo = "o";
            }

            stmNum = con.prepareStatement(consulta);
            stmNum.setString(1, vuelo.getNumeroVuelo());
            stmNum.setString(2, sexo);
            

            rsNum = stmNum.executeQuery();
            if(rsNum.next()){
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
    
    
    public Integer getNTipoVuelo(Vuelo vuelo,TipoAsiento ta){
        Integer resultado = 0;
        Connection con;
        PreparedStatement stmNum = null;
        ResultSet rsNum;
        String tipoAsiento;

        con = this.getConexion();

        try {
            String consulta = "select count(*) as num " +
                    "from comprarbillete " +
                    "where vuelo = ? " +
                    "and tipoasiento = ? ";
            
            
            if(TipoAsiento.Normal.equals(ta)){
                tipoAsiento = "normal";
            }else{
                tipoAsiento = "premium";
            }

            stmNum = con.prepareStatement(consulta);
            stmNum.setString(1, vuelo.getNumeroVuelo());
            stmNum.setString(2, tipoAsiento);
            

            rsNum = stmNum.executeQuery();
            if(rsNum.next()){
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
    
    public String getNacionalidadMayoritariaVuelo(Vuelo vuelo){
        String resultado = "";
        Connection con;
        PreparedStatement stmNum = null;
        ResultSet rsNum;

        con = this.getConexion();

        try {
            String consulta = "select paisprocedencia "+
                              "from usuario "+
                              "where dni in (select usuario "+
                                            "from comprarbillete "+
                                            "where vuelo = ?) " +
                              "group by paisprocedencia "+ 
                              "having count(*) >= all (select count(*) "+
                                                      "from usuario "+
                                                      "where dni in (select usuario "+
                                                                    "from comprarbillete "+
                                                                    "where vuelo = ?) "+
                                                      "group by paisprocedencia)";
            

            stmNum = con.prepareStatement(consulta);
            stmNum.setString(1, vuelo.getNumeroVuelo());
            stmNum.setString(2, vuelo.getNumeroVuelo());
            

            rsNum = stmNum.executeQuery();
            if(rsNum.next()){
                resultado = rsNum.getString("paisprocedencia");
                while(rsNum.next()){
                    resultado+="/" + rsNum.getString("paisprocedencia");
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
    
    
    //----------------------------------------------------------------------
}
