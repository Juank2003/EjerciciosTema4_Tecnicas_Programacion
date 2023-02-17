package org.example;


import java.util.Scanner;

public class NotaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de notas:");

        int numNotas = sc.nextInt();

        double suma = 0;

        for (int i = 0; i < numNotas; i++) {

            System.out.println("Nota:");

            double nota = sc.nextDouble();

            suma = suma + nota;

        }

        double media = suma / numNotas;

        System.out.println("La media es " + media);

    }

}
