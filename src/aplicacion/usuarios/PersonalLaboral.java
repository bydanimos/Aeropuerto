package aplicacion.usuarios;

import java.util.ArrayList;
import java.sql.Timestamp;

public class PersonalLaboral extends Usuario{

    private String labor;
    private String descripcionTarea;
    private ArrayList<Horario> historialTrabajo;
    private Timestamp fechaInicio;

    public PersonalLaboral(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                           String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, String telefono,
                           String labor, String descripcionTarea, ArrayList<Horario> historialTrabajo, Timestamp fechaInicio){
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.labor = labor;
        this.descripcionTarea = descripcionTarea;
        this.historialTrabajo = historialTrabajo;
        this.fechaInicio = fechaInicio;
    }
    
    public PersonalLaboral(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                           String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, String telefono,
                           String labor, String descripcionTarea, Timestamp fechaInicio){
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.labor = labor;
        this.descripcionTarea = descripcionTarea;
        this.fechaInicio = fechaInicio;
    }
    
    public PersonalLaboral(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                        String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, String telefono){
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.labor = "";
        this.descripcionTarea = "";
        this.fechaInicio = null;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public ArrayList<Horario> getHistorialTrabajo() {
        return historialTrabajo;
    }

    public void setHistorialTrabajo(ArrayList<Horario> historialTrabajo) {
        this.historialTrabajo = historialTrabajo;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
