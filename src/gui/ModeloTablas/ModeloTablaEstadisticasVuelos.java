
package gui.ModeloTablas;

import aplicacion.aviones.Aerolinea;
import aplicacion.usuarios.TipoSexo;
import aplicacion.vuelos.TipoAsiento;
import aplicacion.vuelos.Vuelo;
import gui.Paneles.PAerolineas;
import gui.Paneles.PEstadisticas;
import javax.swing.table.AbstractTableModel;


public final class ModeloTablaEstadisticasVuelos extends AbstractTableModel {
    
    private java.util.List<Vuelo> vuelos;
    private final PEstadisticas pe;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public ModeloTablaEstadisticasVuelos(PEstadisticas pe){
        this.vuelos=new java.util.ArrayList<>();
        this.pe = pe;
    }

    // ------------------------------------------------------------------------
    // ------------------------------ Overrides -------------------------------
    @Override
    public final int getColumnCount (){
        return 10;
    }

    @Override
    public final int getRowCount(){
        return this.vuelos.size();
    }

    @Override
    public final String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Nº Vuelo"; break;
            case 1: nombre= "Origen"; break;
            case 2: nombre= "Destino"; break;
            case 3: nombre= "Fecha Salida"; break;
            case 4: nombre= "Aerolinea"; break;
            case 5: nombre= "Nº Mujeres"; break;
            case 6: nombre= "Nº Hombres"; break;
            case 7: nombre= "Nº Normal"; break;
            case 8: nombre= "Nº Premium"; break;
            case 9: nombre= "Nacionalidad"; break;
        
        }
        return nombre;
    }

    @Override
    public final Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase= java.lang.String.class; break;
            case 3: clase= java.sql.Date.class; break;
            case 4: clase= java.lang.String.class; break;
            case 5: clase= java.lang.Integer.class; break;
            case 6: clase= java.lang.Integer.class; break;
            case 7: clase= java.lang.Integer.class; break;
            case 8: clase= java.lang.Integer.class; break;
            case 9: clase= java.lang.String.class; break;
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
            case 0: resultado= this.vuelos.get(row).getNumeroVuelo(); break;
            case 1: resultado= this.vuelos.get(row).getOrigen();break;
            case 2: resultado= this.vuelos.get(row).getDestino(); break;
            case 3: resultado= this.vuelos.get(row).getFechaSalida(); break;
            case 4: resultado= this.pe.getAerolineaVuelo(this.vuelos.get(row)).getNombre(); break;
            case 5: resultado= this.pe.getNSexoVuelo(this.vuelos.get(row),TipoSexo.m); break;
            case 6: resultado= this.pe.getNSexoVuelo(this.vuelos.get(row),TipoSexo.h); break;
            case 7: resultado= this.pe.getNTipoVuelo(this.vuelos.get(row),TipoAsiento.Normal); break;
            case 8: resultado= this.pe.getNTipoVuelo(this.vuelos.get(row),TipoAsiento.Premium); break;
            case 9: resultado= this.pe.getNacionalidadMayoritariaVuelo(this.vuelos.get(row)); break;
        }
        
        return resultado;
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    public final void setFilas(java.util.List<Vuelo> vuelos){
        this.vuelos = vuelos;
        fireTableDataChanged();
    }

}
