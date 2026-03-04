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
public class AdminDeCalculos {
    
    private FiguraGeometrica[] figuras;
    
    public int solicitarCantidadFiguras() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas figuras va a procesar:");
        int cantidad =  Integer.valueOf(scanner.nextLine());
        figuras = new FiguraGeometrica[cantidad];
        return cantidad;
    }
    
    public void solictarFiguras() {
        for (int i = 0; i < figuras.length; i++) {
            int opcion = solicitarOpcionFigura();
            FiguraGeometrica figura = instanciarFigura(opcion);
            figuras[i] = figura;
            figura.solicitarDatos();
        }
    }
    
    private int solicitarOpcionFigura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cuadrado");
        
        return Integer.valueOf(scanner.nextLine());
    }
    
    public void mostrarCalculos() {
        for (FiguraGeometrica figura : figuras) {
            double area = figura.calcularArea();
            System.out.println("Area: " + area);
        }        
    }
    
    private FiguraGeometrica instanciarFigura(int opcion) {
        if (opcion == 1) {
            return new Circulo();
        } else if (opcion == 2) {
            return new Rectangulo();
        }
        
        return new Cuadrado();
    }
    
}
