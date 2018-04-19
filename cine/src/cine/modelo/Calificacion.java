/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.modelo;

/**
 *
 * @author leo
 */
public class Calificacion {
    private int id_calificacion;
    private String nombre;

    public Calificacion() {
    }
    
    

    public Calificacion(int id_calificacion, String nombre) {
        this.id_calificacion = id_calificacion;
        this.nombre = nombre;
    }

    public int getId_calificacion() {
        return id_calificacion;
    }

    public void setId_calificacion(int id_calificacion) {
        this.id_calificacion = id_calificacion;
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
