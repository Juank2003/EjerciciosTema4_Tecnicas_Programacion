package org.example;

//Su algoritmo debe generar un número entero aleatorio entre 1 y 100.
//El usuario tiene que encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido.
//El programa finaliza cuando el usuario ha encontrado el número.


import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = (int) (Math.random() * 100) + 1;

        System.out.println("¿En qué número entre 1 y 100 estoy pensando?");

        int numeroUsuario = sc.nextInt();

        while (numero != numeroUsuario) {

            if (numeroUsuario > numero) {

                System.out.println("Menor");

            } else {

                System.out.println("Mayor");

            }

            System.out.println("¿En qué número entre 1 y 100 estoy pensando?");

            numeroUsuario = sc.nextInt();

        }

        System.out.println("Bravo, lo ha encontrado");

    }

}