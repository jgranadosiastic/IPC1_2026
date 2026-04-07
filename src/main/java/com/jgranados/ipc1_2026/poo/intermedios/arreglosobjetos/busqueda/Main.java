/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.arreglosobjetos.busqueda;

import com.jgranados.ipc1_2026.poo.basicos.alumno.Alumno;
import com.jgranados.ipc1_2026.poo.basicos.alumno.RecolectorDatos;
import com.jgranados.ipc1_2026.poo.intermedios.exceptions.ElementoNoEncontradoException;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {

    RecolectorDatos recolectorDatos = new RecolectorDatos();
    BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial();
    BusquedaBinaria busquedaBinaria = new BusquedaBinaria();

    public static void main(String[] args) {
        Main main = new Main();
        main.ejecutar();
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int cantidadAlumnos = 0;
        boolean hayError = false;

        do {
            try {
                System.out.println("Ingrese cantidad de alumnos a procesar:");
                cantidadAlumnos = Integer.valueOf(scanner.nextLine());
                hayError = false;
            } catch (NumberFormatException e) {
                System.out.println("El valor ingresado no es un entero, intente otra vez");
                hayError = true;
            }
        } while (hayError);

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno alumno = new Alumno();
            recolectorDatos.recolectarDatos(alumno);
            alumnos[i] = alumno;
        }

        String continuar;
        /*do {
            System.out.println("Cual es el cui del alumno a buscar");
            String cui = scanner.nextLine();

            Alumno alumnoEncontrado = busquedaSecuencial.encontrarAlumno(alumnos, cui);

            if (alumnoEncontrado != null) {
                alumnoEncontrado.imprimirEstado();
            } else {
                System.out.println("El alumno no existe");
            }
            
            System.out.println("Desea otra busqueda? [S/N]");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));*/
        
        do {
            System.out.println("Cual es el cui del alumno a buscar");
            String cui = scanner.nextLine();

            try {
                //Alumno alumnoEncontrado = busquedaSecuencial.encontrarAlumno(alumnos, cui);
                Alumno alumnoEncontrado = busquedaBinaria.encontrarAlumno(alumnos, cui);
                alumnoEncontrado.imprimirEstado();
            } catch (ElementoNoEncontradoException e) {
                System.out.println(e.getMessage());
            }          
            
            System.out.println("Desea otra busqueda? [S/N]");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

    }
}
