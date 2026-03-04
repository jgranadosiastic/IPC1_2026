/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.figuras;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Cuadrado extends FiguraGeometrica {
    private int lado;
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado: ");
        lado = Integer.valueOf(scanner.nextLine());
    }
}
