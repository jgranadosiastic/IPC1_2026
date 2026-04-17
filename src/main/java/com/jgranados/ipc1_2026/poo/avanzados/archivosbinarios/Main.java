/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.archivosbinarios;

import com.jgranados.ipc1_2026.poo.basicos.alumno.Alumno;
import com.jgranados.ipc1_2026.poo.basicos.alumno.RecolectorDatos;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jose
 */
public class Main {

    public static final String PATH_ARCHIVO = "/home/jose/CUNOC/IPC1/2026 01/";
    public static final String NOMBRE_ARCHIVO = "primerbinario.dat";
    public static final String PATH_COMPLETO = PATH_ARCHIVO + NOMBRE_ARCHIVO;

    public static void main(String[] args) {
        RecolectorDatos recolector = new RecolectorDatos();
        Alumno[] alumnos = new Alumno[3];
        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = new Alumno();
            recolector.recolectarDatos(alumno);
            alumnos[i] = alumno;
        }

        for (Alumno alumno : alumnos) {
            guardarAlumno(alumno);
        }
        
        leerAlumnos();

    }

    public static void guardarAlumno(Alumno alumno) {
        File file = new File(PATH_COMPLETO);
        try (FileOutputStream output = new FileOutputStream(file, true); DataOutputStream dataStream = new DataOutputStream(output);) {
            dataStream.writeUTF(alumno.obtenerCui());
            dataStream.writeUTF(alumno.obtenerNombre());
            dataStream.writeFloat(alumno.calcularPromedio());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerAlumnos() {
        File file = new File(PATH_COMPLETO);
        try (FileInputStream inputStream = new FileInputStream(file);
                DataInputStream input = new DataInputStream(inputStream)) {
            while(true) {
                String cui = input.readUTF();
                String nombre = input.readUTF();
                float promedio = input.readFloat();
                
                System.out.printf("Alumno recuperado: %s, %s, %f\n", cui, nombre, promedio);
            }
        } catch (EOFException e) {
            System.out.println("Fin del archivo");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
