/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class EjemploHacerMientras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double numero;
        String respuesta;

        do {
            System.out.println("INgrese un numero");
            numero = Double.valueOf(scanner.nextLine());
            total = total + numero;

            System.out.println("Desea continua? (SI/NO)");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("SI"));
        
        System.out.println("El resultado de la suma es: " + total);
	
    }
}
