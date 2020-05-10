
package aplicacion.usuarios;

public final class PersonalExterno extends Usuario{

    private boolean estarDentro;

    // -------------------------------------------------------------------------
    // ------------------------------- Constructor -----------------------------
    public PersonalExterno(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                         String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, Integer telefono,
                         boolean estarDentro) {
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.estarDentro = estarDentro;
    }
    
    public PersonalExterno(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                        String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, Integer telefono) {
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.estarDentro = false;
    }

    // -------------------------------------------------------------------------
    // ---------------------------------- Getter -------------------------------
    public boolean isEstarDentro() {
        return estarDentro;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Setter --------------------------------
    public void setEstarDentro(boolean estarDentro) {
        this.estarDentro = estarDentro;
    }
}
