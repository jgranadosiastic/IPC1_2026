/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.alumno;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class RecolectorDatos {
    
    
    void recolectarDatos(Alumno alumno) {
        float[] notas = new float[3];
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese un CUI:");
        alumno.cambiarCui(scanner.nextLine());
        
        System.out.println("Ingrese un NOmbre:");
        alumno.cambiarNombre(scanner.nextLine());
        
        System.out.println("NOta 1");
        notas[0] = Integer.valueOf(scanner.nextLine());
        
        System.out.println("NOta 2");
        notas[1] = Integer.valueOf(scanner.nextLine());
        
        System.out.println("NOta 3");
        notas[2] = Integer.valueOf(scanner.nextLine());
        
        alumno.cambiarNotas(notas);
    }
}
