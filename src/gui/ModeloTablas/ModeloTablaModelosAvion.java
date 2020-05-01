/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ModeloTablas;

import aplicacion.aviones.ModeloAvion;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author david
 */
public class ModeloTablaModelosAvion extends AbstractTableModel{
    private java.util.List<ModeloAvion> modelos;
    
    public ModeloTablaModelosAvion(){
        this.modelos=new java.util.ArrayList<>();
    }

    @Override
    public int getColumnCount (){
        return 5;
    }

    @Override
    public int getRowCount(){
        return this.modelos.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Nombre"; break;
            case 1: nombre= "Cap. Normal"; break;
            case 2: nombre= "Cap. Premium"; break;
            case 3: nombre= "Consumo"; break;
            case 4: nombre= "Empresa"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.Integer.class; break;
            case 2: clase=java.lang.Integer.class; break;
            case 3: clase=java.lang.Float.class; break;
            case 4: clase= java.lang.String.class; break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        if(col != 0)
            return true;
        if(col == 0 && this.modelos.get(row).getNombre() == null){
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= this.modelos.get(row).getNombre(); break;
            case 1: resultado= this.modelos.get(row).getCapacidadNormal();break;
            case 2: resultado= this.modelos.get(row).getCapacidadPremium(); break;
            case 3: resultado= this.modelos.get(row).getConsumo(); break;
            case 4: resultado= this.modelos.get(row).getEmpresaFabricante(); break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<ModeloAvion> modelos){
        this.modelos = modelos;
        fireTableDataChanged();
    }

    public ModeloAvion obtenerModeloAvion(int i){
        return this.modelos.get(i);
    }
    
    public void anhadirModeloAvion(ModeloAvion ma){
        this.modelos.add(ma);
        fireTableRowsInserted(this.modelos.size()-1, this.modelos.size()-1);
    }
    
    public void borrarModeloAvion(int i){
        this.modelos.remove(i);
        fireTableRowsDeleted(i, i);
    }
    
    public void nuevoModelo() {
        this.modelos.add(new ModeloAvion());
        fireTableRowsInserted(this.modelos.size() - 1, this.modelos.size() - 1);
    }

    public List<ModeloAvion> getModelos() {
        return modelos;
    }

    public void setModelos(List<ModeloAvion> modelos) {
        this.modelos = modelos;
    }
    
    @Override
    public void setValueAt(Object v, int row, int col){
        switch (col){
            case 0: this.modelos.get(row).setNombre((String) v); break;
            case 1: this.modelos.get(row).setCapacidadNormal((Integer) v); break;
            case 2: this.modelos.get(row).setCapacidadPremium((Integer) v);break;
            case 3: this.modelos.get(row).setConsumo((Float) v);break;
            case 4: this.modelos.get(row).setEmpresaFabricante((String) v);break;
        }
    }
    
    
}
