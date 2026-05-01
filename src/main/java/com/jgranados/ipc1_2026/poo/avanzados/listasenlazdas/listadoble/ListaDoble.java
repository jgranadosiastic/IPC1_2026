/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listadoble;

import com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listasimple.ListaEnlazadaException;

/**
 *
 * @author jose
 */
public class ListaDoble {

    private NodoDoble inicio;
    private NodoDoble fin;
    private int tamaño;

    public ListaDoble() {
        tamaño = 0;
    }

    public void agregarAlFinal(String contenido) {
        NodoDoble nuevo = new NodoDoble(contenido);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
        }
        fin = nuevo;
        tamaño++;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public String obtenerContenido(int index) throws ListaEnlazadaException {
        NodoDoble nodoBuscado = obtenerNodo(index);
        return nodoBuscado.getContenido();
    }

    private NodoDoble obtenerNodo(int index) throws ListaEnlazadaException {
        if (index < 0 || index >= tamaño) {
            throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
        }
        if (index < tamaño / 2) {
            return obtenerNodoDesdeInicio(index);
        }

        return obtenerNodoDesdeFin(index);
    }

    private NodoDoble obtenerNodoDesdeInicio(int index) {
        NodoDoble actual = inicio;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    private NodoDoble obtenerNodoDesdeFin(int index) {
        NodoDoble actual = fin;
        int movimientos = tamaño - 1 - index;
        for (int i = 0; i < movimientos; i++) {
            actual = actual.getAnterior();
        }
        return actual;
    }
}
