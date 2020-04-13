package aplicacion.aviones;

public class ModeloAvion {

    private String nombre;
    private int capacidadNormal;
    private int capacidadPremium;
    private float consumo;
    private String empresaFabricante;

    public ModeloAvion(String nombre, int capacidadNormal, int capacidadPremium, float consumo, String empresaFabricante) {
        this.nombre = nombre;
        this.capacidadNormal = capacidadNormal;
        this.capacidadPremium = capacidadPremium;
        this.consumo = consumo;
        this.empresaFabricante = empresaFabricante;
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
