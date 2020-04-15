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

    public Boolean comprobarAutentificacion(String idUsuario, String clave) {
        Usuario u;

        if((u = fbd.validarAdministrador(idUsuario, clave)) != null){
            fbd.setUsuarioActual(u);
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
        fgui.nuevoUsuario();
    }
    
    public void registrarUsuario(Usuario usuario){
        fbd.registrarUsuario(usuario);
    }
}
