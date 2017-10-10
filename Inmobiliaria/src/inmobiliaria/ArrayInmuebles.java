/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author Federico
 */
public interface ArrayInmuebles {
    Localidad santafe = new Localidad("Santa Fe");
    Localidad santotome = new Localidad("Santo Tomé");
    Localidad colastine = new Localidad("Colastiné");
    Localidad arijon = new Localidad("Desvío Arijón");
    Localidad sauceviejo = new Localidad("Sauce Viejo");
    Localidad helvecia = new Localidad("Helvecia");
    Localidad arroyoleyes = new Localidad("Arroyo Leyes");
    Localidad aguiar = new Localidad("Desvío Aguiar");

    // En este Array se guarda la info de todos los inmuebles
    static Inmueble inmuebles[] = new Inmueble[] {
        new Inmueble("Iturraspe", "2405", "Alquiler", 8500D, santafe),
        new Inmueble("1ra Junta", "4845", "Compra", 5500000D, santotome),
        new Inmueble("1ra Junta", "4845", "Alquiler", 35000D, santotome),
        new Inmueble("Primera Junta", "4861", "Compra", 3500000D, santotome),
        new Inmueble("Primera Junta", "4861", "Alquiler", 30000D, santotome),
        new Inmueble("Suipacha", "2423 Piso 1 of 3", "Compra", 850000D, santafe),
        new Inmueble("Ctda.Bustamante", "2215 P.1 D.5", "Alquiler", 4000D, santafe),
        new Inmueble("Corrientes", "2651 U.12", "Compra", 320000D, santafe),
        new Inmueble("4 de enero", "2089", "Alquiler", 6000D, santafe),
        new Inmueble("Mendoza", "2905 P.2 D.3", "Alquiler", 3800D, santafe),
        new Inmueble("Derqui", "2196", "Compra", 1800000D, santotome),
        new Inmueble("Grand Bourg", "4301", "Compra", 200000D, santafe),
        new Inmueble("Junin", "2437 P.5", "Compra", 120000D, santafe),
        new Inmueble("Av.F.Zuviria", "4664 T.1 P.4 D B", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4664 T.1 P.6 D.A", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4664 T.1 P.5 D.A", "Alquiler", 6500D, santafe),
        new Inmueble("San Jose", "2254 P.1 D.4", "Alquiler", 6000D, santafe),
        new Inmueble("Patricio Cullen", "6519", "Compra", 2200000D, santafe),
        new Inmueble("Publica", "S/N", "Compra", 400000D, santotome),
        new Inmueble("Estanislao del Campo", "2728 Altos y Bajos", "Alquiler", 7500D, santafe),
        new Inmueble("Pasaje Dean Funes", "2818", "Compra", 2500000D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.5 Confrafrente Norte", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.5 Contrafrente Sur", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.5 Frente Sur", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.5 Frente Norte", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.4 Frente Norte", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.4 Frente Sur", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.4 Contrafrente Sur", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.4 Contrafrente Norte", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.3 Contrafrente Norte", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.3 Contrafrente Sur", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.3 Frente Sur", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.3 Frente Norte", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.2 Frente Norte", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.2 Frente Sur", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 Contrafrente Sur", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.2 Contrafrente Norte", "Alquiler", 6300D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.1 Contrafrente Norte", "Alquiler", 6500D, santafe),
        new Inmueble("Av.F.Zuviria", "4937 P.1 Contrafrente Sur", "Alquiler", 6500D, santafe),
        new Inmueble("2 Lagunas Barrio Privado", "Lote NÂº85", "Compra", 80000D, santafe),
        new Inmueble("Saavedra", "5181", "Compra", 100000D, santafe),
        new Inmueble("Corrientes", "2903 Dto.2 Planta Alta-Frente", "Alquiler", 6500D, santafe),
        new Inmueble("Alberdi", "3050 D.1", "Compra", 1600000D, santafe),
        new Inmueble("Los Zorzales", "6149 -Ruta 1 Km 2,5", "Alquiler", 4000D, colastine),
        new Inmueble("Rivadavia", "2553 Piso 1 Oficina 81", "Alquiler", 3000D, santafe),
        new Inmueble("Juan de Garay", "1262", "Compra", 2800000D, santotome),
        new Inmueble("RUTA N.1", "KM 8.5", "Compra", 4100000D, santafe),
        new Inmueble("Moreno", "2763", "Compra", 155000D, santafe),
        new Inmueble("Eva Peron", "2647 Piso 5 Dto.A-Frente", "Alquiler", 7900D, santafe),
        new Inmueble("Hipolito Irigoyen", "2609 Piso 3 Dto.2", "Alquiler", 7500D, santafe),
        new Inmueble("Corrientes", "2733", "Compra", 590000D, santafe),
        new Inmueble("4 de Enero", "3734", "Compra", 4000000D, santafe),
        new Inmueble("Av.A.del Valle", "9200", "Alquiler", 40000D, santafe),
        new Inmueble("4 de Enero", "2850 P.4 D.3", "Compra", 1600000D, santafe),
        new Inmueble("Av. Lujan", "2200", "Compra", 4800000D, santotome),
        new Inmueble("Alte. Brown", "1778", "Compra", 2100000D, santotome),
        new Inmueble("Guemes", "2036", "Compra", 3100000D, santotome),
        new Inmueble("Ulibarrie", "1113", "Compra", 2000000D, santotome),
        new Inmueble("Eva Peron", "2409 Piso 1- COCHERA 30", "Alquiler", 1000D, santafe),
        new Inmueble("Bv. Pellegrini", "2862", "Compra", 1700000D, santafe),
        new Inmueble("Eva Peron", "2409-Piso 3 - COCHERA 94", "Alquiler", 1200D, santafe),
        new Inmueble("Eva Peron", "2409-Piso 3 - COCHERA 95", "Alquiler", 1200D, santafe),
        new Inmueble("Eva Peron", "2409-Piso 1 - COCHERA 69", "Alquiler", 1200D, santafe),
        new Inmueble("4 de Enero", "2850 Cochera 9- Subsuelo", "Alquiler", 700D, santafe),
        new Inmueble("Salta", "2562", "Compra", 200000D, santafe),
        new Inmueble("San Martin", "2753 COCHERA 31", "Alquiler", 1150D, santafe),
        new Inmueble("Primera Junta", "2515", "Alquiler", 16000D, santafe),
        new Inmueble("Primera Junta", "2507 Piso 3- Oficina 8", "Alquiler", 2600D, santafe),
        new Inmueble("Rivadavia", "2861  L.3", "Compra", 90000D, santafe),
        new Inmueble("Espora", "2869", "Compra", 1500000D, santafe),
        new Inmueble("Cordoba", "3247", "Compra", 235000D, santafe),
        new Inmueble("4 de Enero", "2850 P.6 D.3", "Compra", 1550000D, santafe),
        new Inmueble("España", "casi Salta", "Compra", 890000D, arijon),
        new Inmueble("San Martin", "2171 Local 2-P.Baja-Galeria Sol Garden", "Alquiler", 6500D, santafe),
        new Inmueble("matheu", "s/n", "Compra", 450000D, santafe),
        new Inmueble("El mate", "1287", "Alquiler", 6000D, sauceviejo),
        new Inmueble("San Jeronimo", "1800 4to piso nº124", "Compra", 21000D, santafe),
        new Inmueble("Publica", "S/N", "Compra", 165000D, helvecia),
        new Inmueble("Mendoza", "3261 P.4 D.2", "Compra", 1250000D, santafe),
        new Inmueble("Martinez", "3363", "Compra", 400000D, santotome),
        new Inmueble("1° de Mayo", "S/N", "Alquiler", 6500D, santotome),
        new Inmueble("Novena", "S/Nº", "Compra", 550000D, arroyoleyes),
        new Inmueble("4 de Enero", "1809-11", "Alquiler", 3000D, santafe),
        new Inmueble("4 de Enero", "1807", "Alquiler", 3500D, santafe),
        new Inmueble("Noruega", "1269", "Compra", 155000D, sauceviejo),
        new Inmueble("Colon", "2012", "Compra", 1800000D, santotome),
        new Inmueble("Belgrano", "3356", "Alquiler", 7000D, santotome),
        new Inmueble("Barrio el POZO TORRE 14", "PISO 9", "Compra", 1250000D, santafe),
        new Inmueble("Victoria Ocampo E/Roverano y", "T. Lubary", "Compra", 250000D, santotome),
        new Inmueble("Rivadavia", "6924 Local 2", "Alquiler", 4500D, santafe),
        new Inmueble("San Martin", "1869 P.4", "Compra", 1600000D, santafe),
        new Inmueble("Estado de Israel", "4982", "Compra", 750000D, santafe),
        new Inmueble("publica s/n", "s/n", "Compra", 1100000D, aguiar),
        new Inmueble("Avenida Los Eucaliptus", "a 300 mts. de Ruta 11", "Compra", 1300000D, arijon),
        new Inmueble("Av. Aristobulo del Valle", "6330", "Compra", 9000000D, santafe),
        new Inmueble("Sarmiento", "3869", "Compra", 500000D, santotome),
        new Inmueble("Jujuy", "3710", "Compra", 1200000D, santafe),
        new Inmueble("25 de Mayo D.1", "2838", "Compra", 132000D, santafe),
        new Inmueble("Solís", "entre Piedras y Tacuarí", "Compra", 950000D, sauceviejo),
        new Inmueble("Azopardo", "7101", "Compra", 1500000D, santafe)
    };
    
}
