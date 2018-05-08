package cine.modelo.Pelicula;

import cine.modelo.Calificacion.Calificacion;
import cine.modelo.Genero.Genero;
import cine.modelo.PaisDeOrigen.PaisDeOrigen;
import cine.modelo.Personaje;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pelicula")
public class Pelicula implements Serializable {

    //
    // Atributos
    //
    
    @Id
    @Column(name="id_pelicula")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_pelicula;
    
    @Column(name="anio_estreno")
    private int anio_estreno;

    @Column(name="disponible")
    private boolean disponible;

    @Column(name="duracion")
    private int duracion;

    @Column(name="fecha_ingreso")
    private Date fecha_ingreso;

    @Column(name="nombre")
    private String nombre;

    @Column(name="titulo_original")
    private String titulo_original;

    @ManyToOne
    @JoinColumn(name = "id_pais_de_origen")
    private PaisDeOrigen pais;
    
    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;
    
    @ManyToOne
    @JoinColumn(name = "id_calificacion")
    private Calificacion calificacion;
    
    @ManyToMany(fetch = FetchType.EAGER) // EAGER para que siempre traiga la relacion
    @JoinTable(
        name = "Reparto", // nombre de la tabla intermedia que los vincula
        joinColumns =  { // campos que identifican a Pelicula
            // name = tabla del medio  - columna en reparto
            // referencedColumnName la tabla pelicula
            @JoinColumn(name = "id_pelicula", referencedColumnName = "id_pelicula")
        }, 
        inverseJoinColumns = { // campos que identifican a Personaje
            // name = tabla del medio  - columna en reparto
            // referencedColumnName la tabla personaje
            @JoinColumn(name = "id_personaje", referencedColumnName = "id_personaje")
        }
    )
    private List<Personaje> personajes;

    /**
     * 
     */
    public Pelicula() {
    }
    
    /**
     * 
     * @param anio_estreno
     * @param disponible
     * @param duracion
     * @param fecha_ingreso
     * @param nombre
     * @param titulo_original
     * @param pais
     * @param genero
     * @param calificacion 
     */
    public Pelicula(int anio_estreno, boolean disponible, int duracion, Date fecha_ingreso, String nombre, String titulo_original, PaisDeOrigen pais, Genero genero, Calificacion calificacion) {
        this.anio_estreno = anio_estreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fecha_ingreso = fecha_ingreso;
        this.nombre = nombre;
        this.titulo_original = titulo_original;
        this.pais = pais;
        this.genero = genero;
        this.calificacion = calificacion;
    }
    
    @Override
    public String toString() {
        return getNombre() + " (" + getAnio_estreno() + ")";
    }
    
    //
    // Getters y Setters
    //

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public int getAnio_estreno() {
        return anio_estreno;
    }

    public void setAnio_estreno(int anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo_original() {
        return titulo_original;
    }

    public void setTitulo_original(String titulo_original) {
        this.titulo_original = titulo_original;
    }

    public PaisDeOrigen getPais() {
        return pais;
    }

    public void setPais(PaisDeOrigen pais) {
        this.pais = pais;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }   
}
