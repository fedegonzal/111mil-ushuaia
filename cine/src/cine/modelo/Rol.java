package cine.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rol")
public class Rol implements Serializable {
    
    //
    // Atributos
    //
    
    @Id
    @Column(name="id_rol")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_rol;
    
    @Column(name = "nombre")
    private String nombre;

    /**
     * Constructor vacío. Requirido por hibernate
     */
    public Rol() {
    }
    
    /**
     * Conversión de la clase a string
     * 
     * @return
     */
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
    public int getId_rol() {
        return id_rol;
    }

    /**
     * Actualiza el ID
     * @param id_rol 
     */
    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
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
