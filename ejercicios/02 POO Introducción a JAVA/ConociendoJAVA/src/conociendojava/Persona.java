package conociendojava;

public class Persona {
    
    public static String NACIONALIDAD = "Argentina";
    
    public String nombre;
    public String apellido;
    
    /**
     * Retorna un String con el nombre + un espacio + el apellido
     * @return 
     */
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
}
