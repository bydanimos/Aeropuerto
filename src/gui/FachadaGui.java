
package gui;

import aplicacion.*;

public class FachadaGui {
    aplicacion.FachadaAplicacion fa;
    VAdministrador vp;
    
    public FachadaGui(aplicacion.FachadaAplicacion fa){
        this.fa=fa;
        this.vp = new VAdministrador(fa);
    } 
    
    public void iniciaVista(){
        VAutentificacion va;

        va = new VAutentificacion(this.vp, true, this.fa);
        this.vp.setVisible(true);
        va.setVisible(true);
    }
    
    public void muestraExcepcion(String txtExcepcion){
        VAviso va;

        va = new VAviso(this.vp, true, txtExcepcion);
        va.setVisible(true);
    }

    public void nuevoUsuario() {
        VRegistrar vr;
        
        vr = new VRegistrar(this.fa);
        vr.setVisible(true);
    }
}