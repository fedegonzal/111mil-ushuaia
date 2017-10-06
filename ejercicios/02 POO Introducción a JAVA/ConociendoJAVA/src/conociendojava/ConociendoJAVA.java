package conociendojava;

import utilitarios.Utils;

public class ConociendoJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.apellido = "Viera";
        persona1.nombre = "Leonel";
        
        persona2.apellido = "González";
        persona2.nombre = "Federico";
        
        System.out.println(persona1.nombreCompleto());
        System.out.println(persona2.nombreCompleto());
        System.out.println(Persona.NACIONALIDAD);
        
        // ejemplo obteniendo datos desde la consola
        String unTexto = Utils.consolePrompt("Ingrese su nombre: ");
        System.out.println("Usted ingreso: " + unTexto);
    }
    
}
