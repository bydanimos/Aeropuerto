
package aplicacion.servicios;

import aplicacion.aviones.Terminal;

public final class Parking {

    private Terminal terminal;
    private int piso;
    private int numeroPlazas;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public Parking(Terminal terminal, int piso, int numeroPlazas) {
        this.terminal = terminal;
        this.piso = piso;
        this.numeroPlazas = numeroPlazas;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public Terminal getTerminal() {
        return terminal;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
