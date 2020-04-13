package aplicacion.servicios;

public class CocheAlquiler {

    private String matricula;
    private String modelo;
    private int caballos;
    private float precioPorDia;
    private String tipoCombustible;
    private int numeroPlazas;
    private int numeroPuertas;
    private boolean retirado;

    public CocheAlquiler(String matricula, String modelo, int caballos, float precioPorDia, String tipoCombustible, int numeroPlazas, int numeroPuertas, boolean retirado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.caballos = caballos;
        this.precioPorDia = precioPorDia;
        this.tipoCombustible = tipoCombustible;
        this.numeroPlazas = numeroPlazas;
        this.numeroPuertas = numeroPuertas;
        this.retirado = retirado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public float getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(float precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isRetirado() {
        return retirado;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }
}
