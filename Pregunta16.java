/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta16;

import java.util.Scanner;

/**
 *
 * @author sanchezericku
 */
public class Pregunta16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("\nEl área del círculo es: " + area);
    }
}

