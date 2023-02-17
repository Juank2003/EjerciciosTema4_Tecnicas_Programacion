package org.example;
/*
import java.util.Scanner;

public class VisualizacionDecitasDePeliculas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Cuidado, es una auténtica carnicería");

                    break;

                case 2:

                    System.out.println("Me llamo Bond, James Bond");

                    break;

                case 3:

                    System.out.println("¿Qué es lo que quieres que te diga, que soy un hombre de familia?");

                    break;

                case 4:

                    System.out.println("¡Yo soy tu padre!");

                    break;

                case 5:

                    System.out.println("Adios");

                    break;

                default:

                    System.out.println("Opción incorrecta");

            }

        }

    }

}*/


import java.util.Scanner;
import java.util.Random;

public class VisualizacionDecitasDePeliculas {

    public static void main(String[] args) {
        String[] peliculas = {"Una cita de la ciudad del miedo", "Una cita de James Bond", "Una cita de la vida es un largo río tranquilo", "Una cita de Star Wars"};
        String[][] citas = {{"Si todo el mundo es un idiota, significa que soy un idiota", "Cuidado, es una auténtica carnicería", "¿Te gusta mi máscara?", "No me subestimes, chico"}, {"Me llamo Bond, James Bond", "Agitado, no mezclado", "Mantenlo simple, Stupid", "Porque creíste que me gusta el vodka Martini, agitado no mezclado?"}, {"¿Cuál es el problema? No me he bañado en dos días, me corto las uñas de los pies una vez al mes. ¿Soy un apestoso?", "Nadie me puede obligar a ser un trabajador social", "Eso es algo que solo un padre puede entender", "Así que lo único que me queda es el suicidio, ¿verdad?"}, {"Que la fuerza te acompañe", "No trates de hacerlo, hazlo o no lo hagas, pero no lo intentes", "Luke, yo soy tu padre", "Es una trampa!"}};

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int opcion = 0;

        do {
            System.out.println("Seleccione una opción:");
            for (int i = 0; i < peliculas.length; i++) {
                System.out.println((i + 1) + " - " + peliculas[i]);
            }
            System.out.println((peliculas.length + 1) + " - Salir de esta magnífica aplicación");
            opcion = input.nextInt();

            if (opcion >= 1 && opcion <= peliculas.length) {
                int citaAleatoria = random.nextInt(citas[opcion - 1].length);
                System.out.println(citas[opcion - 1][citaAleatoria]);
            } else if (opcion == peliculas.length + 1) {
                System.out.println("Adios");
            } else {
                System.out.println("Opción no válida, intente de nuevo");
            }
        } while (opcion != peliculas.length + 1);

        input.close();
    }
}






