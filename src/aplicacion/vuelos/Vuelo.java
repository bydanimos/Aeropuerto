package aplicacion.vuelos;

import aplicacion.aviones.Terminal;
import aplicacion.aviones.Avion;

public class Vuelo {

    private Terminal terminal;
    private Avion avion;
    private String numeroVuelo;
    private String destino;
    private String origen;
    private Terminal fechaSalida;
    private Terminal fechaSalidaReal;
    private Terminal fechaLlegada;
    private Terminal fechaLlegadaReal;
    private float precioActual;
    private int puertaEmbarque;
    private boolean cancelado;

    public Vuelo(Terminal terminal, Avion avion, String numeroVuelo, String destino, String origen, Terminal fechaSalida,
                 Terminal fechaSalidaReal, Terminal fechaLlegada, Terminal fechaLlegadaReal, float precioActual,
                 int puertaEmbarque, boolean cancelado) {
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

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Terminal getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Terminal fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Terminal getFechaSalidaReal() {
        return fechaSalidaReal;
    }

    public void setFechaSalidaReal(Terminal fechaSalidaReal) {
        this.fechaSalidaReal = fechaSalidaReal;
    }

    public Terminal getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Terminal fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Terminal getFechaLlegadaReal() {
        return fechaLlegadaReal;
    }

    public void setFechaLlegadaReal(Terminal fechaLlegadaReal) {
        this.fechaLlegadaReal = fechaLlegadaReal;
    }

    public float getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(float precioActual) {
        this.precioActual = precioActual;
    }

    public float getPrecioPremium(){
        return this.precioActual * 1.3f;
    }

    public int getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(int puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
}
