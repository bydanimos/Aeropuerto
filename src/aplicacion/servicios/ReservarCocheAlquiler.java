package aplicacion.servicios;

import aplicacion.usuarios.Usuario;

import java.sql.Timestamp;

public final class ReservarCocheAlquiler {

    private CocheAlquiler cocheAlquiler;
    private Usuario usuario;
    private Timestamp fechaInicioReserva;
    private Timestamp fechaFinReserva;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ReservarCocheAlquiler(CocheAlquiler cocheAlquiler, Usuario usuario, 
                                 Timestamp fechaInicioReserva, Timestamp fechaFinReserva) {
        this.cocheAlquiler = cocheAlquiler;
        this.usuario = usuario;
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public CocheAlquiler getCocheAlquiler() {
        return cocheAlquiler;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Timestamp getFechaInicioReserva() {
        return fechaInicioReserva;
    }

    public Timestamp getFechaFinReserva() {
        return fechaFinReserva;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setCocheAlquiler(CocheAlquiler cocheAlquiler) {
        this.cocheAlquiler = cocheAlquiler;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaInicioReserva(Timestamp fechaInicioReserva) {
        this.fechaInicioReserva = fechaInicioReserva;
    }

    public void setFechaFinReserva(Timestamp fechaFinReserva) {
        this.fechaFinReserva = fechaFinReserva;
    }
}
