/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026;

/**
 *
 * @author jose
 */
public class ImprimirColores {
    
    private static final String ANSI_ROJO = "\u001B[31m";
    private static final String ANSI_AZUL = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        System.out.println(ANSI_ROJO + "This text is colored" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "Azul azul" + ANSI_RESET);
        System.out.println("Algo mas de texto");


    }
}
