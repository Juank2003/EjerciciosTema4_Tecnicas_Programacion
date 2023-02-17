package org.example;

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

}