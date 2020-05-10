
package aplicacion.servicios;

import aplicacion.usuarios.Usuario;
import java.sql.Timestamp;

public final class alquilarCocheAlquiler {

    private CocheAlquiler cocheAlquiler;
    private Usuario usuario;
    private Timestamp fechaAlquiler;
    private Timestamp fechaTeoricaDevolucion;
    private Timestamp fechaDevolucion;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public alquilarCocheAlquiler(CocheAlquiler cocheAlquiler, Usuario usuario, 
                                 Timestamp fechaAlquiler, Timestamp fechaTeoricaDevolucion, 
                                 Timestamp fechaDevolucion) {
        this.cocheAlquiler = cocheAlquiler;
        this.usuario = usuario;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaTeoricaDevolucion = fechaTeoricaDevolucion;
        this.fechaDevolucion = fechaDevolucion;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public CocheAlquiler getCocheAlquiler() {
        return cocheAlquiler;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Timestamp getFechaAlquiler() {
        return fechaAlquiler;
    }

    public Timestamp getFechaTeoricaDevolucion() {
        return fechaTeoricaDevolucion;
    }

    public Timestamp getFechaDevolucion() {
        return fechaDevolucion;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setCocheAlquiler(CocheAlquiler cocheAlquiler) {
        this.cocheAlquiler = cocheAlquiler;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaAlquiler(Timestamp fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaTeoricaDevolucion(Timestamp fechaTeoricaDevolucion) {
        this.fechaTeoricaDevolucion = fechaTeoricaDevolucion;
    }

    public void setFechaDevolucion(Timestamp fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
