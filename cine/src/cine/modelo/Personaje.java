
package cine.modelo;

/**
 *
 * @author leo
 */
public class Personaje {

    private int id_personaje;
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;

    public Personaje(int id_personaje, String nombreEnPelicula, Actor actor, Rol rol) {
        this.id_personaje = id_personaje;
        this.nombreEnPelicula = nombreEnPelicula;
        this.actor = actor;
        this.rol = rol;
    }
    
    @Override
    public String toString() {
        return this.nombreEnPelicula;
    }

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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
}
