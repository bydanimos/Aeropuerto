/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.usuarios.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ruben
 */
public class ModeloTablaDatosUsuarios extends AbstractTableModel{
    private java.util.List<Usuario> usuarios;
    
    public ModeloTablaDatosUsuarios(){
        this.usuarios=new java.util.ArrayList<Usuario>();
    }

    @Override
    public int getColumnCount (){
        return 6;
    }

    @Override
    public int getRowCount(){
        return usuarios.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "DNI"; break;
            case 1: nombre= "ID"; break;
            case 2: nombre= "Nombre"; break;
            case 3: nombre= "Apellido 1"; break;
            case 4: nombre="Apellido 2"; break;
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
            case 0: resultado= usuarios.get(row).getDni(); break;
            case 1: resultado= usuarios.get(row).getId();break;
            case 2: resultado= usuarios.get(row).getNombre(); break;
            case 3: resultado= usuarios.get(row).getApellido1(); break;
            case 4: resultado= usuarios.get(row).getApellido2(); break;
            case 5: 
                if(this.usuarios.get(row).getSexo().equals(TipoSexo.h)){
                    resultado = "H";
                }else if(this.usuarios.get(row).getSexo().equals(TipoSexo.m)){
                    resultado = "M";
                }else{
                    resultado = "O";
                }
                break;
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