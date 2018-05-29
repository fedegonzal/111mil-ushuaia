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
public class TamanioPizza implements Serializable {
    
    @Id
    @Column(name="id_tamanio_pizza")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "cant_porciones")
    private int cantPorciones;
    
    @Column
    private String nombre;

    /**
     * Constructor por defecto de la clase TamanioPizza.
     */
    public TamanioPizza() {
    }
    
    /**
     * Constructor con todos los atributos de la clase TamanioPizza.
     * @param cantPorciones
     * @param nombre 
     */
    public TamanioPizza(int cantPorciones, String nombre) {
        this.cantPorciones = cantPorciones;
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
    
    public int getCantPorciones() {
        return cantPorciones;
    }

    public void setCantPorciones(int cantPorciones) {
        this.cantPorciones = cantPorciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + "(" + this.getCantPorciones() + ")";
    }
}
