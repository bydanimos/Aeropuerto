package aplicacion.servicios;

import aplicacion.usuarios.Usuario;

import java.sql.Timestamp;

public class ReservarParking {

    private Usuario usuario;
    private Parking parking;
    private Timestamp fechaEntrada;
    private Timestamp fechaSalida;
    private String matricula;

    public ReservarParking(Usuario usuario, Parking parking, Timestamp fechaEntrada, Timestamp fechaSalida, String matricula) {
        this.usuario = usuario;
        this.parking = parking;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.matricula = matricula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public Timestamp getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Timestamp fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Timestamp getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
