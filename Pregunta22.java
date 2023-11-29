/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta22;

import java.util.Scanner;

/**
 *
 * @author sanchezericku
 */
public class Pregunta22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Por favor, ingrese un número entero positivo: ");
            numero = scanner.nextInt();
        } while (numero < 0);

        long factorial = calculateFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    private static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
