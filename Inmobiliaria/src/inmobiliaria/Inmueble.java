package inmobiliaria;

public class Inmueble {

    String calle;
    int numero;
    String operacion;
    Double precio;
    boolean gasNatural;
    String descripcion;
    Localidad localidad;

    public Inmueble(String calle, int numero, String operacion, Double precio) {
        this.calle = calle;
        this.numero = numero;
        this.operacion = operacion;
        this.precio = precio;
    }
    
    public String domicilio() {
        return this.calle + " " + this.numero + " " + this.localidad.nombre;
    }
}
