package cine;

import cine.modelo.PaisDeOrigen;
import cine.modelo.Genero;
import cine.modelo.Pelicula;
import cine.modelo.Rol;
import cine.modelo.Actor;
import cine.modelo.Calificacion;
import cine.modelo.Sexo;
import cine.modelo.Personaje;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author leo
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SessionFactory sessionFactory = null;
        
        try {
            StandardServiceRegistry standardRegistry
                    = new StandardServiceRegistryBuilder().configure("resources/hibernate.cfg.xml").build();

            Metadata metaData
                    = new MetadataSources(standardRegistry).getMetadataBuilder().build();

            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Throwable th) {
            System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);
        }
        
        // abrio conexion
        Session session = sessionFactory.openSession();
        
        List<Genero> generos = session.createQuery("from Genero").list();
        System.out.println(generos);
        
        List<Calificacion> calificaciones = session.createQuery("from Calificacion").list();
        System.out.println(generos);
        
        // List<PaisDeOrigen> paises = session.createQuery("from PaisDeOrgien").list();
        // System.out.println(generos);
        
        // cierro conexion
        session.close();
        
        /////////////////////////////////////
        /////////////////////////////////////
        /////////////////////////////////////
        /////////////////////////////////////

        Sexo femenino = new Sexo(1, "Femenino");
        Sexo masculino = new Sexo(2, "Masculino");

        System.out.println(femenino + " - " + masculino);

        Actor actorFemenino = new Actor(1, true, "Bup", "Betty", femenino);
        Actor actorMasculino = new Actor(2, false, "Darín", "Ricardo", masculino);

        System.out.println(actorFemenino + " - " + actorMasculino);

        System.out.println(actorFemenino.getSexo());

        Rol protagonista = new Rol(1, "protagonista");

        Personaje personaje = new Personaje(1, "Chino", actorMasculino, protagonista);

        System.out.println(personaje);
        System.out.println(personaje.getActor().getSexo());

        PaisDeOrigen pais = new PaisDeOrigen(1, "Castellano", "Argentina");
        Calificacion calificacion = new Calificacion(1, "13+");
        Genero genero = new Genero(1, "Suspenso");

        Pelicula pelicula = new Pelicula(1, 2010, true, 180, null, "Nueve Reinas", "Nueve Reinas", pais, genero, calificacion);

        System.out.println(pelicula);
    }

}
