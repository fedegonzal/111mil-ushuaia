package cine.controlador;

import cine.modelo.Calificacion.Calificacion;
import cine.modelo.Calificacion.CalificacionDao;
import cine.modelo.Calificacion.CalificacionDaoImp;
import cine.modelo.DbSession;
import cine.modelo.Genero.Genero;
import cine.modelo.Genero.GeneroDao;
import cine.modelo.Genero.GeneroDaoImp;
import cine.modelo.PaisDeOrigen.PaisDeOrigen;
import cine.modelo.PaisDeOrigen.PaisDeOrigenDao;
import cine.modelo.PaisDeOrigen.PaisDeOrigenDaoImp;
import cine.modelo.Pelicula.Pelicula;
import cine.modelo.Pelicula.PeliculaDao;
import cine.modelo.Pelicula.PeliculaDaoImp;
import cine.modelo.Personaje;
import cine.vista.PantallaPrincipal;
import java.util.Iterator;
import java.util.List;

public class Aplicacion {
    
    //
    // Atributos
    //
    
    private final GeneroDao generoDao;
    private final CalificacionDao calificacionDao;
    private final PaisDeOrigenDao paisDao;
    private final PeliculaDao peliculaDao;
    private final DbSession dbSession;
    
    
    /**
     * Constructor de la clase. Recibe la sessión con la BD y crea los DAO
     * necesarios para el resto de la app
     * 
     * @param dbSession 
     */
    public Aplicacion(DbSession dbSession) {
        this.generoDao = new GeneroDaoImp(dbSession);
        this.calificacionDao = new CalificacionDaoImp(dbSession);
        this.paisDao = new PaisDeOrigenDaoImp(dbSession);
        this.peliculaDao = new PeliculaDaoImp(dbSession);
        this.dbSession = dbSession;
    }
    
    /**
     * Inicia la interfaz visual de la aplicación
     */
    public void iniciar() {
        
        // obtenemos los objetos para completar los combos
        List<Genero> generos = this.generoDao.listar();
        List<Calificacion> calificaciones = this.calificacionDao.listar();
        List<PaisDeOrigen> paises = this.paisDao.listar();
        
        //
        // EJEMPLO RELACIONES
        //
        
        // busco la película y muestro su toString() y sus rleaciones con 
        // Pais, Calificacion y Género
        Pelicula pelicula = peliculaDao.buscarPorID(2);
        System.out.println(
            pelicula + 
            " - País: " + pelicula.getPais() + 
            " - Calificación: " + pelicula.getCalificacion() + 
            " - Género: " + pelicula.getGenero()
        );
        
        // recorro los personajes de la pelicula y sus relaciones
        System.out.println("PERSONAJES:");
        for (Personaje personaje : pelicula.getPersonajes()) {
            System.out.println(
                personaje + 
                " - Rol: " + personaje.getRol() + 
                " - Actor: " + personaje.getActor() + 
                " - Sexo: " + personaje.getActor().getSexo()
            );
        }
        
        //
        // FIN: EJEMPLO RELACIONES
        //  
        
        
        // inicamos la vista
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal(this, generos, calificaciones, paises);
        pantallaPrincipal.setVisible(true);
    }

    /**
     * Accesor al DAO de película
     * @return 
     */
    public PeliculaDao getPeliculaDao() {
        return peliculaDao;
    }
}
