
package aplicacion.aviones;

public final class Terminal {
    
    private int numero;
    private int primeraPuerta;
    private int ultimaPuerta;

    // ------------------------------------------------------------------------
    // ---------------------------- Constructores -----------------------------
    public Terminal() {
        this.numero = 0;
        this.primeraPuerta = 0;
        this.ultimaPuerta = 0;
    }
    
    public Terminal(int numero, int primeraPuerta, int ultimaPuerta) {
        this.numero = numero;
        this.primeraPuerta = primeraPuerta;
        this.ultimaPuerta = ultimaPuerta;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public int getNumero() {
        return numero;
    }

    public int getPrimeraPuerta() {
        return primeraPuerta;
    }

    public int getUltimaPuerta() {
        return ultimaPuerta;
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrimeraPuerta(int primeraPuerta) {
        this.primeraPuerta = primeraPuerta;
    }

    public void setUltimaPuerta(int ultimaPuerta) {
        this.ultimaPuerta = ultimaPuerta;
    }
}
