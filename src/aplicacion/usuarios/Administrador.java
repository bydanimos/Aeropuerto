package aplicacion.usuarios;

import java.sql.Timestamp;

public class Administrador {

    private java.sql.Timestamp fechaInicio;
    private String curriculum;

    public Administrador(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                        String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, String telefono,
                         java.sql.Timestamp fechaInicio, String curriculum){
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.fechaInicio = fechaInicio;
        this.curriculum = curriculum;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
}
