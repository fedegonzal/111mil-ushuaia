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
public class VariedadPizza implements Serializable {
    
    @Id
    @Column(name="id_variedad_pizza")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String ingredientes;
    
    @Column
    private String nombre;

    /**
     * Constructor por defecto de la clase VariedadPizza.
     */
    public VariedadPizza() {
    }
    
    /**
     * Constructor con todos los atributos de la clase VariedadPizza.
     * @param ingredientes
     * @param nombre 
     */
    public VariedadPizza(String ingredientes, String nombre) {
        this.ingredientes = ingredientes;
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
    
    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
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
