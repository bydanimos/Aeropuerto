package aplicacion;

import aplicacion.vuelos.Vuelo;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.sql.Timestamp;
import aplicacion.usuarios.TipoSexo;
import aplicacion.vuelos.TipoAsiento;
import java.util.List;
import aplicacion.aviones.Aerolinea;

public class GestionVuelos {

    private final FachadaGui fgui;
    private final FachadaBaseDatos fbd;

    // -------------------------------------------------------------------------
    // ------------------------------ Constructor ------------------------------
    public GestionVuelos(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    // -------------------------------------------------------------------------
    // --------------------------------- Vuelos --------------------------------
    public java.util.List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada){
        return this.fbd.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }
    
    public boolean guardarVuelo(Vuelo vuelo) {
        return this.fbd.guardarVuelo(vuelo);
    }
    
    //---------------------------------Estadísticas Vuelos------------------
    public Aerolinea getAerolineaVuelo(Vuelo vuelo){
        return this.fbd.getAerolineaVuelo(vuelo);
    }
    
    public String getNacionalidadMayoritariaVuelo(Vuelo vuelo){
        return this.fbd.getNacionalidadMayoritariaVuelo(vuelo);
    }
    public Integer getNTipoVuelo(Vuelo vuelo,TipoAsiento ta){
        return this.fbd.getNTipoVuelo(vuelo,ta);
    }
    public Integer getNSexoVuelo(Vuelo vuelo, TipoSexo ts){
        return this.fbd.getNSexoVuelo(vuelo,ts);
    }
    
    public List<Vuelo> obtenerVuelos(String origen,String destino,Timestamp tSalida){
        return this.fbd.obtenerVuelos(origen, destino,tSalida);
    }
    //----------------------------------------------------------------------
}
