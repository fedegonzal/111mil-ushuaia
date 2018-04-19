package cine.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PaisDeOrigen")
public class PaisDeOrigen {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_pais_de_origen")
    private int id_pais_origen;
    
    @Column(name="idioma")
    private String idioma;
    
    @Column(name="nombre")
    private String nombre;

    public PaisDeOrigen() {
    }

    public PaisDeOrigen(int id_pais_origen, String idioma, String nombre) {
        this.id_pais_origen = id_pais_origen;
        this.idioma = idioma;
        this.nombre = nombre;
    }

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
    
    @Override
    public String toString() {
        return getNombre();
    }
    
}
