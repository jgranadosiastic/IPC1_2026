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
public class PotenciaRecursiva {

    public static void main(String[] args) {
        int base;
        int exponente;
        int total;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base");
        base = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese el exponente");
        exponente = Integer.valueOf(scanner.nextLine());

        total = potencia(base, exponente);

        System.out.println("El total de la potencia " + base + "^" + exponente + ": " + total);
        System.out.printf("El total de la potencia %d^%d: %d\n", base, exponente, total);
        
        System.out.println(String.format("El total de la potencia %s^%d: %d", base, exponente, total));

    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        }

        return base * potencia(base, exponente - 1);
    }
}
