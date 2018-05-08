package cine.modelo.Pelicula;

import cine.modelo.DbSession;
import java.util.List;
import org.hibernate.Session;

public class PeliculaDaoImp implements PeliculaDao {

    private final DbSession dbSession;
    
    public PeliculaDaoImp(DbSession dbSession) {
        this.dbSession = dbSession;
    }
    
    
    @Override
    public void crear(Pelicula pelicula) {
        Session session = this.dbSession.obtenerSession();
        session.beginTransaction();
        
        session.persist(pelicula);
        
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar(Pelicula pelicula) {
        Session session = this.dbSession.obtenerSession();
        session.beginTransaction();
        
        session.update(pelicula);
        
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Pelicula pelicula) {
        Session session = this.dbSession.obtenerSession();
        session.beginTransaction();
        
        session.delete(pelicula);
        
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Pelicula> listar() {
        Session session = this.dbSession.obtenerSession();
        List<Pelicula> peliculas = session.createQuery("from Pelicula").list();
        session.close();
        
        return peliculas;
    }

    @Override
    public Pelicula buscarPorID(int id) {
        Session session = this.dbSession.obtenerSession();
        Pelicula pelicula = session.get(Pelicula.class, id);
        session.close();
        
        return pelicula;
    }
}
