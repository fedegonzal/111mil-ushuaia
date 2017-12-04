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
    
    /**
     * aqui obtendré todos los inmuebles
     * @return 
     */
    public ResultSet getTodos() {
        
        try {
            
            this.conexion = DriverManager.getConnection(this.jdbc, "root", "");
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
            
            System.out.println(rs.getMetaData());
            
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(InmueblesConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    } 
    
    public void getCantPorLocalidad() {
        // aqui obtendré la cantidad de inmuebles por localidad
        System.out.println("getCantPorLocalidad");
    } 
    
    public void getInmueblesPorLocalidad(String localidad) {
        // aqui obtendré los inmuebles de una localidad
        System.out.println("getInmueblesPorLocalidad");
    } 
    
}
