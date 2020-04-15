package aplicacion;

import aplicacion.usuarios.Usuario;

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
        return cu.comprobarAutentificacion(idUsuario, clave);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean comprobarDni(String dni) {
        return this.cd.dniCorrecto(dni);
    }
    
    
}
