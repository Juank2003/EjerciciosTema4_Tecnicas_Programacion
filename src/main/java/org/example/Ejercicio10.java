package org.example;


import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Anchura?");

        int anchura = sc.nextInt();

        System.out.println("¿Altura?");

        int altura = sc.nextInt();

        System.out.println("¿Carácter?");

        String caracter = sc.next();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < anchura; j++) {

                System.out.print(caracter);

            }

            System.out.println();

        }

    }

}
