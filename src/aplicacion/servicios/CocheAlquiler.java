
package aplicacion.servicios;

public final class CocheAlquiler {

    private String matricula;
    private String modelo;
    private int caballos;
    private float precioPorDia;
    private String tipoCombustible;
    private int numeroPlazas;
    private int numeroPuertas;
    private boolean retirado;
    private boolean alquilado;
    private boolean reservado;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public CocheAlquiler(String matricula, String modelo, int caballos, float precioPorDia, 
                         String tipoCombustible, int numeroPlazas, int numeroPuertas, boolean retirado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.caballos = caballos;
        this.precioPorDia = precioPorDia;
        this.tipoCombustible = tipoCombustible;
        this.numeroPlazas = numeroPlazas;
        this.numeroPuertas = numeroPuertas;
        this.retirado = retirado;
        this.alquilado = false;
        this.reservado = false;
    }

    // ------------------------------------------------------------------------
    // ------------------------------- Getters --------------------------------
    public String getMatricula() {
        return matricula;
    }
    
    public String getModelo() {
        return modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public float getPrecioPorDia() {
        return precioPorDia;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean isRetirado() {
        return retirado;
    }
   
    public boolean isAlquilado() {
        return this.alquilado;
    }
       
    public boolean isReservado() {
        return this.reservado;
    }
    
    // ------------------------------------------------------------------------
    // ------------------------------- Setters --------------------------------
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void setPrecioPorDia(float precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }
    
    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
 
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
}
