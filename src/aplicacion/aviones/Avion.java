
package aplicacion.aviones;

import aplicacion.usuarios.TipoSexo;

public final class Avion {

    private ModeloAvion modeloAvion;
    private Aerolinea aerolinea;
    private String codigo;
    private int anhoFabricacion;
    private boolean retirado;
    private boolean retirable;

    // ------------------------------------------------------------------------
    // ---------------------------- Constructores -----------------------------
    public Avion(ModeloAvion modeloAvion, Aerolinea aerolinea, String codigo, 
                 int anhoFabricacion, boolean retirado) {
        this.modeloAvion = modeloAvion;
        this.aerolinea = aerolinea;
        this.codigo = codigo;
        this.anhoFabricacion = anhoFabricacion;
        this.retirado = retirado;
        this.retirable = false;
    }
    
    public Avion(ModeloAvion modeloAvion, Aerolinea aerolinea, String codigo, 
                 int anhoFabricacion, boolean retirado, boolean retirable) {
        this.modeloAvion = modeloAvion;
        this.aerolinea = aerolinea;
        this.codigo = codigo;
        this.anhoFabricacion = anhoFabricacion;
        this.retirado = retirado;
        this.retirable = retirable;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public ModeloAvion getModeloAvion() {
        return modeloAvion;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public boolean isRetirado() {
        return retirado;
    }

    public boolean isRetirable() {
        return retirable;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setModeloAvion(ModeloAvion modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAnhoFabricacion(int anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }

    public void setRetirable(boolean retirable) {
        this.retirable = retirable;
    }
}
