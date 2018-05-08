package cine.modelo;

import java.util.logging.Level;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DbSession {

    
    private final SessionFactory sessionFactory;

    public DbSession() {

        // Inicio una conexión con la BD y la guardo en el atributo sessionFactory
        
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        StandardServiceRegistry standardRegistry
                = new StandardServiceRegistryBuilder().configure("resources/hibernate.cfg.xml").build();

        Metadata metaData
                = new MetadataSources(standardRegistry).getMetadataBuilder().build();

        sessionFactory = metaData.getSessionFactoryBuilder().build();
    }

    /**
     * Getter de sessionFactory
     * @return 
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    /**
     * Abre una sessión
     * @return 
     */
    public Session obtenerSession() {
        return this.sessionFactory.openSession();
    }
}
