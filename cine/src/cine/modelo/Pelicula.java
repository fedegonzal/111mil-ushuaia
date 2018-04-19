
package cine.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author leo
 */
public class Pelicula {

    private int id_pelicula;
    private int anio_estreno;
    private boolean disponible;
    /**
     * Duracion en minutos
     */
    private int duracion;
    private Date fecha_ingreso;
    private String nombre;
    private String titulo_original;
    private PaisDeOrigen pais;
    private Genero genero;
    private Calificacion calificacion;

    public Pelicula(int id_pelicula, int anio_estreno, boolean disponible, int duracion, Date fecha_ingreso, String nombre, String titulo_original, PaisDeOrigen pais, Genero genero, Calificacion calificacion) {
        this.id_pelicula = id_pelicula;
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

    @Override
    public String toString() {
        return getNombre() + " (" + getAnio_estreno() + ")";
    }
    
    
    
}
