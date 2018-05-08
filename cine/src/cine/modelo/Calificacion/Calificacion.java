
package cine.modelo.Calificacion;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Declaro que esta clase se condice con la tabla "Calificacion"
 */
@Entity
@Table(name="Calificacion")
public class Calificacion implements Serializable {
 
    //
    // Atributos
    //
    
    /**
     * Clave primaria, es requerida
     */
    @Id
    @Column(name="id_calificacion")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_calificacion;
    
    /**
     * Columna nombre
     */
    @Column(name="nombre")
    private String nombre;

    /**
     * Constructor vacío. Requirido por hibernate
     */
    public Calificacion() {
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    
    
    //
    // Getters y Setters
    //

    /**
     * 
     * @return 
     */
    public int getId_calificacion() {
        return id_calificacion;
    }

    /**
     * 
     * @param id_calificacion 
     */
    public void setId_calificacion(int id_calificacion) {
        this.id_calificacion = id_calificacion;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
