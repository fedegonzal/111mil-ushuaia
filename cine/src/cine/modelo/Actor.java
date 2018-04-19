
package cine.modelo;

/**
 *
 * @author leo
 */
public class Actor {
    private int id_actor;
    private boolean animado;
    private String apellido;
    private String nombre;
    private Sexo sexo;

    public Actor(int id_actor, boolean animado, String apellido, String nombre, Sexo sexo) {
        this.id_actor = id_actor;
        this.animado = animado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    /**
     * Devuelve la cantidad de peliculas en las que participo el actor
     * @return 
     */
    public int cantPeliculas() {
        // @TODO
        return 0;
    }
    
    /**
     * Devuelve la cantidad de peliculas en las que participo el actor, para un anio especifico
     * @param anio
     * @return 
     */
    public int cantPeliculas(int anio) {
        // @TODO
        return 0;
    }
    
    /**
     * Retorna el apellido concatenado con el nombre
     * @return 
     */
    public String nombreCompleto() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * @return the id_actor
     */
    public int getId_actor() {
        return id_actor;
    }

    /**
     * @param id_actor the id_actor to set
     */
    public void setId_actor(int id_actor) {
        this.id_actor = id_actor;
    }

    /**
     * @return the animado
     */
    public boolean isAnimado() {
        return animado;
    }

    /**
     * @param animado the animado to set
     */
    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return this.getApellido() + " " + this.getNombre();
    }
    
    
}
