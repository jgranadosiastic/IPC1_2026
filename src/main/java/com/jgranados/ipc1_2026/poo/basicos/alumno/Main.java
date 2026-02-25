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
public class Main {
    
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        RecolectorDatos recolector = new RecolectorDatos();
        recolector.recolectarDatos(alumno);
        
        alumno.imprimirEstado();
        
        Alumno alumno2 = new Alumno();
        
        recolector.recolectarDatos(alumno2);
        alumno2.imprimirEstado();
    }
}
