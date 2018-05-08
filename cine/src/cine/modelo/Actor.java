package cine.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Actor")
public class Actor implements Serializable {
    
    //
    // Atributos
    //
    
    @Id
    @Column(name="id_actor")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_actor;
    
    @Column(name = "animado")
    private boolean animado;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "nombre")
    private String nombre;
    
    /**
     * Relacion: un actor tiene/pertenece a un Sexo.
     * Le explico que columna hace el vínculo
     */
    @ManyToOne
    @JoinColumn(name = "id_sexo")
    private Sexo sexo;

    /**
     * Constructor vacío. Requirido por hibernate
     */
    public Actor() {
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
     * Conversión de la clase a string
     * 
     * @return
     */
    @Override
    public String toString() {
        return this.nombreCompleto();
    }
    
    //
    // Getters y Setters
    //

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
}
