package aplicacion;

import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.util.List;

public class GestionAviones {

    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionAviones(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    public List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        return this.fbd.obtenerAviones(codigo, aerolinea, retirado);
    }
    
    public List<Aerolinea> obtenerAerolineas(String nombre){
        return this.fbd.obtenerAerolineas(nombre);
    }
    public void modificarAerolinea(Aerolinea aerolinea){
        this.fbd.modificarAerolinea(aerolinea);
    }
    
    public Aerolinea getAerolinea(String nombre){
        return this.fbd.getAerolinea(nombre);
    }
    
    public void anhadirAerolinea(Aerolinea aerolinea){
        this.fbd.anhadirAerolinea(aerolinea);
    }
    
    public void eliminarAerolineas(List<Aerolinea> aerolineas){
        this.fbd.eliminarAerolineas(aerolineas);
    }
    
    public boolean esAerolineaBorrable(Aerolinea aerolinea){
        return this.fbd.esAerolineaBorrable(aerolinea);
    }
}
