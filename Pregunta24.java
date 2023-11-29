/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta24;

/**
 *
 * @author sanchezericku
 */
public class Pregunta24 {

    public static void main(String[] args) {
        
        System.out.println("Números primos entre el 2 y el 500:");
        for (int numero = 2; numero <= 500; numero++) {
            if (isPrime(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
