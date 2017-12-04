package utilitarios;

import java.util.Scanner;

public class Utils {
    
    /**
     * Permite pedir un texto dede la consola
     * @param mensaje
     * @return 
     */
    public static String consolePrompt(String mensaje) {
        Scanner in = new Scanner(System.in);
        String texto;
        
        System.out.print(mensaje);
        texto =  in.nextLine();
        return texto;
    }
    
}
