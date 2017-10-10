package inmobiliaria;

public class Localidad {

    String nombre;
    String codPostal;
    Long habitantes;

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public Localidad(String nombre, String codPostal) {
        this.nombre = nombre;
        this.codPostal = codPostal;
    }

}
