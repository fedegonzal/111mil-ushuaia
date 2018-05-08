package cine.modelo.Genero;

import cine.modelo.DbSession;
import java.util.List;
import org.hibernate.Session;

public class GeneroDaoImp extends DbSession implements GeneroDao {

    private final DbSession dbSession;
    
    public GeneroDaoImp(DbSession dbSession) {
        this.dbSession = dbSession;
    }

    @Override
    public List<Genero> listar() {
        
        Session session = this.dbSession.obtenerSession();
        List<Genero> generos = session.createQuery("from Genero").list();
        session.close();
        
        return generos;
    }
}
