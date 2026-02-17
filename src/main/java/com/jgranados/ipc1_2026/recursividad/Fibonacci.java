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
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indiceFibonacci;
        System.out.println("ingrese indice finbonacci:");
        indiceFibonacci = Integer.valueOf(scanner.nextLine());
        
        int[] valores = new int[indiceFibonacci + 1];
        
        int total = fibonacci(indiceFibonacci, valores);
        System.out.println("-------------------");
        imprimirFibonacci(valores);
        System.out.println("Fibonacci es:" + total);
    }
    
    public static int fibonacci(int indice, int[] valores) {
        if (indice == 1) {
            valores[indice] = 1;
            return valores[indice];
        } else if (indice == 0) {
            valores[indice] = 0;
            return valores[indice];
            
        }
        
        int total = fibonacci(indice - 1, valores) + fibonacci(indice - 2, valores);
        valores[indice] = total;
        
        return total;
    }
    
    public static void imprimirFibonacci(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            System.out.println(valor);
        }
    }
}
