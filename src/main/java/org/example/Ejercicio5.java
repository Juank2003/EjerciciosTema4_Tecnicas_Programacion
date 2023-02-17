package org.example;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = (int) (Math.random() * 100) + 1;

        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");

        String numeroUsuario = sc.nextLine();

        int numeroMinimo = 1;

        int numeroMaximo = 100;

        int numeroIntento = (int) (Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo);

        System.out.println("Pruebo con " + numeroIntento + ", ¿es mayor, menor o es el número (+/-/=)?");

        String respuesta = sc.nextLine();

        int numeroIntentos = 1;

        while (!respuesta.equals("=")) {

            if (respuesta.equals("+")) {

                numeroMinimo = numeroIntento + 1;

            } else {

                numeroMaximo = numeroIntento - 1;

            }

            numeroIntento = (int) (Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo);

            System.out.println("Pruebo con " + numeroIntento + ", ¿es mayor, menor o es el número (+/-/=)?");

            respuesta = sc.nextLine();

            numeroIntentos++;

        }

        System.out.println("Fenomenal, lo he encontrado después de " + numeroIntentos + " intentos.");

    }

}