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
    private String cui;
    private String nombre;
    private float[] notas = new float[3];
    
    public void cambiarCui(String nuevoCui) {
        cui = nuevoCui;
    }
    
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    public void cambiarNotas(float nota1, float nota2, float nota3) {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
    }
    
    public void cambiarNotas(float nuevasNOtas[]) {
        notas = nuevasNOtas;
    }
    
    
    private float calcularPromedio() {
        float total = 0;
        for (int i = 0; i < notas.length; i++) {
            total = total + notas[i];
        }
        
        return total / notas.length;
    }
    
    private boolean esAprobado() {
        float notaPromedio = calcularPromedio();
        
        return notaPromedio >= 61;
        
    }
    
    public void imprimirEstado() {
        
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
