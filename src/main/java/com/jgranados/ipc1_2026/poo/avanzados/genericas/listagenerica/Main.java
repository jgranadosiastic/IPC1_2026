/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.genericas.listagenerica;

import com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listasimple.ListaEnlazadaException;
import com.jgranados.ipc1_2026.poo.swing.totito.backend.Jugador;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) throws ListaEnlazadaException {
        /*
        NodoGenerico<String> nodo = new NodoGenerico<>("aaa");
        nodo.setContenido("bbb");
        String nombre = nodo.getContenido();
        
        NodoGenerico<Jugador> nodoJ = new NodoGenerico<>(new Jugador("ddd", 0));
        Jugador j = nodoJ.getContenido();*/
        
        ListaEnlazadaGenerica<String> listaString = new ListaEnlazadaGenerica<>();
        listaString.agregarAlFinal("aaaa");
        
        String nombre = listaString.obtenerContenido(0);
        listaString.agregarAlFinal(nombre);
    }
}
