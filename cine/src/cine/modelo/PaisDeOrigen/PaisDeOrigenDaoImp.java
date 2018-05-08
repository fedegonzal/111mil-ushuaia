package cine.modelo.PaisDeOrigen;

import cine.modelo.DbSession;
import java.util.List;
import org.hibernate.Session;

public class PaisDeOrigenDaoImp extends DbSession implements PaisDeOrigenDao {

    private final DbSession dbSession;
    
    public PaisDeOrigenDaoImp(DbSession dbSession) {
        this.dbSession = dbSession;
    }

    @Override
    public List<PaisDeOrigen> listar() {
        Session session = this.dbSession.obtenerSession();
        List<PaisDeOrigen> paises = session.createQuery("from PaisDeOrigen").list();
        session.close();
        
        return paises;
    }
    
}
