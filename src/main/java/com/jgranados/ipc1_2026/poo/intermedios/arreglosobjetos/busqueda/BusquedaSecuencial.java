/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.arreglosobjetos.busqueda;

import com.jgranados.ipc1_2026.poo.basicos.alumno.Alumno;
import com.jgranados.ipc1_2026.poo.intermedios.exceptions.ElementoNoEncontradoException;

/**
 *
 * @author jose
 */
public class BusquedaSecuencial {
    
    public Alumno encontrarAlumno(Alumno[] alumnos, String cui) throws ElementoNoEncontradoException {
        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            if (alumno.obtenerCui().equalsIgnoreCase(cui)) {
                // ya encontramos al alumno
                return alumno;
            }
        }
        
        throw new ElementoNoEncontradoException("el alumno con el siguiente cui no se encontro: " + cui);
    }
}
