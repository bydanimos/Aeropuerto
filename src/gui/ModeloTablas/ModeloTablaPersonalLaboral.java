
package gui.ModeloTablas;

import aplicacion.usuarios.PersonalLaboral;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public final class ModeloTablaPersonalLaboral extends AbstractTableModel {
    
    private List<PersonalLaboral> usuarios;
    
    // -------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public ModeloTablaPersonalLaboral() {
        this.usuarios = new ArrayList<>();
    }
    
    // -------------------------------------------------------------------------
    // ------------------------------ Overrides --------------------------------
    @Override
    public final int getRowCount() {
        return this.usuarios.size();
    }

    @Override
    public final int getColumnCount() {
        return 7;
    }

    @Override
    public final Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado = null;

        switch (columnIndex){
            case 0: resultado = this.usuarios.get(rowIndex).getDni(); break;
            case 1: resultado = this.usuarios.get(rowIndex).getNombre(); break;
            case 2: resultado = this.usuarios.get(rowIndex).getApellido1();break;
            case 3: resultado = this.usuarios.get(rowIndex).getApellido2(); break;
            case 4: resultado = this.usuarios.get(rowIndex).getLabor(); break;
            case 5: if (this.usuarios.get(rowIndex).isDeServicio())
                        resultado = "Sí";
                    else resultado = "No"; break; 
            case 6: 
                String aux;
                if (this.usuarios.get(rowIndex).isDeServicio()) {
                    aux = "" + this.usuarios.get(rowIndex).getFechaEntrada();
                    aux = aux.split(" ")[1];
                    aux = aux.substring(0,8) ;
                    resultado = aux;
                } else resultado = "-- -- --"; break; 
        }
        return resultado;
    }
    
    @Override
    public final String getColumnName(int col) {
        String nombre = null;

        switch (col){
            case 0: nombre = "DNI"; break;
            case 1: nombre = "Nombre"; break;
            case 2: nombre = "Apellido 1"; break;
            case 3: nombre = "Apellido 2"; break;
            case 4: nombre = "Labor"; break;
            case 5: nombre = "De servicio"; break;
            case 6: nombre = "Hora Entrada"; break;
        }
        return nombre;
    }
    
    @Override
    public final Class getColumnClass(int col) {
        Class clase = null;

        switch (col){
            case 0: clase = java.lang.String.class; break;
            case 1: clase = java.lang.String.class; break;
            case 2: clase = java.lang.String.class; break;
            case 3: clase = java.lang.String.class; break;
            case 4: clase = java.lang.String.class; break;
            case 5: clase = java.lang.String.class; break;
            case 6: clase = java.lang.String.class; break;
        }
        return clase;
    }
    
    // -------------------------------------------------------------------------
    // ------------------------------ Funciones --------------------------------
    public final void setFilas(List<PersonalLaboral> usuarios) {
        if (usuarios != null ) {
            this.usuarios = usuarios;
            fireTableDataChanged();
        }
    }
    
    public final PersonalLaboral obtenerPersonalLaboral(int i) {
        return this.usuarios.get(i);
    }
}
