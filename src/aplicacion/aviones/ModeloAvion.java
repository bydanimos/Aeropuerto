package aplicacion.aviones;

public class ModeloAvion {

    private String nombre;
    private Integer capacidadNormal;
    private Integer capacidadPremium;
    private Float consumo;
    private String empresaFabricante;
    private boolean eliminable;

    public ModeloAvion() {
        this.nombre = null;
        this.capacidadNormal = -1;
        this.capacidadPremium = -1;
        this.consumo = -1.0f;
        this.empresaFabricante = null;
        this.eliminable = true;
    }
    
    public ModeloAvion(String nombre, int capacidadNormal, int capacidadPremium, float consumo, String empresaFabricante) {
        this.nombre = nombre;
        this.capacidadNormal = capacidadNormal;
        this.capacidadPremium = capacidadPremium;
        this.consumo = consumo;
        this.empresaFabricante = empresaFabricante;
        this.eliminable = false;
    }
    
    public ModeloAvion(String nombre, int capacidadNormal, int capacidadPremium, float consumo, String empresaFabricante, boolean eliminable) {
        this.nombre = nombre;
        this.capacidadNormal = capacidadNormal;
        this.capacidadPremium = capacidadPremium;
        this.consumo = consumo;
        this.empresaFabricante = empresaFabricante;
        this.eliminable = eliminable;
    }

    public boolean isEliminable() {
        return eliminable;
    }

    public void setEliminable(boolean eliminable) {
        this.eliminable = eliminable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadNormal() {
        return capacidadNormal;
    }

    public void setCapacidadNormal(int capacidadNormal) {
        this.capacidadNormal = capacidadNormal;
    }

    public int getCapacidadPremium() {
        return capacidadPremium;
    }

    public void setCapacidadPremium(int capacidadPremium) {
        this.capacidadPremium = capacidadPremium;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String getEmpresaFabricante() {
        return empresaFabricante;
    }

    public void setEmpresaFabricante(String empresaFabricante) {
        this.empresaFabricante = empresaFabricante;
    }
}
