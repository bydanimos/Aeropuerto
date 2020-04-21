package aplicacion;

import aplicacion.vuelos.Vuelo;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.sql.Date;
import java.sql.Timestamp;

public class GestionVuelos {

    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionVuelos(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    public java.util.List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada){
        return this.fbd.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }
}
