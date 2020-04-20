package aplicacion;

import aplicacion.usuarios.*;
import aplicacion.aviones.*;
import aplicacion.servicios.*;
import aplicacion.vuelos.*;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;

public class GestionUsuarios {

    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionUsuarios(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

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
    
    public void nuevoUsuario() {
        this.fgui.nuevoUsuario();
    }
    
    public boolean registrarUsuario(Usuario usuario){
        return this.fbd.registrarUsuario(usuario);
    }
    
    public java.util.List<Usuario> obtenerUsuarios(String dni, String id, String nombre, String primerApellido, String segundoApellido){
        return this.fbd.consultarRegistroUsuarios(id,dni,nombre,primerApellido,segundoApellido);
    }

    boolean comprobarId(String text) {
        return this.fbd.comprobarId(text);
    }
}
