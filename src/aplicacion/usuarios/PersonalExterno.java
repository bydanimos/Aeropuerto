package aplicacion.usuarios;

public class PersonalExterno extends Usuario{

    private boolean estarDentro;

    public PersonalExterno(String dni, String id, String contrasenha, String correoElectronico, String nombre,
                         String apellido1, String apellido2, TipoSexo sexo, String paisProcedencia, String telefono,
                         boolean estarDentro){
        super(dni, id, contrasenha, correoElectronico, nombre, apellido1, apellido2, sexo, paisProcedencia, telefono);
        this.estarDentro = estarDentro;
    }

    public boolean isEstarDentro() {
        return estarDentro;
    }

    public void setEstarDentro(boolean estarDentro) {
        this.estarDentro = estarDentro;
    }
}
