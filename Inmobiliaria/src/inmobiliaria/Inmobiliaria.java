package inmobiliaria;

import static inmobiliaria.ArrayInmuebles.inmuebles;

public class Inmobiliaria {

    public static void main(String[] args) {

        ejer1();
        ejer2();
        ejer3();
        ejer4();
        ejer5();
        ejer6();

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
            if (inmuebles[i].calle == "Primera Junta") {
                cant++;
            }
        }
        System.out.println("Cant primera junta: " + cant);

        cant = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.calle == "Primera Junta") {
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
            if (inmuebles[i].precio > 5000) {
                cant++;
            }
        }
        System.out.println("Cant > 5000: " + cant);

        cant = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.precio > 5000) {
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
            if (inmuebles[i].localidad.nombre == "Santa Fe") {
                cantSF++;
                sumaSF = sumaSF + inmuebles[i].precio;
            }
        }
        System.out.println("Prom SF: " + (sumaSF / cantSF));

        cantSF = 0;
        sumaSF = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.localidad.nombre.equals("Santa Fe")) {
                cantSF++;
                sumaSF = sumaSF + inmueble.precio;
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
            if (inmuebles[i].localidad.nombre == "Santa Fe") {
                cantSF++;
                sumaSF = sumaSF + inmuebles[i].precio;
            } else if (inmuebles[i].localidad.nombre == "Santo Tomé") {
                cantST++;
                sumaST = sumaST + inmuebles[i].precio;
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
            if (inmueble.localidad.nombre.equals("Santa Fe")) {
                cantSF++;
                sumaSF = sumaSF + inmueble.precio;
            } else if (inmueble.localidad.nombre.equals("Santo Tomé")) {
                cantST++;
                sumaST = sumaST + inmueble.precio;
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
}
