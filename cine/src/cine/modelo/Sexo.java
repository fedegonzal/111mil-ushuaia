package cine.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sexo")
public class Sexo implements Serializable {
    
    //
    // Atributos
    //
    
    @Id
    @Column(name="id_sexo")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_sexo;
    
    @Column(name="nombre")
    private String nombre;
    
    /**
     * Constructor vacío. Requirido por hibernate
     */
    public Sexo(){
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
     * Retorna el ID
     * @return 
     */
    public int getId_sexo() {
        return id_sexo;
    }

    /**
     * Actualiza el ID
     * @param id_sexo 
     */
    public void setId_sexo(int id_sexo) {
        this.id_sexo = id_sexo;
    }    
    
    
    /**
     * Retorna el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre.trim(); // aplicamos "trim()" para sacar los espacios en blanco
    }
}
