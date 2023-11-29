/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta25;

import java.util.Scanner;

/**
 *
 * @author sanchezericku
 */
public class Pregunta25 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7:");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Hola soy el día lunes");
                break;
            case 2:
                System.out.println("Hola soy el día martes");
                break;
            case 3:
                System.out.println("Hola soy el día miércoles");
                break;
            case 4:
                System.out.println("Hola soy el día jueves");
                break;
            case 5:
                System.out.println("Hola soy el día viernes");
                break;
            case 6:
                System.out.println("Hola soy el día sábado");
                break;
            case 7:
                System.out.println("Hola soy el día domingo");
                break;
            default:
                System.out.println("El número ingresado no corresponde a un día de la semana");
                break;
        }

        scanner.close();
    }
}
