package aplicacion;

import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import aplicacion.aviones.ModeloAvion;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.util.List;

public class GestionAviones {

    private final FachadaGui fgui;
    private final FachadaBaseDatos fbd;

    // -------------------------------------------------------------------------
    // ------------------------------- Constructor -----------------------------
    public GestionAviones(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Aviones -------------------------------
    public List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        return this.fbd.obtenerAviones(codigo, aerolinea, retirado);
    }
      
    public boolean actualizarAviones(List<Avion> aviones) {
        for (Avion avion : aviones) {
            if(!this.fbd.actualizarAvion(avion))
                return false;
        }
        return true;
    }
    
    public boolean añadirAvion(String codigo, Aerolinea aerolinea, ModeloAvion modeloAvion, int anhoFabricacion){
        return this.fbd.añadirAvion(codigo, aerolinea, modeloAvion, anhoFabricacion);
    }
    
    // -------------------------------------------------------------------------
    // -------------------------------- Aerolíneas -----------------------------
    public List<Aerolinea> obtenerAerolineas(String nombre) {
        return this.fbd.obtenerAerolineas(nombre);
    }
    public void modificarAerolinea(Aerolinea aerolinea) {
        this.fbd.modificarAerolinea(aerolinea);
    }
    
    public Aerolinea getAerolinea(String nombre) {
        return this.fbd.getAerolinea(nombre);
    }
    
    public void anhadirAerolinea(Aerolinea aerolinea) {
        this.fbd.anhadirAerolinea(aerolinea);
    }
    
    public void eliminarAerolineas(List<Aerolinea> aerolineas) {
        this.fbd.eliminarAerolineas(aerolineas);
    }
    
    public boolean esAerolineaBorrable(Aerolinea aerolinea) {
        return this.fbd.esAerolineaBorrable(aerolinea);
    }
        
    // -------------------------------------------------------------------------
    // ----------------------------- Modelos Aviones ---------------------------
    public List<ModeloAvion> obtenerModelosAvion(String nombre) {
        return this.fbd.obtenerModelosAvion(nombre);
    }
    
    public boolean actualizarModelosAvion(List<ModeloAvion> modelosAvion) {
        for(ModeloAvion modelo : modelosAvion){
            if(!this.fbd.actualizarModeloAvion(modelo)){
                return false;
            }
        }
        return true;
    }
    
    public void borrarModeloAvion(ModeloAvion modeloAvion){
        this.fbd.borrarModeloAvion(modeloAvion);
    }
}
