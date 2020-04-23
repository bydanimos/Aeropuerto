/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.*;
import aplicacion.aviones.Aerolinea;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ruben
 */
public class ModeloTablaAerolineas extends AbstractTableModel{
    private java.util.List<Aerolinea> aerolineas;
    PAerolineas pa;
    
    public ModeloTablaAerolineas(PAerolineas pa){
        this.aerolineas=new java.util.ArrayList<Aerolinea>();
        this.pa = pa;
    }

    public int getColumnCount (){
        return 4;
    }

    public int getRowCount(){
        return aerolineas.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Nombre"; break;
            case 1: nombre= "Pais"; break;
            case 2: nombre= "Precio Maleta"; break;
            case 3: nombre= "Peso Maleta"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
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
    public boolean isCellEditable(int row, int col){
        return col > 0;
    }

    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= aerolineas.get(row).getNombre(); break;
            case 1: resultado= aerolineas.get(row).getPaisSede();break;
            case 2: resultado= aerolineas.get(row).getPrecioBaseMaleta(); break;
            case 3: resultado= aerolineas.get(row).getPesoBaseMaleta(); break;
        }
        return resultado;
    }
    
    @Override
    public void setValueAt(Object v, int row, int col){
        switch (col){
            case 1: aerolineas.get(row).setPaisSede((String) v); break;
            case 2: aerolineas.get(row).setPrecioBaseMaleta((Float) v);break;
            case 3: aerolineas.get(row).setPesoBaseMaleta((Float) v);break;
        }
    }

    public void setFilas(java.util.List<Aerolinea> aerolineas){
        this.aerolineas=aerolineas;
        fireTableDataChanged();
    }

    public Aerolinea obtenerAerolinea(int i){
        return this.aerolineas.get(i);
    }
    
    public void anhadirAerolinea(Aerolinea a){
        this.aerolineas.add(a);
        fireTableRowsInserted(this.aerolineas.size()-1, this.aerolineas.size()-1);
    }
    
    public void borrarAerolinea(int i){
        this.aerolineas.remove(i);
        fireTableRowsDeleted(i, i);
    }
}
