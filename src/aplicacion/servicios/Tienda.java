
package aplicacion.servicios;

import aplicacion.aviones.Terminal;

public final class Tienda {

    private Terminal terminal;
    private int codigo;
    private String tipoVentas;
    private String nombre;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public Tienda(Terminal terminal, int codigo, String tipoVentas, String nombre) {
        this.terminal = terminal;
        this.codigo = codigo;
        this.tipoVentas = tipoVentas;
        this.nombre = nombre;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public Terminal getTerminal() {
        return terminal;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipoVentas() {
        return tipoVentas;
    }

    public String getNombre() {
        return nombre;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTipoVentas(String tipoVentas) {
        this.tipoVentas = tipoVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
