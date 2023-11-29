/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta21;

import java.util.Scanner;

/**
 *
 * @author sanchezericku
 */
public class Pregunta21 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println(" Menu de la Taqueria ");
            System.out.println("1. Pedir Taco");
            System.out.println("2. Pedir Burrito");
            System.out.println("3. Pedir Gringa");
            System.out.println("4. Salir");

            System.out.print(" Por favor, ingrese el número de la opción deseada: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(" Taco ");
                    break;
                case 2:
                    System.out.println(" Burrito ");
                    break;
                case 3:
                    System.out.println(" Gringa ");
                    break;
                case 4:
                    System.out.println(" Saliendo...");
                    exit = true;
                    break;
                default:
                    System.out.println(" Opción inválida. Por favor, intente de nuevo. ");
                    break;
            }
        }

        scanner.close();
    }
}

