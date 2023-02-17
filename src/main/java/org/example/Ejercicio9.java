package org.example;


import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un múltiplo de 3");

        int numero = sc.nextInt();

        while (numero % 3 != 0) {

            System.out.println("Error " + numero + " no es un múltiplo de 3");

            System.out.println("Escriba un múltiplo de 3");

            numero = sc.nextInt();

        }

        System.out.println("Ok: " + numero + " es un múltiplo de 3");

    }

}

