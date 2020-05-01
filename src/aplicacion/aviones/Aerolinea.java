package aplicacion.aviones;

public class Aerolinea {

    private String nombre;
    private String paisSede;
    private float precioBaseMaleta;
    private float pesoBaseMaleta;

    public Aerolinea(String nombre, String paisSede, float precioBaseMaleta, float pesoBaseMaleta) {
        this.nombre = nombre;
        this.paisSede = paisSede;
        this.precioBaseMaleta = precioBaseMaleta;
        this.pesoBaseMaleta = pesoBaseMaleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public float getPrecioBaseMaleta() {
        return precioBaseMaleta;
    }

    public void setPrecioBaseMaleta(float precioBaseMaleta) {
        this.precioBaseMaleta = precioBaseMaleta;
    }

    public float getPesoBaseMaleta() {
        return pesoBaseMaleta;
    }

    public void setPesoBaseMaleta(float pesoBaseMaleta) {
        this.pesoBaseMaleta = pesoBaseMaleta;
    }
}
