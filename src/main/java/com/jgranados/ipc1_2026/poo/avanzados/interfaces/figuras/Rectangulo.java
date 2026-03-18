/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces.figuras;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Rectangulo extends FiguraGeometrica {
    
    private int ladoA;
    private int ladoB;
    
    @Override
    public double calcularArea() {
        return ladoA * ladoB;
    }
    
    
    
    @Override
    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado A: ");
        ladoA = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese el lado B: ");
        ladoB = Integer.valueOf(scanner.nextLine());
    }
}
