
package aplicacion.vuelos;

import aplicacion.aviones.Terminal;
import aplicacion.aviones.Avion;
import java.sql.Timestamp;

public class Vuelo {

    private Terminal terminal;
    private Avion avion;
    private String numeroVuelo;
    private String destino;
    private String origen;
    private java.sql.Timestamp fechaSalida;
    private java.sql.Timestamp fechaSalidaReal;
    private java.sql.Timestamp fechaLlegada;
    private java.sql.Timestamp fechaLlegadaReal;
    private float precioActual;
    private int puertaEmbarque;
    private boolean cancelado;

    // -------------------------------------------------------------------------
    // ------------------------------- Constructor -----------------------------
    public Vuelo(Terminal terminal, Avion avion, String numeroVuelo, String destino, String origen, 
                 Timestamp fechaSalida, Timestamp fechaSalidaReal, Timestamp fechaLlegada, 
                 Timestamp fechaLlegadaReal, float precioActual, int puertaEmbarque, boolean cancelado) {
        this.terminal = terminal;
        this.avion = avion;
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.origen = origen;
        this.fechaSalida = fechaSalida;
        this.fechaSalidaReal = fechaSalidaReal;
        this.fechaLlegada = fechaLlegada;
        this.fechaLlegadaReal = fechaLlegadaReal;
        this.precioActual = precioActual;
        this.puertaEmbarque = puertaEmbarque;
        this.cancelado = cancelado;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Getters -------------------------------
    public Terminal getTerminal() {
        return terminal;
    }

    public Avion getAvion() {
        return avion;
    }
    
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }

    public Timestamp getFechaSalida() {
        return fechaSalida;
    }

    public Timestamp getFechaSalidaReal() {
        return fechaSalidaReal;
    }
    
    public Timestamp getFechaLlegada() {
        return fechaLlegada;
    }

    public Timestamp getFechaLlegadaReal() {
        return fechaLlegadaReal;
    }
    
    public float getPrecioActual() {
        return precioActual;
    }
    
    public int getPuertaEmbarque() {
        return puertaEmbarque;
    }
    
    public boolean isCancelado() {
        return cancelado;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Setters -------------------------------
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaSalidaReal(Timestamp fechaSalidaReal) {
        this.fechaSalidaReal = fechaSalidaReal;
    }

    public void setFechaLlegada(Timestamp fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setFechaLlegadaReal(Timestamp fechaLlegadaReal) {
        this.fechaLlegadaReal = fechaLlegadaReal;
    }

    public void setPrecioActual(float precioActual) {
        this.precioActual = precioActual;
    }

    public void setPuertaEmbarque(int puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    } 
}
