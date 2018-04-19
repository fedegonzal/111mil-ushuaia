package cine.controlador;

import cine.modelo.Calificacion;
import cine.modelo.Genero;
import cine.modelo.PaisDeOrigen;
import cine.vista.PantallaPrincipal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // conexion a la BD
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
        
        // Obtener listas de Generos, calificaciones y paises de origen
        List<Genero> generos = session.createQuery("from Genero").list();
        List<Calificacion> calificaciones = session.createQuery("from Calificacion").list();
        List<PaisDeOrigen> paises = session.createQuery("from PaisDeOrigen").list();
        
        // cierro conexion
        session.close();
        
        sessionFactory.close();
        
        // inicar la vista
        PantallaPrincipal vista = new PantallaPrincipal(generos, calificaciones, paises);
        vista.setVisible(true);
        
    }
    
}
