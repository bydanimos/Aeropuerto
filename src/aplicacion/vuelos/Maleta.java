
package aplicacion.vuelos;

public class Maleta {
    
    private int id;
    private float peso;

    // -------------------------------------------------------------------------
    // ------------------------------- Constructor -----------------------------
    public Maleta(int id, float peso) {
        this.id = id;
        this.peso = peso;
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Getters -------------------------------
    public int getId() {
        return id;
    }
    
    public float getPeso() {
        return peso;
    }
    
    // -------------------------------------------------------------------------
    // --------------------------------- Setters -------------------------------
    public void setId(int id) {
        this.id = id;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
