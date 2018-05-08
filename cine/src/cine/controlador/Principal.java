package cine.controlador;

import cine.modelo.DbSession;

public class Principal {

    /**
     * Punto de inicio de la aplicación
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // inicio una sessión con la base de datos
        DbSession dbSession = new DbSession();
        
        // inicio la aplicación pasándole la clase de la BD
        new Aplicacion(dbSession).iniciar();
    }
}
