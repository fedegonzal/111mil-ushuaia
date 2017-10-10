package inmobiliaria;

public class Vivienda extends Inmueble {
    
    int dormitorios;
    boolean patio;
    boolean mascotas;

    public Vivienda(int dormitorios, String calle, String numero, String operacion, Double precio) {
    
        super(calle, numero, operacion, precio);
        this.dormitorios = dormitorios;
    
    }
    
    @Override
    public String domicilio() {
        return this.calle + " " + this.numero;
    }

    @Override
    public String toString() {
        return this.domicilio() + ". Dormitorios: " + dormitorios;
    }
    
    
}
