
package gui;

import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import aplicacion.aviones.ModeloAvion;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class ModeloTablaAviones extends AbstractTableModel {
    private List<Avion> aviones;
    
    public ModeloTablaAviones() {
        this.aviones = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return this.aviones.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado=null;

        switch (columnIndex){
            case 0: resultado= this.aviones.get(rowIndex).getCodigo(); break;
            case 1: resultado= this.aviones.get(rowIndex).getModeloAvion().getNombre();break;
            case 2: resultado= this.aviones.get(rowIndex).getAerolinea().getNombre(); break;
            case 3: resultado= this.aviones.get(rowIndex).getAnhoFabricacion(); break;
        }
        return resultado;
    }
    
    @Override
    public String getColumnName(int col) {
        String nombre = null;

        switch (col){
            case 0: nombre= "Código"; break;
            case 1: nombre= "Modelo"; break;
            case 2: nombre= "Aerolínea"; break;
            case 3: nombre= "Año fabricación"; break;
        }
        return nombre;
    }
    
    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col){
            case 0: clase = String.class; break;
            case 1: clase = String.class; break;
            case 2: clase = String.class; break;
            case 3: clase = Integer.class; break;
        }
        return clase;
    }
    
    public void setFilas(java.util.List<Avion> aviones) {
        if (aviones != null ) {
            this.aviones = aviones;
            fireTableDataChanged();
        }
    }
    
    public Avion obtenerAvion(int i) {
        return this.aviones.get(i);
    }
}
