package aplicacion.usuarios;

import java.sql.Timestamp;

public class Horario {

    private Timestamp fechaEntrada;
    private Timestamp fechaSalida;

    public Horario(Timestamp fechaEntrada, Timestamp fechaSalida) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
}
