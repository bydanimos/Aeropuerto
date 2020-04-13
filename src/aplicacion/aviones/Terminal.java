package aplicacion.aviones;

public class Terminal {
    private int numero;
    private int primeraPuerta;
    private int ultimaPuerta;

    public Terminal(int numero, int primeraPuerta, int ultimaPuerta) {
        this.numero = numero;
        this.primeraPuerta = primeraPuerta;
        this.ultimaPuerta = ultimaPuerta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrimeraPuerta() {
        return primeraPuerta;
    }

    public void setPrimeraPuerta(int primeraPuerta) {
        this.primeraPuerta = primeraPuerta;
    }

    public int getUltimaPuerta() {
        return ultimaPuerta;
    }

    public void setUltimaPuerta(int ultimaPuerta) {
        this.ultimaPuerta = ultimaPuerta;
    }
}
