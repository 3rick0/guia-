/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta15;

import java.util.Scanner;

/**
 *
 * @author sanchezericku
 */
public class Pregunta15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese la tabla de multiplicar que desea ver:");
        int tabla = scanner.nextInt();

        System.out.println("\nTabla de multiplicar del " + tabla + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }
}
   
