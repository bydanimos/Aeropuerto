package aplicacion;

import aplicacion.aviones.Terminal;
import aplicacion.servicios.CocheAlquiler;
import aplicacion.servicios.Tienda;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.util.ArrayList;
import java.util.List;

public class GestionServicios {

    private final FachadaGui fgui;
    private final FachadaBaseDatos fbd;
    
    //--------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public GestionServicios(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    //--------------------------------------------------------------------------
    // ------------------------------- Tiendas ---------------------------------
    public List<Tienda> obtenerTiendas(String nombre, int codigo, int terminal) {
        return this.fbd.obtenerTiendas(nombre, codigo, terminal);
    }

    public void anhadirTienda(String nombre, int terminal, String tipo) {
        this.fbd.anhadirTienda(nombre, terminal, tipo);
    }

    public void borrarTienda(int terminal, int codigo) {
        this.fbd.borrarTienda(terminal, codigo);
    }

    public void editarTienda(int terminal, int codigo, String nombre, String tipo) {
        this.fbd.editarTienda(terminal, codigo, nombre, tipo);
    }

    //--------------------------------------------------------------------------
    // ----------------------------- Terminales --------------------------------
    public ArrayList<Terminal> obtenerTerminales() {
        return this.fbd.obtenerTerminales();
    }

    //--------------------------------------------------------------------------
    // -------------------------------- Coches -----------------------------------
    public ArrayList<CocheAlquiler> obtenerCoches(String matricula, int numPlazas, String modelo) {
        return this.fbd.obtenerCoches(matricula, numPlazas, modelo);
    }

    public void borrarCocheAlquiler(String matricula) {
        this.fbd.borrarCocheAlquiler(matricula);
    }

    public void insertarCocheAlquiler(CocheAlquiler co) {
        this.fbd.insertarCocheAlquiler(co);
    }
}
