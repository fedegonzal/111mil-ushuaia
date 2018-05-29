
package ar.untdf.pizzeria.pizzeria.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Pizza implements Serializable {
    
    @Id
    @Column(name="id_pizza")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nombre;
    
    @Column
    private BigDecimal precio;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_pizza")
    private TipoPizza tipoPizza;
    
    @ManyToOne
    @JoinColumn(name = "id_variedad_pizza")
    private VariedadPizza variedad;
    
    @ManyToOne
    @JoinColumn(name = "id_tamanio_pizza")
    private TamanioPizza tamanio;

    /**
     * Constructor por Defecto.
     */
    public Pizza() {
    }
    
    /**
     * Constructor sin atributos referenciales de la clase Pizza.
     * @param nombre
     * @param precio 
     */
    public Pizza(String nombre, BigDecimal precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    /**
     * Constructor con todos los atributos de la clase Pizza.
     * @param nombre
     * @param precio
     * @param tipoPizza
     * @param variedad
     * @param tamanio 
     */
    public Pizza(String nombre, BigDecimal precio, TipoPizza tipoPizza, VariedadPizza variedad, TamanioPizza tamanio) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoPizza = tipoPizza;
        this.variedad = variedad;
        this.tamanio = tamanio;
    }
    
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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public TipoPizza getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(TipoPizza tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public VariedadPizza getVariedad() {
        return variedad;
    }

    public void setVariedad(VariedadPizza variedad) {
        this.variedad = variedad;
    }

    public TamanioPizza getTamanio() {
        return tamanio;
    }

    public void setTamanio(TamanioPizza tamanio) {
        this.tamanio = tamanio;
    }    

    @Override
    public String toString() {
        return "Pizza: " + this.getNombre() 
                + "(" + this.getTipoPizza() + "-" 
                + this.getVariedad() + "-" 
                + this.getTamanio() + ")";
    }
    
    
}
