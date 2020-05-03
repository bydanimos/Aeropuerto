
package gui.ModeloTablas;

import aplicacion.usuarios.PersonalLaboral;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dani
 */
public class ModeloTablaEstadisticasTrabajadores extends AbstractTableModel {
    private List<PersonalLaboral> usuarios;
    
    // -------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public ModeloTablaEstadisticasTrabajadores() {
        this.usuarios = new ArrayList<>();
    }
    
    // -------------------------------------------------------------------------
    // ------------------------------ Overrides --------------------------------
    @Override
    public int getRowCount() {
        return this.usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado = null;

        switch (columnIndex){
            case 0: resultado = this.usuarios.get(rowIndex).getDni(); break;
            case 1: resultado = this.usuarios.get(rowIndex).getNombre(); break;
            case 2: resultado = this.usuarios.get(rowIndex).getApellido1();break;
            case 3: resultado = this.usuarios.get(rowIndex).getApellido2(); break;
            case 4: resultado = this.usuarios.get(rowIndex).getHorasSemana(); break;
            case 5: resultado = this.usuarios.get(rowIndex).getHorasMes(); break; 
            case 6: resultado = this.usuarios.get(rowIndex).getHorasAnho(); break; 
        }
        return resultado;
    }
    
    @Override
    public String getColumnName(int col) {
        String nombre = null;

        switch (col){
            case 0: nombre = "DNI"; break;
            case 1: nombre = "Nombre"; break;
            case 2: nombre = "Apellido 1"; break;
            case 3: nombre = "Apellido 2"; break;
            case 4: nombre = "Horas Semana"; break;
            case 5: nombre = "Horas Mes"; break;
            case 6: nombre = "Horas Año"; break;
        }
        return nombre;
    }
    
    @Override
    public Class getColumnClass(int col) {
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
    public void setFilas(List<PersonalLaboral> usuarios) {
        if (usuarios != null ) {
            this.usuarios = usuarios;
            fireTableDataChanged();
        }
    }
    
    public void anhadirFilas(List<PersonalLaboral> usuarios) {
        if (usuarios != null ) {
            this.usuarios.addAll(usuarios);
            fireTableDataChanged();
        }
    } 
    
    public PersonalLaboral obtenerUsuario(int i) {
        if (i > 0 && i < this.usuarios.size()) {
            return this.usuarios.get(i);
        }
        return null;
    }
}
