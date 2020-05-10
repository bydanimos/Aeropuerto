
package aplicacion.servicios;

import aplicacion.usuarios.Usuario;
import java.sql.Timestamp;

public final class ReservarParking {

    private Usuario usuario;
    private Parking parking;
    private Timestamp fechaEntrada;
    private Timestamp fechaSalida;
    private String matricula;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ReservarParking(Usuario usuario, Parking parking, Timestamp fechaEntrada, 
                           Timestamp fechaSalida, String matricula) {
        this.usuario = usuario;
        this.parking = parking;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.matricula = matricula;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public Usuario getUsuario() {
        return usuario;
    }

    public Parking getParking() {
        return parking;
    }

    public Timestamp getFechaEntrada() {
        return fechaEntrada;
    }

    public Timestamp getFechaSalida() {
        return fechaSalida;
    }

    public String getMatricula() {
        return matricula;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public void setFechaEntrada(Timestamp fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
