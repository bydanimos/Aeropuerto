
package gui;

public class FachadaGui {
    private final aplicacion.FachadaAplicacion fa;
    private final VAdministrador vp;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public FachadaGui(aplicacion.FachadaAplicacion fa){
        this.fa = fa;
        this.vp = new VAdministrador(fa);
    } 
    
    // ------------------------------------------------------------------------
    // --------------------------- VAutentificacion ---------------------------
    public void iniciaVista(){
        VAutentificacion va;

        va = new VAutentificacion(this.vp, true, this.fa);
        this.vp.setVisible(true);
        va.setVisible(true);
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Excepcion -------------------------------
    public void muestraExcepcion(String txtExcepcion){
        VAviso va;

        va = new VAviso(this.vp, true, txtExcepcion);
        va.setVisible(true);
    }

    // ------------------------------------------------------------------------
    // ----------------------------- Registrarse ------------------------------
    public void nuevoUsuario() {
        VRegistrar vr;
        
        vr = new VRegistrar(this.fa);
        vr.setVisible(true);
    }
}