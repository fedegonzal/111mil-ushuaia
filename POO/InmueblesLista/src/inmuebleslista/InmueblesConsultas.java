package inmuebleslista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InmueblesConsultas {
    
    Connection conexion;
    String jdbc = "jdbc:mysql://localhost:3306/inmobiliaria";
    String usuario = "root";
    String password = "123456";
    
    /**
     * aqui obtendré todos los inmuebles
     * @return 
     */
    public ResultSet getTodos() {
        
        try {
            
            this.conexion = DriverManager.getConnection(this.jdbc, this.usuario, this.password);
            Statement statement = this.conexion.createStatement();
            
            String sqlString = 
                "SELECT\n"
                + "CONCAT(rvi_inmuebles.domicilio_calle, ' ', rvi_inmuebles.domicilio_numero) as domicilio,\n"
                + "CONCAT(cfg_operaciones.nombre) as operacion,\n"
                + "CONCAT(cfg_monedas.nombre, rvi_ofertas.precio) as precio,\n"
                + "CONCAT(postal_localidades.nombre) as localidad\n"
                + "FROM\n"
                + "rvi_inmuebles\n"
                + "INNER JOIN rvi_ofertas ON rvi_inmuebles.id_inmueble = rvi_ofertas.id_inmueble\n"
                + "INNER JOIN cfg_monedas ON rvi_ofertas.id_moneda = cfg_monedas.id_moneda\n"
                + "INNER JOIN cfg_operaciones ON rvi_ofertas.id_operacion = cfg_operaciones.id_operacion\n"
                + "INNER JOIN postal_localidades ON rvi_inmuebles.id_localidad = postal_localidades.id_localidad";

            ResultSet rs = statement.executeQuery(sqlString);
            
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(InmueblesConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    } 
    
    public ResultSet getCantPorLocalidad() {
        // aqui obtendré la cantidad de inmuebles por localidad
        System.out.println("getCantPorLocalidad");
        
        
        String sqlString = 
            "SELECT CONCAT(postal_localidades.nombre) as localidad, count(postal_localidades.nombre) as CANTIDAD\n"
            + " FROM rvi_inmuebles\n"
            + " INNER JOIN postal_localidades ON rvi_inmuebles.id_localidad = postal_localidades.id_localidad\n"
            + " GROUP BY postal_localidades.nombre\n"
            + " ORDER BY cantidad DESC";
        
        return null;
    } 
    
    public ResultSet getInmueblesPorLocalidad(String localidad) {
        // aqui obtendré los inmuebles de una localidad
        System.out.println("getInmueblesPorLocalidad");
        
        String sqlString = 
            "SELECT \n"
            + " CONCAT(rvi_inmuebles.domicilio_calle, ' ', rvi_inmuebles.domicilio_numero) as domicilio,\n"
            + " CONCAT(cfg_operaciones.nombre) as operacion,\n"
            + " CONCAT (cfg_monedas.nombre, rvi_ofertas.precio) as precio,\n"
            + " postal_localidades.nombre as localidad\n"
            + " FROM\n"
            + " rvi_inmuebles\n"
            + " INNER JOIN rvi_ofertas ON rvi_inmuebles.id_inmueble = rvi_ofertas.id_inmueble\n"
            + " INNER JOIN cfg_monedas ON rvi_ofertas.id_moneda = cfg_monedas.id_moneda\n"
            + " INNER JOIN cfg_operaciones ON rvi_ofertas.id_operacion = cfg_operaciones.id_operacion\n"
            + " INNER JOIN postal_localidades ON postal_localidades.id_localidad = rvi_inmuebles.id_localidad"
            + " WHERE postal_localidades.nombre LIKE '%" + localidad + "%' ";
        
        return null;
    } 
    
}
