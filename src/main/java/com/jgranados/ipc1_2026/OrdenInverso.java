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
public class OrdenInverso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indice = 0;
        int numero;
        int cantidadNumeros;
        System.out.println("INgrese la cantidad de numeros");
        cantidadNumeros = Integer.valueOf(scanner.nextLine());

        // Var numeros[cantidadNumeros]
        int[] numeros = new int[cantidadNumeros];

        for (indice = 0; indice < cantidadNumeros; indice++) {
            System.out.println("ingrese un numero");
            numero = Integer.valueOf(scanner.nextLine());
            numeros[indice] = numero;
        }

        indice = cantidadNumeros - 1;
        while (indice >= 0) {
            System.out.println(numeros[indice]);
            indice = indice - 1;
        }
    }

}
