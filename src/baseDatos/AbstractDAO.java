
package baseDatos;

public abstract class AbstractDAO {

    private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;

    // -------------------------------------------------------------------------
    // --------------------------------- Getters -------------------------------
    protected java.sql.Connection getConexion() {
        return this.conexion;
    }

    protected aplicacion.FachadaAplicacion getFachadaAplicacion() {
        return fa;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Setters -------------------------------
    protected void setFachadaAplicacion(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
    }

    protected void setConexion(java.sql.Connection conexion) {
        this.conexion = conexion;
    }
}
