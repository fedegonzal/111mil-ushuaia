package cine.modelo.Calificacion;

import cine.modelo.DbSession;
import java.util.List;
import org.hibernate.Session;

public class CalificacionDaoImp extends DbSession implements CalificacionDao {

    private final DbSession dbSession;
    
    public CalificacionDaoImp(DbSession dbSession) {
        this.dbSession = dbSession;
    }

    @Override
    public List<Calificacion> listar() {
        
        Session session = this.dbSession.obtenerSession();
        List<Calificacion> calificaciones = session.createQuery("from Calificacion").list();
        session.close();
        
        return calificaciones;
    }
    
}
