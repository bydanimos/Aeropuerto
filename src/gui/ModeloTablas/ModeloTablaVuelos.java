
package gui.ModeloTablas;

import javax.swing.table.AbstractTableModel;
import aplicacion.vuelos.*;
import java.util.ArrayList;
import java.util.List;


public class ModeloTablaVuelos extends AbstractTableModel {
    
    private List<Vuelo> vuelos;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ModeloTablaVuelos() {
        this.vuelos = new ArrayList<>();
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    @Override
    public final int getRowCount() {
        return this.vuelos.size();
    }

    @Override
    public final int getColumnCount() {
        return 5;
    }

    @Override
    public final Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado=null;

        switch (columnIndex){
            case 0: resultado= this.vuelos.get(rowIndex).getNumeroVuelo(); break;
            case 1: resultado= this.vuelos.get(rowIndex).getOrigen();break;
            case 2: resultado= this.vuelos.get(rowIndex).getDestino(); break;
            case 3: resultado= this.vuelos.get(rowIndex).getFechaSalida(); break;
            case 4: resultado= this.vuelos.get(rowIndex).getFechaLlegada();break;
        }
        return resultado;
    }
    
    @Override
    public final String getColumnName(int col) {
        String nombre = null;

        switch (col){
            case 0: nombre= "Código"; break;
            case 1: nombre= "Origen"; break;
            case 2: nombre= "Destino"; break;
            case 3: nombre= "Fecha Salida"; break;
            case 4: nombre= "Fecha Llegada"; break;
        }
        return nombre;
    }
    
    @Override
    public final Class getColumnClass(int col) {
        Class clase = null;

        switch (col){
            case 0: clase = String.class; break;
            case 1: clase = String.class; break;
            case 2: clase = String.class; break;
            case 3: clase = java.sql.Timestamp.class; break;
            case 4: clase = java.sql.Timestamp.class; break;
        }
        return clase;
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------- Funciones --------------------------------
    public final void setFilas(java.util.List<Vuelo> vuelos) {
        if (vuelos != null ) {
            this.vuelos = vuelos;
            fireTableDataChanged();
        }
    }
    
    public final Vuelo obtenerVuelo(int i) {
        return this.vuelos.get(i);
    }
}
