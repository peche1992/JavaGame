import java.util.Scanner;
//Quiero dejar claro que lo que es texto de la historia me he apoyado en GPT para el formateo del mismo
//para centrarme en las parates importantes del codigo
public class ProyectoJuego {
    public static void main(String[] args) {
        String oportunidad="";
        int contadorMuertes=0;




        //CREAMOS LA VARIABLE HEROE PARA DESPUES PODER MODIFICARLA
        //HE CONFIRMADO QUE SI NO NO PUEDES CREAR LA VARIABLE EN EL SWITCH
        player heroe = null;

        //CREAMOS AL PERSONAJE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre de tu personaje: ");
        String nombre = scanner.next();
        //EL NOMBRE SE VA A MANTENER DURANTE LOS INTENTOS PARA AMENIZAR LA AVENTURA.
        do {
            System.out.println("ELIGE TU CLASE");
            System.out.println("1-GUERRERO");
            System.out.println("2-MAGO");
            System.out.println("3-PICARO");
            System.out.println("ELIGE SABIAMENTE: ");
            int eleccionClase = scanner.nextInt();

    //AQUI LE VAMOS A IMPONER QUE ELIJA UNA DE LAS 3 CLASES OPCIONALES
            while (eleccionClase >3 || eleccionClase<=0) {
                System.out.println("Elige otra clase");
                eleccionClase = scanner.nextInt();

            }

            switch (eleccionClase) {
                case 1:
                    heroe = new guerrero(nombre);
                    break;

                case 2:
                    heroe = new mago(nombre);
                    break;

                case 3:
                    heroe = new rogue(nombre);
                    break;

            }
            //COMPROBACIONES QUE IBA TODO CORRECTO
            System.out.println(heroe.name);
            System.out.println(heroe.getClass());
            heroe.atacar();

            introduccion(heroe);

            int primeraEleccion = scanner.nextInt();
            if (primeraEleccion==1) {
                System.out.println("👀 Ves a un troll atacando a lo que parece ser un joven elfo.");
                System.out.println("🧝 El elfo aún está vivo... podrías intervenir y cambiar el destino.");
                System.out.println("¿Qué decides hacer?");
                System.out.println("1. Sales del arbusto y ayudas al elfo atacando al troll.");
                System.out.println("2. Esperas a que termine la pelea para aprovechar y matar al troll más fácilmente.");
                System.out.println("3. Te pones de parte del troll y atacas sin piedad al maldito elfo.");

                int segundaEleccion = scanner.nextInt();

                if (segundaEleccion == 1) {
                    // acción de ayudar al elfo
                } else if (segundaEleccion == 2) {
                    // acción de esperar
                } else if (segundaEleccion == 3) {
                    // acción de traicionar al elfo
                } else {
                    System.out.println("❌ Esa no es una opción válida.");
                }
            }
            else if (primeraEleccion == 2) {
                // Acción de esperar a que se acabe el ruido
                System.out.println("🕒 Esperas pacientemente a que el extraño ruido se detenga...");
                System.out.println("🏞️ Caminas con cautela hacia el lugar de los hechos...");
                System.out.println("💀 Ves a un troll desmembrando brutalmente a un pobre elfo indefenso.");
                System.out.println("👹 El troll te detecta, ruge con furia... y corre hacia ti.");
                System.out.println("☠️ HAS MUERTO ☠️");
                contadorMuertes+=1;
            }

            else if (primeraEleccion == 3) {
                // Huir del lugar, no quieres problemas
                System.out.println("🏃‍♂️ Huyes despavorido del lugar sin mirar atrás...");
                System.out.println("🪨 Tropiezas con una piedra y te golpeas fuertemente en la cabeza.");
                System.out.println("🧠 Pierdes el conocimiento... para siempre.");
                System.out.println("☠️ HAS MUERTO ☠️");
                contadorMuertes+=1;
            }

                System.out.println("Los dioses te conceden una "+contadorMuertes+ "º oportunidad, ¿quieres aprovecharla? SI/NO");
                oportunidad = scanner.next();
                oportunidad=oportunidad.toLowerCase();

            }while (oportunidad.contains("si"));
        System.out.println("GRACIAS POR JUGAR A MI AVENTURA");
    }





    public static void introduccion(player heroe) {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("🌲 Comienza la aventura 🌲");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Tu héroe, " + heroe.getName() + ", armado con coraje y determinación, se adentra en los misteriosos bosques de Eldoria...");
        System.out.println("Las hojas crujen bajo tus pies, una niebla espesa envuelve el camino, y algo —o alguien— acecha entre los árboles.");
        System.out.println("¿Estás preparado para lo que viene, " + heroe.getName() + "?");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.println("📣 Oyes un sonido a lo lejos, parece de alguien asustado.");
        System.out.println("¿Qué haces?");
        System.out.println("1. Buscar el origen del ruido y acercarte para investigar.");
        System.out.println("2. Esperar a que el ruido se detenga y observar qué lo ha generado.");
        System.out.println("3. Huir del lugar, no quieres problemas.");
    }
}


