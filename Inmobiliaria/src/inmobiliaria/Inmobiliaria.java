package inmobiliaria;

import static inmobiliaria.ArrayInmuebles.inmuebles;
import utilitarios.Utils;

public class Inmobiliaria {

    public static void main(String[] args) {

//        ejer1();
//        ejer2();
//        ejer3();
//        ejer4();
//        ejer5();
//        ejer6();
        ejer7();

    }

    /**
     * 1. Listar el domicilio del primer inmueble
     */
    public static void ejer1() {
        System.out.println(inmuebles[0].domicilio());
    }

    /**
     * 2. Listar todos los domicilios de todos los inmuebles
     */
    public static void ejer2() {
        for (int i = 0; i < inmuebles.length; i++) {
            System.out.println(inmuebles[i].domicilio());
        }

        for (Inmueble inmueble : inmuebles) {
            System.out.println(inmueble.domicilio());
        }
    }

    /**
     * 3. Contar los inmuebles que quedan en calle "Primera Junta"
     */
    public static void ejer3() {

        int cant = 0;
        for (int i = 0; i < inmuebles.length; i++) {
            if (inmuebles[i].getCalle() == "Primera Junta") {
                cant++;
            }
        }
        System.out.println("Cant primera junta: " + cant);

        cant = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getCalle().equals("Primera Junta")) {
                cant++;
            }
        }
        System.out.println("Cant primera junta: " + cant);
    }

    /**
     * 4. Contar los inmuebles que tengan un alquiler mayor a 5000
     */
    public static void ejer4() {

        int cant = 0;
        for (int i = 0; i < inmuebles.length; i++) {
            if (inmuebles[i].getPrecio() > 5000) {
                cant++;
            }
        }
        System.out.println("Cant > 5000: " + cant);

        cant = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getPrecio() > 5000) {
                cant++;
            }
        }
        System.out.println("Cant > 5000: " + cant);
    }

    /**
     * 5. Calcular el promedio de los alquileres en la ciudad de Santa Fe
     */
    public static void ejer5() {
        int cantSF = 0;
        double sumaSF = 0;
        for (int i = 0; i < inmuebles.length; i++) {
            if (inmuebles[i].getLocalidad().getNombre() == "Santa Fe") {
                cantSF++;
                sumaSF = sumaSF + inmuebles[i].getPrecio();
            }
        }
        System.out.println("Prom SF: " + (sumaSF / cantSF));

        cantSF = 0;
        sumaSF = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getLocalidad().getNombre().equals("Santa Fe")) {
                cantSF++;
                sumaSF = sumaSF + inmueble.getPrecio();
            }
        }
        System.out.println("Prom SF: " + (sumaSF / cantSF));
    }

    /**
     * 6. Comparar el promedio de alquileres de las ciudades de Santa Fe y Santo
     * Tomé, e indicar cuál de las dos ciudades es más cara.
     */
    public static void ejer6() {
        int cantSF = 0;
        double sumaSF = 0;
        int cantST = 0;
        double sumaST = 0;
        for (int i = 0;
                i < inmuebles.length;
                i++) {
            if (inmuebles[i].getLocalidad().getNombre() == "Santa Fe") {
                cantSF++;
                sumaSF = sumaSF + inmuebles[i].getPrecio();
            } else if (inmuebles[i].getLocalidad().getNombre() == "Santo Tomé") {
                cantST++;
                sumaST = sumaST + inmuebles[i].getPrecio();
            }
        }

        double promSF = sumaSF / cantSF;
        double promST = sumaST / cantST;

        if (promSF > promST) {
            System.out.println("SF es más caro");
        } else if (promSF < promST) {
            System.out.println("ST es más caro");
        } else {
            System.out.println("ST y SF tienen igual prodio");
        }

        cantSF = 0;
        sumaSF = 0;
        cantST = 0;
        sumaST = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getLocalidad().getNombre().equals("Santa Fe")) {
                cantSF++;
                sumaSF = sumaSF + inmueble.getPrecio();
            } else if (inmueble.getLocalidad().getNombre().equals("Santo Tomé")) {
                cantST++;
                sumaST = sumaST + inmueble.getPrecio();
            }
        }

        promSF = sumaSF / cantSF;
        promST = sumaST / cantST;

        if (promSF > promST) {
            System.out.println("SF es más caro");
        } else if (promSF < promST) {
            System.out.println("ST es más caro");
        } else {
            System.out.println("ST y SF tienen igual prodio");
        }
    }

    /**
     * 7. Preguntar al usuario que método de pago utilizó para cancelar su
     * compra. Luego imprimir en consola el descuento que se aplica a la forma
     * de pago. Los medios de pagos y descuentos son los siguientes: - "E" =
     * Efectivo -> corresponde 30% - "D" = Débito -> corresponde 20% - "C" =
     * Crédito -> corresponde 10% - Otros medios de pago -> NO tienen descuento
     */
    public static void ejer7() {
        // pregunto al usuario por la forma de pago
        String medioPago = Utils.consolePrompt("Ingrese un medio de pago: ");

        // evalúo el valor ingresado
        switch (medioPago) {
            // en caso de que sea "E" o "e", es efectivo (30%)
            case "E":
            case "e":
                System.out.println("Tiene un descuento del 30%");
                break;
            // en caso de que sea "D" o "d", es débito (20%)
            case "D":
            case "d":
                System.out.println("Tiene un descuento del 20%");
                break;
            // en caso de que sea "C" o "c", es Tarjeta de crédito (10%)
            case "C":
            case "c":
                System.out.println("Tiene un descuento del 10%");
                break;
            // si no ingreso ninguno de los anteriores, no tiene descuento
            default:
                System.out.println("NO tiene un descuento =(");
        }
    }
}
