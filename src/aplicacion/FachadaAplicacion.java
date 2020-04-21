package aplicacion;

import aplicacion.servicios.Tienda;
import aplicacion.usuarios.Usuario;
import aplicacion.vuelos.Vuelo;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class FachadaAplicacion {

    private final gui.FachadaGui fgui;
    private final baseDatos.FachadaBaseDatos fbd;
    private final GestionUsuarios cu;
    private final GestionServicios cs;
    private final GestionVuelos cv;
    private final GestionAviones ca;
    private final GestionDni cd;
    private Usuario usuarioActual;

    public FachadaAplicacion() {
        this.fgui = new gui.FachadaGui(this);
        this.fbd = new baseDatos.FachadaBaseDatos(this);
        this.cu = new GestionUsuarios(this.fgui, this.fbd);
        this.cs = new GestionServicios(this.fgui, this.fbd);
        this.cv = new GestionVuelos(this.fgui, this.fbd);
        this.ca = new GestionAviones(this.fgui, this.fbd);
        this.cd = new GestionDni();
    }

    public static void main(String args[]) {
        FachadaAplicacion fa;

        fa = new FachadaAplicacion();
        fa.iniciaInterfazUsuario();
    }

    public void iniciaInterfazUsuario() {
        this.fgui.iniciaVista();
    }

    public void muestraExcepcion(String e) {
        this.fgui.muestraExcepcion(e);
    }
    
    public boolean comprobarAutentificacion(String idUsuario, String clave) {
        return this.cu.comprobarAutentificacion(idUsuario, clave);
    }

    public Usuario getUsuarioActual() {
        return this.usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    
    public void nuevoUsuario() {
        this.cu.nuevoUsuario();
    }
    
    public boolean registrarUsuario(Usuario usuario){
        return this.cu.registrarUsuario(usuario);
    }

    public boolean comprobarId(String text) {
        return this.cu.comprobarId(text);
    }

    public boolean comprobarDni(String dni) {
        return this.cd.dniCorrecto(dni);
    }
    
    public java.util.List<Usuario> obtenerUsuarios(String dni, String id, String nombre, String primerApellido, String segundoApellido){
        return this.cu.obtenerUsuarios(dni,id,nombre,primerApellido,segundoApellido);
    }

    public List<Tienda> obtenerTiendas(String nombre, int terminal) {
        return this.cs.obtenerTiendas(nombre, terminal);
    }
    
    public List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada) {
        return this.cv.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }
    
    
}
