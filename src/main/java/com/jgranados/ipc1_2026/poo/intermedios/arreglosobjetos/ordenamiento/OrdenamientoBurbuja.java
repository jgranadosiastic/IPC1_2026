/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.arreglosobjetos.ordenamiento;

import com.jgranados.ipc1_2026.poo.basicos.alumno.Alumno;

/**
 *
 * @author jose
 */
public class OrdenamientoBurbuja {
    
    public void ordenar(Alumno[] alumnos) {
        boolean aunDesordenado = true;
        while (aunDesordenado) {
            aunDesordenado = false;
            for (int i = 0; i <= alumnos.length - 2; i++) {
                Alumno alumno1 = alumnos[i];
                Alumno alumno2 = alumnos[i + 1];
                if (alumno2.esCuiMenor(alumno1.obtenerCui())) {
                    Alumno alumnoTemp = alumno1;
                    alumnos[i] = alumno2;
                    alumnos[i + 1] = alumnoTemp;
                    aunDesordenado = true;
                }
            }
        }
        
    }
}
