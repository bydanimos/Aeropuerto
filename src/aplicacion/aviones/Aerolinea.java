
package aplicacion.aviones;

public final class Aerolinea {

    private String nombre;
    private String paisSede;
    private float precioBaseMaleta;
    private float pesoBaseMaleta;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public Aerolinea(String nombre, String paisSede, float precioBaseMaleta, float pesoBaseMaleta) {
        this.nombre = nombre;
        this.paisSede = paisSede;
        this.precioBaseMaleta = precioBaseMaleta;
        this.pesoBaseMaleta = pesoBaseMaleta;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public float getPrecioBaseMaleta() {
        return precioBaseMaleta;
    }

    public float getPesoBaseMaleta() {
        return pesoBaseMaleta;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public void setPrecioBaseMaleta(float precioBaseMaleta) {
        this.precioBaseMaleta = precioBaseMaleta;
    }

    public void setPesoBaseMaleta(float pesoBaseMaleta) {
        this.pesoBaseMaleta = pesoBaseMaleta;
    }
}
