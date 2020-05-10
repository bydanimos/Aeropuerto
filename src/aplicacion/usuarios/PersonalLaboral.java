
package aplicacion.usuarios;

import java.util.ArrayList;
import java.sql.Timestamp;

public final class PersonalLaboral extends Usuario {

    private String labor;
    private String descripcionTarea;
    private ArrayList<Horario> historialTrabajo;
    private Timestamp fechaInicio;
    // Información Personal Laboral
    private boolean deServicio;
    private Timestamp fechaEntrada;
    // Estadisticas trabajadores
    private String horasSemana;
    private String horasMes;
    private String horasAnho;

    // -------------------------------------------------------------------------
    // ---------------------------- Constructores ------------------------------
    public PersonalLaboral(String dni, String id, String contrasenha, 
            String correoElectronico, String nombre, String apellido1, 
            String apellido2, TipoSexo sexo, String paisProcedencia, 
            Integer telefono, String labor, String descripcionTarea, 
            ArrayList<Horario> historialTrabajo, Timestamp fechaInicio) {
        
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, 
                apellido2, sexo, paisProcedencia, telefono);
        this.labor = labor;
        this.descripcionTarea = descripcionTarea;
        this.historialTrabajo = historialTrabajo;
        this.fechaInicio = fechaInicio;
    }
    
    public PersonalLaboral(String dni, String id, String contrasenha, 
            String correoElectronico, String nombre, String apellido1, 
            String apellido2, TipoSexo sexo, String paisProcedencia, 
            Integer telefono, String labor, String descripcionTarea, 
            Timestamp fechaInicio) {
        
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, 
                apellido2, sexo, paisProcedencia, telefono);
        this.labor = labor;
        this.descripcionTarea = descripcionTarea;
        this.fechaInicio = fechaInicio;
    }
    
    public PersonalLaboral(String dni, String id, String contrasenha, 
            String email, String nombre, String apellido1, String apellido2, 
            TipoSexo sexo, String paisProcedencia, Integer telefono) {
        
        super(dni, id, contrasenha, email, nombre, apellido1, apellido2, 
                sexo, paisProcedencia, telefono);
        this.labor = "";
        this.descripcionTarea = "";
        this.fechaInicio = null;
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Setters ---------------------------------
    public void setLabor(String labor) {
        this.labor = labor;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public void setHistorialTrabajo(ArrayList<Horario> historialTrabajo) {
        this.historialTrabajo = historialTrabajo;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public void setDeServicio(boolean deServicio) {
        this.deServicio = deServicio;
    }
    
    public void setFechaEntrada(Timestamp fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    
    public void setHorasSemana(String horas) {
        this.horasSemana = horas;
    }
    
    public void setHorasMes(String horas) {
        this.horasMes = horas;
    }
    
    public void setHorasAnho(String horas) {
        this.horasAnho = horas;
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Getters ---------------------------------
    public String getLabor() {
        return this.labor;
    }

    public String getDescripcionTarea() {
        return this.descripcionTarea;
    }

    public ArrayList<Horario> getHistorialTrabajo() {
        return this.historialTrabajo;
    }

    public Timestamp getFechaInicio() {
        return this.fechaInicio;
    }
    
    public boolean isDeServicio() {
        return this.deServicio;
    }
    
    public Timestamp getFechaEntrada() {
        return this.fechaEntrada;
    }
    
    public String getHorasSemana() {
        return this.horasSemana;
    }
    
    public String getHorasMes() {
        return this.horasMes;
    }
    
    public String getHorasAnho() {
        return this.horasAnho;
    }
}
