
package gui.ModeloTablas;

import aplicacion.aviones.Aerolinea;
import gui.Paneles.PAerolineas;
import javax.swing.table.AbstractTableModel;

public final class ModeloTablaAerolineas extends AbstractTableModel {
    
    private java.util.List<Aerolinea> aerolineas;
    private final PAerolineas pa;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ModeloTablaAerolineas(PAerolineas pa) {
        this.aerolineas=new java.util.ArrayList<>();
        this.pa = pa;
    }
    
    public ModeloTablaAerolineas() {
        this.aerolineas = new java.util.ArrayList<>();
        this.pa = null;
    }

    // ------------------------------------------------------------------------
    // -------------------------- Overrides Getters ---------------------------
    @Override
    public final int getColumnCount () {
        return 4;
    }

    @Override
    public final int getRowCount() {
        return this.aerolineas.size();
    }

    @Override
    public final String getColumnName(int col) {
        String nombre = "";

        switch (col){
            case 0: nombre = "Nombre"; break;
            case 1: nombre = "Pais"; break;
            case 2: nombre = "Precio Maleta"; break;
            case 3: nombre = "Peso Maleta"; break;
        }
        return nombre;
    }

    @Override
    public final Class getColumnClass(int col) {
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.Float.class; break;
            case 3: clase=java.lang.Float.class; break;
        }
        return clase;
    }

    @Override
    public final boolean isCellEditable(int row, int col) {
        return col > 0;
    }

    @Override
    public final Object getValueAt(int row, int col) {
        Object resultado=null;

        switch (col){
            case 0: resultado= this.aerolineas.get(row).getNombre(); break;
            case 1: resultado= this.aerolineas.get(row).getPaisSede();break;
            case 2: resultado= this.aerolineas.get(row).getPrecioBaseMaleta(); break;
            case 3: resultado= this.aerolineas.get(row).getPesoBaseMaleta(); break;
        }
        return resultado;
    }
    
    // ------------------------------------------------------------------------
    // -------------------------- Overrides Setters ---------------------------
    @Override
    public final void setValueAt(Object v, int row, int col) {
        switch (col){
            case 1: this.aerolineas.get(row).setPaisSede((String) v); break;
            case 2: this.aerolineas.get(row).setPrecioBaseMaleta((Float) v);break;
            case 3: this.aerolineas.get(row).setPesoBaseMaleta((Float) v);break;
        }
    }

    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    public final void setFilas(java.util.List<Aerolinea> aerolineas) {
        this.aerolineas = aerolineas;
        fireTableDataChanged();
    }

    public final Aerolinea obtenerAerolinea(int i) {
        return this.aerolineas.get(i);
    }
    
    public final void anhadirAerolinea(Aerolinea a) {
        this.aerolineas.add(a);
        fireTableRowsInserted(this.aerolineas.size()-1, this.aerolineas.size()-1);
    }
    
    public final void borrarAerolinea(int i) {
        this.aerolineas.remove(i);
        fireTableRowsDeleted(i, i);
    }
}
