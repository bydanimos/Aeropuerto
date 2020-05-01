package aplicacion.servicios;

import aplicacion.aviones.Terminal;

public class Parking {

    private Terminal terminal;
    private int piso;
    private int numeroPlazas;

    public Parking(Terminal terminal, int piso, int numeroPlazas) {
        this.terminal = terminal;
        this.piso = piso;
        this.numeroPlazas = numeroPlazas;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
