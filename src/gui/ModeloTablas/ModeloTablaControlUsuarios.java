
package gui.ModeloTablas;

import aplicacion.usuarios.*;
import gui.Paneles.PAdminUsuarios;
import javax.swing.table.AbstractTableModel;


public final class ModeloTablaControlUsuarios extends AbstractTableModel {
    
    private java.util.List<Usuario> usuarios;
    private final PAdminUsuarios pa;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ModeloTablaControlUsuarios(PAdminUsuarios pa) {
        this.usuarios=new java.util.ArrayList<>();
        this.pa = pa;
    }

    // ------------------------------------------------------------------------
    // ------------------------------ Overrides -------------------------------
    @Override
    public final int getColumnCount (){
        return 7;
    }

    @Override
    public final int getRowCount(){
        return usuarios.size();
    }

    @Override
    public final String getColumnName(int col){
        String nombre = "";

        switch (col){
            case 0: nombre = "DNI"; break;
            case 1: nombre = "ID"; break;
            case 2: nombre = "Nombre"; break;
            case 3: nombre = "Apellido 1"; break;
            case 4: nombre ="Apellido 2"; break;
            case 5: nombre = "Tipo"; break;
            case 6: nombre = "Telefono"; break;
        }
        return nombre;
    }

    @Override
    public final Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.String.class; break;
            case 3: clase=java.lang.String.class; break;
            case 4: clase=java.lang.String.class; break;
            case 5: clase=java.lang.String.class; break;
            case 6: clase=java.lang.Integer.class; break;
        }
        return clase;
    }

    @Override
    public final boolean isCellEditable(int row, int col){
        return false;
    }

    @Override
    public final Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= this.usuarios.get(row).getDni(); break;
            case 1: resultado= this.usuarios.get(row).getId();break;
            case 2: resultado= this.usuarios.get(row).getNombre(); break;
            case 3: resultado= this.usuarios.get(row).getApellido1(); break;
            case 4: resultado= this.usuarios.get(row).getApellido2(); break;
            case 5: resultado= this.pa.getTipoUsuario(this.usuarios.get(row)); break;
            case 6: resultado= this.usuarios.get(row).getTelefono(); break;
        }
        return resultado;
    }

    // ------------------------------------------------------------------------
    // ----------------------------- Funciones ------------------------------
    public final void setFilas(java.util.List<Usuario> usuarios){
        this.usuarios = usuarios;
        fireTableDataChanged();
    }

    public final Usuario obtenerUsuario(int i){
        return this.usuarios.get(i);
    }
}
