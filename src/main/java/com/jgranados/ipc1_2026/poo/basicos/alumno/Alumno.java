/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.alumno;

/**
 *
 * @author jose
 */
public class Alumno {
    String cui;
    String nombre;
    float[] notas = new float[3];
    
    float calcularPromedio() {
        float total = 0;
        for (int i = 0; i < notas.length; i++) {
            total = total + notas[i];
        }
        
        return total / notas.length;
    }
    
    boolean esAprobado() {
        float notaPromedio = calcularPromedio();
        
        return notaPromedio >= 61;
        
    }
    
    void imprimirEstado() {
        
        // super magia
        System.out.println("CUI:" + cui);
        System.out.println("NOmbre:" + nombre);
        System.out.println("Nota Promedio:" + calcularPromedio());
        if (esAprobado()) {
            System.out.println("Si aprobo");
        } else {
            System.out.println("NO aprobo");
        }
    }
}
