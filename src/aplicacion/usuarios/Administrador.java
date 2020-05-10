
package aplicacion.usuarios;

import java.sql.Timestamp;

public final class Administrador extends Usuario {

    private java.sql.Timestamp fechaInicio;
    private String curriculum;

    // -------------------------------------------------------------------------
    // ------------------------------- Constructor -----------------------------
    public Administrador(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                        String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, Integer telefono,
                        java.sql.Timestamp fechaInicio, String curriculum) {
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.fechaInicio = fechaInicio;
        this.curriculum = curriculum;
    }

    public Administrador(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                        String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, Integer telefono) {
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.fechaInicio = null;
        this.curriculum = "";
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Getters -------------------------------
    public Timestamp getFechaInicio() {
        return fechaInicio;
    }
    
    public String getCurriculum() {
        return curriculum;
    }
    
    // -------------------------------------------------------------------------
    // --------------------------------- Setters -------------------------------
    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
}
