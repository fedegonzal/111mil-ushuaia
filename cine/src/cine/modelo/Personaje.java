
package cine.modelo;

import cine.modelo.Pelicula.Pelicula;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Personaje")
public class Personaje implements Serializable {

    //
    // Atributos
    //
    
    @Id
    @Column(name="id_personaje")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_personaje;
    
    @Column(name = "nombre_en_pelicula")
    private String nombreEnPelicula;
    
    @ManyToMany(mappedBy = "personajes")
    private List<Pelicula> peliculas;
    
    /**
     * Relacion: un actor tiene/pertenece a un Actor.
     * Le explico que columna hace el vínculo
     */
    @ManyToOne
    @JoinColumn(name = "id_actor")
    private Actor actor;
    
    /**
     * Relacion: un actor tiene/pertenece a un Rol.
     * Le explico que columna hace el vínculo
     */
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    /**
     * Constructor vacío. Requerido por hibernate
     */
    public Personaje() {
    }    
    
    /**
     * Conversión de la clase a string
     * 
     * @return
     */
    @Override
    public String toString() {
        return this.nombreEnPelicula;
    }
    
    //
    // Getters y Setters
    //
    
    
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
