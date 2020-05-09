package aplicacion.aviones;

import aplicacion.usuarios.TipoSexo;

public class Avion {

    private ModeloAvion modeloAvion;
    private Aerolinea aerolinea;
    private String codigo;
    private int anhoFabricacion;
    private boolean retirado;
    private boolean retirable;

    public Avion(ModeloAvion modeloAvion, Aerolinea aerolinea, String codigo, int anhoFabricacion, boolean retirado) {
        this.modeloAvion = modeloAvion;
        this.aerolinea = aerolinea;
        this.codigo = codigo;
        this.anhoFabricacion = anhoFabricacion;
        this.retirado = retirado;
        this.retirable = false;
    }
    
    public Avion(ModeloAvion modeloAvion, Aerolinea aerolinea, String codigo, int anhoFabricacion, boolean retirado, boolean retirable) {
        this.modeloAvion = modeloAvion;
        this.aerolinea = aerolinea;
        this.codigo = codigo;
        this.anhoFabricacion = anhoFabricacion;
        this.retirado = retirado;
        this.retirable = retirable;
    }

    public ModeloAvion getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(ModeloAvion modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(int anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    public boolean isRetirado() {
        return retirado;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }

    public boolean isRetirable() {
        return retirable;
    }

    public void setRetirable(boolean retirable) {
        this.retirable = retirable;
    }
    
}
