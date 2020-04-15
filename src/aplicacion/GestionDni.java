package aplicacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GestionDni {

    /*
    Creamos 3 variables, dniIntroducido que almacena el dni que introduzcamos en
    un String, luego en un entero guardamos sólo el número del Dni, no la letra
    y por último un char letIntro que almacenará la letra.
     */
    private String dniIntroducido;
    private int dni;
    private char letIntro;

    /*
    Método getLetraIntroducida lo que hace es separar la letra del número del dni
    introducido. También convierte en mayúscula la letra
     */
    private void setLetraIntroducida() {
        this.letIntro = Character.toUpperCase(this.dniIntroducido.charAt(this.dniIntroducido.length() - 1));
    }

    /*
    Se establece el patrón del Dni, en este caso tiene que contener 7 u 8 números
    y una letra, ya sea mayúscula o minúscula. Luego si se cumple el patrón
    devuelve true.
     */
    private boolean patron() {
        Pattern pat = Pattern.compile("[0-9]{7,8}[A-Za-z]");
        Matcher mat = pat.matcher(dniIntroducido);
        boolean cumplePatron = mat.matches();
        return cumplePatron;
    }

    /*
    Este método pasa el valor introducide por consola del dni a la variable
    dniIntroducido
     */
    private void setDniIntroducido(String dniIntroducido) {
        this.dniIntroducido = dniIntroducido;
    }

    /*
    convierte a número el dni eliminando la letra.
     */
    private void setDniNumero(String dni) {
        this.dni = Integer.parseInt(this.dniIntroducido.substring(0, this.dniIntroducido.length() - 1));
    }

    private String getDniIntroducido() {
        return dniIntroducido;
    }

    private char getLetIntro() {
        return letIntro;
    }

    /*
    En el método getLetraDni se crea la variable resto y la variable letra. Lo
    que hace este método es dividir el dni (pasado a entero eliminando la letra)
    entre 23 y el resto se guarda en la variable de tipo entero. Se hace uso de 
    un condicional switch para obtener la letra que le corresponde al Dni
     */
    private char getLetraDni() {
        int resto;
        resto = this.dni % 23;
        char letra = 0;

        switch (resto) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return letra;
    }
    
    public boolean dniCorrecto(String dni){
        this.setDniNumero(dni);
        this.setDniIntroducido(dni);
        this.setLetraIntroducida();
        
        if (patron()){
            if (getLetIntro() == getLetraDni()){
                return true;
            }
        }
        return false;
    }
}
