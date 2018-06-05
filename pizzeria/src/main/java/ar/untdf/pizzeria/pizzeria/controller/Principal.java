package ar.untdf.pizzeria.pizzeria.controller;

import ar.untdf.pizzeria.pizzeria.modelo.DetallePedido;
import ar.untdf.pizzeria.pizzeria.modelo.EstadoFactura;
import ar.untdf.pizzeria.pizzeria.modelo.EstadoPedido;
import ar.untdf.pizzeria.pizzeria.modelo.Factura;
import ar.untdf.pizzeria.pizzeria.modelo.Pedido;
import ar.untdf.pizzeria.pizzeria.modelo.Pizza;
import ar.untdf.pizzeria.pizzeria.modelo.TamanioPizza;
import ar.untdf.pizzeria.pizzeria.modelo.TipoPizza;
import ar.untdf.pizzeria.pizzeria.modelo.VariedadPizza;
import ar.untdf.pizzeria.pizzeria.vista.VistaPrincipal;
import java.util.List;
import java.util.logging.Level;
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
public class Principal {
    
    /**
     * Punto de inicio de la aplicación
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metaData = new MetadataSources(standardRegistry)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metaData.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        //// 
        
        List<TamanioPizza> tamanos = session.createQuery("from TamanioPizza")
                .list();
        System.out.println(tamanos);
        
        List<TipoPizza> tipos = session.createQuery("from TipoPizza")
                .list();
        System.out.println(tipos);
        
        List<VariedadPizza> variedades = session.createQuery("from VariedadPizza")
                .list();
        System.out.println(variedades);
        
        List<Pizza> pizzas = session.createQuery("from Pizza")
                .list();
        System.out.println(pizzas);
        
        List<EstadoFactura> estFac = session.createQuery("from EstadoFactura")
                .list();
        System.out.println(estFac);
        
        List<Factura> facturas = session.createQuery("from Factura")
                .list();
        System.out.println(facturas);
        
        List<EstadoPedido> estPed = session.createQuery("from EstadoPedido")
                .list();
        System.out.println(estPed);
        
        List<Pedido> pedidos = session.createQuery("from Pedido")
                .list();
        System.out.println(pedidos);
        
        List<DetallePedido> detP = session.createQuery("from DetallePedido")
                .list();
        System.out.println(detP);
        
        ///
        session.close();
        sessionFactory.close();
        
        
        VistaPrincipal vp = new VistaPrincipal(tamanos);
        vp.setVisible(true);
    }
    
}
