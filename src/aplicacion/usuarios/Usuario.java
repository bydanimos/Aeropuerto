
package aplicacion.usuarios;

public abstract class Usuario {

    private String dni;
    private String id;
    private String correoElectronico;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String contrasenha;
    private TipoSexo sexo;
    private String paisProcedencia;
    private Integer telefono;

    // -------------------------------------------------------------------------
    // ------------------------------- Constructor -----------------------------
    public Usuario(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                   String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, Integer telefono) {
        this.dni = dni;
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.contrasenha = contrasenha;
        this.sexo = sexo;
        this.paisProcedencia = paisProcedencia;
        this.telefono = telefono;
    }
    
    public Usuario(String dni, String id, String correoElectronico, String nombre,
                   String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, Integer telefono) {
        this.dni = dni;
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.paisProcedencia = paisProcedencia;
        this.telefono = telefono;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Getters -------------------------------
    public String getDni() {
        return dni;
    }
    
    public String getId() {
        return id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public Integer getTelefono() {
        return telefono;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Setters -------------------------------
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
