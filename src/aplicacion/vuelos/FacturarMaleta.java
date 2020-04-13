package aplicacion.vuelos;

import java.sql.Timestamp;

public class FacturarMaleta {

    private Billete billete;
    private Maleta maleta;
    private Timestamp fechaFacturacion;

    public FacturarMaleta(Billete billete, Maleta maleta, Timestamp fechaFacturacion) {
        this.billete = billete;
        this.maleta = maleta;
        this.fechaFacturacion = fechaFacturacion;
    }

    public Billete getBillete() {
        return billete;
    }

    public void setBillete(Billete billete) {
        this.billete = billete;
    }

    public Maleta getMaleta() {
        return maleta;
    }

    public void setMaleta(Maleta maleta) {
        this.maleta = maleta;
    }

    public Timestamp getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Timestamp fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public float getPrecioExtra(){
        if (this.maleta.getPeso() > this.billete.getVuelo().getAvion().getAerolinea().getPesoBaseMaleta()){
            float diferencia = this.billete.getVuelo().getAvion().getAerolinea().getPesoBaseMaleta() - this.maleta.getPeso();
            return diferencia * 2;
        } else
            return 0;
    }
}
