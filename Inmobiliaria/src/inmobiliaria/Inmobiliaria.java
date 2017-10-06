package inmobiliaria;

public class Inmobiliaria {

    public static void main(String[] args) {
        Localidad ushuaia;
        ushuaia = new Localidad("Ushuaia", "9410");
        
        Vivienda casaFede = new Vivienda(3, "Garcia Marquez", 4466, "Alquiler", 10000D);
        Inmueble casaKari = new Inmueble("25 de mayo", 333, "Compra", 1200000D);
        
        casaFede.localidad = ushuaia;
        casaKari.localidad = ushuaia;
        
        System.out.println(casaFede); // llama implicitamente a casaFede.toString()
        System.out.println(casaKari.domicilio());
    }
    
}
