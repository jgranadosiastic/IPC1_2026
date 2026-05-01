/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.genericas.listaobject;

import com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listasimple.ListaEnlazadaException;
import com.jgranados.ipc1_2026.poo.swing.totito.backend.Jugador;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) throws ListaEnlazadaException {
        ListaEnlazadaObject listaString = new ListaEnlazadaObject();
        listaString.agregarAlFinal("aa");
        listaString.agregarAlFinal(11);
        listaString.agregarAlFinal("bb");
        listaString.agregarAlFinal("cc");
        
        
        String nombre = (String) listaString.obtenerContenido(1);
        
        System.out.println("nombre: " + nombre);
        
        ListaEnlazadaObject listaJugador = new ListaEnlazadaObject();
        listaJugador.agregarAlFinal(new Jugador("aaa", 0));
        listaJugador.agregarAlFinal("ssss");
    }
}
