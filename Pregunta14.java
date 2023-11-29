/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta14;

import java.util.Scanner;

/**
 *
 * @author sanchezericku
 */
public class Pregunta14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre completo:");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Por favor, ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("Por favor, ingrese su correo electrónico:");
        String correoElectronico = scanner.next();

        System.out.println("Por favor, ingrese su número de teléfono:");
        String telefono = scanner.next();

        System.out.println("\nDatos de contacto ingresados:");
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Número de teléfono: " + telefono);
    }
}
    

