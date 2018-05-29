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
public class TipoPizza implements Serializable {
    
    @Id
    @Column(name="id_tipo_pizza")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    /**
     * Constructor por defecto de la clase TipoPizza.
     */
    public TipoPizza() {
    }
   
    /**
     * Constructor con todos los atributos de la clase TipoPizza.
     * @param nombre
     * @param descripcion 
     */
    public TipoPizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
