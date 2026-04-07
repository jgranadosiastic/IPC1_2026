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
public class BusquedaBinaria {
    
    public Alumno encontrarAlumno(Alumno[] alumnos, String cui) throws ElementoNoEncontradoException {
        int inicio = 0;
        int fin = alumnos.length - 1;
        int puntoMedio;
        
        while (fin >= inicio) {
            puntoMedio = inicio + (fin - inicio) / 2;
            
            Alumno alumnoMedio = alumnos[puntoMedio];
            if (alumnoMedio.esCuiIgual(cui)) {
                return alumnoMedio;
            } else if (alumnoMedio.esCuiMenor(cui)) {
                inicio = puntoMedio + 1;
            } else {
                fin = puntoMedio - 1;
            }
        }
        
        throw new ElementoNoEncontradoException("Alumno con cui no encontrado");
    }
}
