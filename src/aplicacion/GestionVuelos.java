package aplicacion;

import aplicacion.vuelos.Vuelo;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.sql.Timestamp;

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
}
