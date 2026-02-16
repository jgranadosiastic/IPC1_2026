/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.recursividad;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class FactorialRecursivo {
    
    
    public static void main(String[] args) {
        int numero;
        int factorial;
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese el numero");
        numero = Integer.valueOf(scanner.nextLine());
        
        factorial = calcularFactorial(numero);
        
        System.out.println("El factorial es: " + factorial);
    }
    
    /*
    aqui agregamos
    varias
    lineas 
    de comentarios
    */
    public static int calcularFactorial(int numero) {
        System.out.println( "ingresa a calcularFactorial");
        // este es un mensaje para otro dev
        
        if (numero <= 1) {
            return 1;
        }
	return numero * calcularFactorial(numero - 1);
    }
}
