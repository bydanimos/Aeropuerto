package gui.ModeloTablas;

import javax.swing.table.AbstractTableModel;
import aplicacion.servicios.*;
import java.util.ArrayList;
import java.util.List;


public final class ModeloTablaCoches extends AbstractTableModel {
    
    private List<CocheAlquiler> coches;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ModeloTablaCoches() {
        this.coches = new ArrayList<>();
    }
    
    // ------------------------------------------------------------------------
    // -------------------------- Overrides Getters ---------------------------
    @Override
    public final int getRowCount() {
        return this.coches.size();
    }

    @Override
    public final int getColumnCount() {
        return 8;
    }

    @Override
    public final Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado=null;

        switch (columnIndex){
            case 0: resultado= this.coches.get(rowIndex).getMatricula(); break;
            case 1: resultado= this.coches.get(rowIndex).getModelo(); break;
            case 2: resultado= this.coches.get(rowIndex).getCaballos();break;
            case 3: resultado= this.coches.get(rowIndex).getPrecioPorDia(); break;
            case 4: resultado= this.coches.get(rowIndex).getTipoCombustible(); break;
            case 5: resultado= this.coches.get(rowIndex).getNumeroPlazas(); break;
            case 6: resultado= this.coches.get(rowIndex).getNumeroPuertas();break;
            case 7: 
                String text = "Disponible"; 
                if (this.coches.get(rowIndex).isRetirado()) {
                    text = "Retirado";
                } else {
                    if (this.coches.get(rowIndex).isAlquilado()) {
                        text = "Alquilado";
                    }
                    if (this.coches.get(rowIndex).isReservado()) {
                        text = "Reservado";
                    } 
                }
                resultado= text; break;
        }
        return resultado;
    }
    
    @Override
    public final String getColumnName(int col) {
        String nombre = null;

        switch (col){
            case 0: nombre= "Matrícula"; break;
            case 1: nombre= "Modelo"; break;
            case 2: nombre= "Caballos"; break;
            case 3: nombre= "Precio por Día"; break;
            case 4: nombre= "Tipo Combustible"; break;
            case 5: nombre= "Núm. Plazas"; break;
            case 6: nombre= "Núm. Puertas"; break;
            case 7: nombre= "Estado"; break;
        }
        return nombre;
    }
    
    @Override
    public final Class getColumnClass(int col) {
        Class clase = null;

        switch (col){
            case 0: clase = java.lang.String.class; break;
            case 1: clase = java.lang.String.class; break;
            case 2: clase = int.class; break;
            case 3: clase = float.class; break;
            case 4: clase = java.lang.String.class; break;
            case 5: clase = int.class; break;
            case 6: clase = int.class; break;
            case 7: clase = java.lang.String.class; break;
        }
        return clase;
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    public final void setFilas(java.util.List<CocheAlquiler> coches) {
        if (coches != null ) {
            this.coches = coches;
            fireTableDataChanged();
        }
    }
    
    public final CocheAlquiler obtenerCoche(int i) {
        return this.coches.get(i);
    }
    
    public final void borrarCoche(int i){
        CocheAlquiler e;
        e = this.coches.get(i);
        this.coches.remove(i);
        fireTableDataChanged();
    }
    
    public final void actualizarTabla() {
        fireTableDataChanged();
    }
    
    public final void nuevoCoche(CocheAlquiler co) {
        this.coches.add(co);
        fireTableRowsInserted(this.coches.size() - 1, this.coches.size() - 1);
    }
}
