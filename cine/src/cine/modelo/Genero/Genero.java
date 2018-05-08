package cine.modelo.Genero;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Genero")
public class Genero implements Serializable {

    //
    // Atributos
    //
    
    @Id
    @Column(name="id_genero")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_genero;
    
    @Column(name="nombre")
    private String nombre;

    /**
     * Constructor vacío. Requirido por hibernate
     */
    public Genero() {
    }
    
    @Override
    public String toString() {
        return this.getNombre();
    }

    //
    // Getters y Setters
    //

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
