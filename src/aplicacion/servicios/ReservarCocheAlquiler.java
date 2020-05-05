package aplicacion.servicios;

import aplicacion.usuarios.Usuario;

import java.sql.Timestamp;

public class ReservarCocheAlquiler {

    private CocheAlquiler cocheAlquiler;
    private Usuario usuario;
    private Timestamp fechaInicioReserva;
    private Timestamp fechaFinReserva;

    public ReservarCocheAlquiler(CocheAlquiler cocheAlquiler, Usuario usuario, Timestamp fechaInicioReserva, Timestamp fechaFinReserva) {
        this.cocheAlquiler = cocheAlquiler;
        this.usuario = usuario;
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
    }

    public CocheAlquiler getCocheAlquiler() {
        return cocheAlquiler;
    }

    public void setCocheAlquiler(CocheAlquiler cocheAlquiler) {
        this.cocheAlquiler = cocheAlquiler;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Timestamp getFechaInicioReserva() {
        return fechaInicioReserva;
    }

    public void setFechaInicioReserva(Timestamp fechaInicioReserva) {
        this.fechaInicioReserva = fechaInicioReserva;
    }

    public Timestamp getFechaFinReserva() {
        return fechaFinReserva;
    }

    public void setFechaFinReserva(Timestamp fechaFinReserva) {
        this.fechaFinReserva = fechaFinReserva;
    }
}
