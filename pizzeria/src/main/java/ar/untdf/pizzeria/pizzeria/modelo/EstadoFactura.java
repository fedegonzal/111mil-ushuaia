
package ar.untdf.pizzeria.pizzeria.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EstadoFactura implements Serializable {
    
    @Id
    @Column(name="id_estado_factura")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nombre;
    
    /**
     * Constructor por defecto de la clase Estado.
     */
    public EstadoFactura() {
    }
    
    /**
     * Constructor con todos los atributos de la clase Estado.
     * @param nombre 
     */
    public EstadoFactura(String nombre) {
        this.nombre = nombre;
    }
    
    
    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
