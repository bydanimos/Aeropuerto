package aplicacion;

import aplicacion.servicios.Tienda;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.util.List;

public class GestionServicios {

    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionServicios(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    public List<Tienda> obtenerTiendas(String nombre, int terminal) {
        return this.fbd.obtenerTiendas(nombre, terminal);
    }
}
