/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta23;

import java.util.Scanner;

/**
 *
 * @author sanchezericku
 */
public class Pregunta23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Por favor, ingrese un número entero: ");
            numero = scanner.nextInt();
        } while (numero == 0);

        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else {
            System.out.println("El número ingresado es negativo.");
        }

        scanner.close();
    }
}

