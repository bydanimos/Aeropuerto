/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ModeloTablas;

import aplicacion.usuarios.*;
import gui.PAdminUsuarios;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ruben
 */
public class ModeloTablaDatosUsuarios extends AbstractTableModel{
    private java.util.List<Usuario> usuarios;
    private final PAdminUsuarios pa;
    
    public ModeloTablaDatosUsuarios(PAdminUsuarios pa){
        this.usuarios=new java.util.ArrayList<>();
        this.pa = pa;
    }

    @Override
    public int getColumnCount (){
        return 6;
    }

    @Override
    public int getRowCount(){
        return this.usuarios.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre = "";

        switch (col){
            case 0: nombre = "DNI"; break;
            case 1: nombre = "ID"; break;
            case 2: nombre = "Nombre"; break;
            case 3: nombre = "Apellido 1"; break;
            case 4: nombre ="Apellido 2"; break;
            case 5: nombre = "Tipo"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.String.class; break;
            case 3: clase=java.lang.String.class; break;
            case 4: clase=java.lang.String.class; break;
            case 5: clase=java.lang.String.class; break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    @Override
    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= this.usuarios.get(row).getDni(); break;
            case 1: resultado= this.usuarios.get(row).getId();break;
            case 2: resultado= this.usuarios.get(row).getNombre(); break;
            case 3: resultado= this.usuarios.get(row).getApellido1(); break;
            case 4: resultado= this.usuarios.get(row).getApellido2(); break;
            case 5: resultado= this.pa.getTipoUsuario(this.usuarios.get(row)); break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Usuario> usuarios){
        this.usuarios = usuarios;
        fireTableDataChanged();
    }

    public Usuario obtenerUsuario(int i){
        return this.usuarios.get(i);
    }
}

        /*

package gui;
import aplicacion.Libro;
import aplicacion.TipoUsuario;
import aplicacion.Usuario;
import javax.swing.table.*;
/**
 *
 * @author basesdatos
 */
/*public class ModeloTablaUsuarios extends AbstractTableModel{
    private java.util.List<Usuario> usuarios;

    public ModeloTablaUsuarios(){
        this.usuarios=new java.util.ArrayList<Usuario>();
    }

    public int getColumnCount (){
        return 4;
    }

    public int getRowCount(){
        return usuarios.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Id"; break;
            case 1: nombre= "Nombre"; break;
            case 2: nombre="Email"; break;
            case 3: nombre="Tipo"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.String.class; break;
            case 3: clase=java.lang.String.class; break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= usuarios.get(row).getIdUsuario(); break;
            case 1: resultado= usuarios.get(row).getNombre(); break;
            case 2: resultado= usuarios.get(row).getEmail(); break;
            case 3:
                if(usuarios.get(row).getTipoUsuario().equals(TipoUsuario.Administrador)){
                    resultado = "Administrador";
                }else{
                    resultado = "Normal";
                }
                break;
            
        }
        return resultado;
    }

    public void setFilas(java.util.List<Usuario> usuarios){
        this.usuarios=usuarios;
        fireTableDataChanged();
    }

    public Usuario obtenerUsuario(int i){
        return this.usuarios.get(i);
    }

}*/
