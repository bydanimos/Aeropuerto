package aplicacion.servicios;

import aplicacion.aviones.Terminal;

public class Tienda {

    private Terminal terminal;
    private int codigo;
    private String tipoVentas;
    private String nombre;

    public Tienda(Terminal terminal, int codigo, String tipoVentas, String nombre) {
        this.terminal = terminal;
        this.codigo = codigo;
        this.tipoVentas = tipoVentas;
        this.nombre = nombre;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoVentas() {
        return tipoVentas;
    }

    public void setTipoVentas(String tipoVentas) {
        this.tipoVentas = tipoVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
