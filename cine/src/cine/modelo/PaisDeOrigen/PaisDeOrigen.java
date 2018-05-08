package cine.modelo.PaisDeOrigen;

import cine.modelo.Pelicula.Pelicula;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PaisDeOrigen")
public class PaisDeOrigen implements Serializable {
    
    //
    // Atributos
    //
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_pais_de_origen")
    private int id_pais_origen;
    
    @Column(name="idioma")
    private String idioma;
    
    @Column(name="nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "pais")
    private List<Pelicula> peliculas;

    /**
     * 
     */
    public PaisDeOrigen() {
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return getNombre();
    }
    
    //
    // Getters y Setters
    //

    public int getId_pais_origen() {
        return id_pais_origen;
    }

    public void setId_pais_origen(int id_pais_origen) {
        this.id_pais_origen = id_pais_origen;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
}
