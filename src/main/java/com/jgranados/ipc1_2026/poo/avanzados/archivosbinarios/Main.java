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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jose
 */
public class Main {

    public static final String PATH_ARCHIVO = "/home/jose/CUNOC/IPC1/2026 01/";
    public static final String NOMBRE_ARCHIVO = "primerbinario.dat";
    public static final String NOMBRE_ARCHIVO_OBJ = "objeto.obj";
    public static final String PATH_COMPLETO = PATH_ARCHIVO + NOMBRE_ARCHIVO;
    public static final String PATH_COMPLETO_OBJ = PATH_ARCHIVO + NOMBRE_ARCHIVO_OBJ;

    public static void main(String[] args) {
        RecolectorDatos recolector = new RecolectorDatos();
        /*Alumno[] alumnos = new Alumno[3];
        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = new Alumno();
            recolector.recolectarDatos(alumno);
            alumnos[i] = alumno;
        }

        for (Alumno alumno : alumnos) {
            //guardarAlumnoEnBinario(alumno);
            guardarObjetoAlumno(alumno);
        }*/
        
        //leerAlumnosBinario();
        Alumno alumnoLeido =  leerObjetoAlumno("1111");
        alumnoLeido.imprimirEstado();
    }

    public static void guardarAlumnoEnBinario(Alumno alumno) {
        File file = new File(PATH_COMPLETO);
        try (FileOutputStream output = new FileOutputStream(file, true);
                DataOutputStream dataStream = new DataOutputStream(output);) {
            dataStream.writeUTF(alumno.obtenerCui());
            dataStream.writeUTF(alumno.obtenerNombre());
            dataStream.writeFloat(alumno.calcularPromedio());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerAlumnosBinario() {
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
    
    public static void guardarObjetoAlumno(Alumno alumno) {
        File file = new File(PATH_ARCHIVO + "/" + alumno.obtenerCui());
        try (FileOutputStream output = new FileOutputStream(file);
                ObjectOutputStream outputStream = new ObjectOutputStream(output)) {
            outputStream.writeObject(alumno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Alumno leerObjetoAlumno(String cui) {
        File file = new File(PATH_ARCHIVO + "/" + cui);
        try (FileInputStream inputStream = new FileInputStream(file);
                ObjectInputStream input = new ObjectInputStream(inputStream)) {
            Object objetoLeido = input.readObject();
            return (Alumno) objetoLeido;
        } catch (EOFException e) {
            System.out.println("Fin del archivo");
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
