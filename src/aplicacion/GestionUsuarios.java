package aplicacion;

import aplicacion.usuarios.*;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;

public class GestionUsuarios {

    private final FachadaGui fgui;
    private final FachadaBaseDatos fbd;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public GestionUsuarios(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Acceder --------------------------------
    public boolean comprobarAutentificacion(String idUsuario, String clave) {
        Usuario u;

        if((u = this.fbd.validarAdministrador(idUsuario, clave)) != null){
            this.fbd.setUsuarioActual(u);
            return true;
        } 
//        else if((u = fbd.validarPersonalLaboral(idUsuario, clave)) != null){
//            fbd.setUsuarioActual(u);
//            return true;
//        }else if((u = fbd.validarPersonalExterno(idUsuario, clave)) != null){
//            fbd.setUsuarioActual(u);
//            return true;
//        } else if((u = fbd.validarUsuario(idUsuario, clave)) != null){
//            fbd.setUsuarioActual(u);
//            return true;
//        } 
        else{
            return false;
        }
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Registrar -------------------------------
    public void nuevoUsuario() {
        this.fgui.nuevoUsuario();
    }

    public boolean comprobarId(String text) {
        return this.fbd.comprobarId(text);
    }
    
    public boolean registrarUsuario(Usuario usuario){
        return this.fbd.registrarUsuario(usuario);
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Usuarios --------------------------------
    public java.util.List<Usuario> obtenerUsuarios(String dni, String id, String nombre, String primerApellido, String segundoApellido){
        return this.fbd.consultarRegistroUsuarios(id,dni,nombre,primerApellido,segundoApellido);
    }

    public String getTipoUsuario(Usuario u){
        return fbd.getTipoUsuario(u);
    }
    
    public void modificarUsuario(Usuario u, String tipoAnterior, String tipoNuevo){
        this.fbd.modificarUsuarioGeneral(u,tipoAnterior,tipoNuevo);
    }
    
    public java.util.List<Usuario> obtenerUsuariosControl(String dni, String id, String nombre, String primerApellido, String segundoApellido){
        return this.fbd.obtenerUsuariosControl(dni,id,nombre,primerApellido,segundoApellido);
    }
    
    public boolean borrarUsuario(Usuario u){
        return this.fbd.borrarUsuario(u.getDni());
    }
}
