package aplicacion.vuelos;

import aplicacion.usuarios.Usuario;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Billete {
    private Vuelo vuelo;
    private Usuario usuario;
    private Timestamp fechaCompra;
    private int numeroAsiento;
    private float precioBillete;
    private TipoAsiento tipoAsiento;
    private ArrayList<Maleta> maletasReservadas;
    private boolean tenerAcompañante;
    private boolean pasarControl;

    public Billete(Vuelo vuelo, Usuario usuario, Timestamp fechaCompra, int numeroAsiento, float precioBillete, TipoAsiento tipoAsiento, ArrayList<Maleta> maletasReservadas) {
        this.vuelo = vuelo;
        this.usuario = usuario;
        this.fechaCompra = fechaCompra;
        this.numeroAsiento = numeroAsiento;
        this.precioBillete = precioBillete;
        this.tipoAsiento = tipoAsiento;
        this.maletasReservadas = maletasReservadas;
        this.tenerAcompañante = false;
        this.pasarControl = false;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public float getPrecioBillete() {
        return precioBillete;
    }

    public void setPrecioBillete(float precioBillete) {
        this.precioBillete = precioBillete;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public ArrayList<Maleta> getMaletasReservadas() {
        return maletasReservadas;
    }

    public void setMaletasReservadas(ArrayList<Maleta> maletasReservadas) {
        this.maletasReservadas = maletasReservadas;
    }

    public boolean isTenerAcompañante() {
        return tenerAcompañante;
    }

    public void setTenerAcompañante(boolean tenerAcompañante) {
        this.tenerAcompañante = tenerAcompañante;
    }

    public boolean isPasarControl() {
        return pasarControl;
    }

    public void setPasarControl(boolean pasarControl) {
        this.pasarControl = pasarControl;
    }

    public int getNumeroMaletas(){
        return this.maletasReservadas.size();
    }

    public float getPrecioTotal(){
        return this.precioBillete + (this.getNumeroMaletas() * this.vuelo.getAvion().getAerolinea().getPrecioBaseMaleta());
    }
}
