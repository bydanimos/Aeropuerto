/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ModeloTablas;

import aplicacion.aviones.Avion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author davidmohedano
 */
public class ModeloTablaAviones2 extends AbstractTableModel {
    private List<Avion> aviones;
    
    public ModeloTablaAviones2() {
        this.aviones = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return this.aviones.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        if(col == 2) return true;
        if(col == 8 && this.aviones.get(row).isRetirable()) return true;
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado=null;

        switch (columnIndex){
            case 0: resultado= this.aviones.get(rowIndex).getCodigo(); break;
            case 1: resultado= this.aviones.get(rowIndex).getAnhoFabricacion();break;
            case 2: resultado= this.aviones.get(rowIndex).getAerolinea().getNombre(); break;
            case 3: resultado= this.aviones.get(rowIndex).getModeloAvion().getNombre(); break;
            case 4: resultado= this.aviones.get(rowIndex).getModeloAvion().getCapacidadNormal(); break;
            case 5: resultado= this.aviones.get(rowIndex).getModeloAvion().getCapacidadPremium();break;
            case 6: resultado= this.aviones.get(rowIndex).getModeloAvion().getConsumo(); break;
            case 7: resultado= this.aviones.get(rowIndex).getModeloAvion().getEmpresaFabricante(); break;
            case 8: resultado= this.aviones.get(rowIndex).isRetirado(); break;
        }
        return resultado;
    }
    
    @Override
    public String getColumnName(int col) {
        String nombre = null;

        switch (col){
            case 0: nombre= "Código"; break;
            case 1: nombre= "Año fabricación"; break;
            case 2: nombre= "Aerolínea"; break;
            case 3: nombre= "Modelo"; break;
            case 4: nombre= "Cap. Normal"; break;
            case 5: nombre= "Cap. Premium"; break;
            case 6: nombre= "Consumo"; break;
            case 7: nombre= "Empresa"; break;
            case 8: nombre= "Retirado"; break;
        }
        return nombre;
    }
    
    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col){
            case 0: clase = String.class; break;
            case 1: clase = Integer.class; break;
            case 2: clase = String.class; break;
            case 3: clase = String.class; break;
            case 4: clase = Integer.class; break;
            case 5: clase = Integer.class; break;
            case 6: clase = Float.class; break;
            case 7: clase = String.class; break;
            case 8: clase = Boolean.class; break;
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
    
    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 1: aviones.get(row).setAnhoFabricacion((Integer) v); break;
            case 2: aviones.get(row).getAerolinea().setNombre((String) v); break;
            case 3: aviones.get(row).getModeloAvion().setNombre((String) v); break;
            case 4: aviones.get(row).getModeloAvion().setCapacidadNormal((Integer) v); break;
            case 5: aviones.get(row).getModeloAvion().setCapacidadPremium((Integer) v); break;
            case 6: aviones.get(row).getModeloAvion().setConsumo((Float) v); break;
            case 7: aviones.get(row).getModeloAvion().setEmpresaFabricante((String) v); break;
            case 8: aviones.get(row).setRetirado((Boolean) v); break;
        }
    }
    
    public java.util.List<Avion> getFilas() {
        return this.aviones;
    }
}
