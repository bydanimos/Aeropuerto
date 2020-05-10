
package gui.ModeloTablas;

import javax.swing.table.AbstractTableModel;
import aplicacion.servicios.*;
import java.util.ArrayList;
import java.util.List;


public final class ModeloTablaTiendas extends AbstractTableModel {
    
    private List<Tienda> tiendas;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ModeloTablaTiendas() {
        this.tiendas = new ArrayList<>();
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Overrides -------------------------------
    @Override
    public final int getRowCount() {
        return this.tiendas.size();
    }

    @Override
    public final int getColumnCount() {
        return 4;
    }

    @Override
    public final Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado=null;

        switch (columnIndex){
            case 0: resultado= this.tiendas.get(rowIndex).getTerminal().getNumero(); break;
            case 1: resultado= this.tiendas.get(rowIndex).getCodigo(); break;
            case 2: resultado= this.tiendas.get(rowIndex).getNombre();break;
            case 3: resultado= this.tiendas.get(rowIndex).getTipoVentas(); break;
        }
        return resultado;
    }
    
    @Override
    public final String getColumnName(int col) {
        String nombre = null;

        switch (col){
            case 0: nombre= "Terminal"; break;
            case 1: nombre= "Código"; break;
            case 2: nombre= "Nombre"; break;
            case 3: nombre= "Tipo"; break;
        }
        return nombre;
    }
    
    @Override
    public final Class getColumnClass(int col) {
        Class clase = null;

        switch (col){
            case 0: clase = int.class; break;
            case 1: clase = int.class; break;
            case 2: clase = java.lang.String.class; break;
            case 3: clase = java.lang.String.class; break;
        }
        return clase;
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------- Funciones --------------------------------
    public final void setFilas(java.util.List<Tienda> tiendas) {
        if (tiendas != null ) {
            this.tiendas = tiendas;
            fireTableDataChanged();
        }
    }
    
    public final Tienda obtenerTienda(int i) {
        return this.tiendas.get(i);
    }
    
    public final void borrarTienda(int i){
        Tienda e;
        e = this.tiendas.get(i);
        this.tiendas.remove(i);
        fireTableDataChanged();
    }
    
    public final void actualizarTabla() {
        fireTableDataChanged();
    }
}
