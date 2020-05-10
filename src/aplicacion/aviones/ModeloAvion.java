
package aplicacion.aviones;

public final class ModeloAvion {

    private String nombre;
    private Integer capacidadNormal;
    private Integer capacidadPremium;
    private Float consumo;
    private String empresaFabricante;
    private boolean eliminable;

    // ------------------------------------------------------------------------
    // ---------------------------- Constructores -----------------------------
    public ModeloAvion() {
        this.nombre = null;
        this.capacidadNormal = -1;
        this.capacidadPremium = -1;
        this.consumo = -1.0f;
        this.empresaFabricante = null;
        this.eliminable = true;
    }
    
    public ModeloAvion(String nombre, int capacidadNormal, int capacidadPremium, 
                       float consumo, String empresaFabricante) {
        this.nombre = nombre;
        this.capacidadNormal = capacidadNormal;
        this.capacidadPremium = capacidadPremium;
        this.consumo = consumo;
        this.empresaFabricante = empresaFabricante;
        this.eliminable = false;
    }
    
    public ModeloAvion(String nombre, int capacidadNormal, int capacidadPremium, 
                       float consumo, String empresaFabricante, boolean eliminable) {
        this.nombre = nombre;
        this.capacidadNormal = capacidadNormal;
        this.capacidadPremium = capacidadPremium;
        this.consumo = consumo;
        this.empresaFabricante = empresaFabricante;
        this.eliminable = eliminable;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public boolean isEliminable() {
        return eliminable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadNormal() {
        return capacidadNormal;
    }

    public int getCapacidadPremium() {
        return capacidadPremium;
    }

    public float getConsumo() {
        return consumo;
    }

    public String getEmpresaFabricante() {
        return empresaFabricante;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setEliminable(boolean eliminable) {
        this.eliminable = eliminable;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidadNormal(int capacidadNormal) {
        this.capacidadNormal = capacidadNormal;
    }

    public void setCapacidadPremium(int capacidadPremium) {
        this.capacidadPremium = capacidadPremium;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public void setEmpresaFabricante(String empresaFabricante) {
        this.empresaFabricante = empresaFabricante;
    }
}
