package org.example;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿tamaño?");

        int tamaño = sc.nextInt();

        System.out.println("¿Carácter?");

        String caracter = sc.next();

        System.out.println("¿forma?");

        System.out.println("1 - rectángulo con relleno");

        System.out.println("2 - rectángulo sin relleno");

        System.out.println("3 - cruz de San Andrés");

        System.out.println("4 - triángulo rectángulo");

        System.out.println("5 - rombo");

        System.out.println("6 - ajedrezado");

        int forma = sc.nextInt();

        switch (forma) {

            case 1:

                for (int i = 0; i < tamaño; i++) {

                    for (int j = 0; j < tamaño; j++) {

                        System.out.print(caracter);

                    }

                    System.out.println();

                }

                break;

            case 2:

                for (int i = 0; i < tamaño; i++) {

                    for (int j = 0; j < tamaño; j++) {

                        if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {

                            System.out.print(caracter);

                        } else {

                            System.out.print(" ");

                        }

                    }

                    System.out.println();

                }

                break;

            case 3:

                for (int i = 0; i < tamaño; i++) {

                    for (int j = 0; j < tamaño; j++) {

                        if (i == j || i + j == tamaño - 1) {

                            System.out.print(caracter);

                        } else {

                            System.out.print(" ");

                        }

                    }

                    System.out.println();

                }

                break;

            case 4:

                for (int i = 0; i < tamaño; i++) {

                    for (int j = 0; j < tamaño; j++) {

                        if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1 || i == j || i + j == tamaño - 1) {

                            System.out.print(caracter);

                        } else {

                            System.out.print(" ");

                        }

                    }

                    System.out.println();

                }

                break;

            case 5:

                for (int i = 0; i < tamaño; i++) {

                    for (int j = 0; j < tamaño; j++) {

                        if (i + j == tamaño / 2 || i - j == tamaño / 2 || j - i == tamaño / 2 || i + j == 3 * tamaño / 2) {

                            System.out.print(caracter);

                        } else {

                            System.out.print(" ");

                        }

                    }

                    System.out.println();

                }

                break;

            case 6:

                        for (int i = 0; i < tamaño; i++) {

                            for (int j = 0; j < tamaño; j++) {

                                if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {

                                    System.out.print(caracter);

                                } else {

                                    System.out.print(" ");

                                }

                            }

                            System.out.println();

                        }

                        break;

        }

    }

}


