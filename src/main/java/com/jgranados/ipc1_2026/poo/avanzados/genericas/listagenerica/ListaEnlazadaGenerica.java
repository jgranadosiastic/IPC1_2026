/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.genericas.listagenerica;

import com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listasimple.ListaEnlazadaException;

/**
 *
 * @author jose
 */
public class ListaEnlazadaGenerica<T> {

    private NodoGenerico<T> inicio;
    private NodoGenerico<T> fin;
    private int tamaño;

    public ListaEnlazadaGenerica() {
        tamaño = 0;
    }

    public void agregarAlFinal(T contenido) {
        NodoGenerico<T> nuevo = new NodoGenerico<>(contenido);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        tamaño++;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public T obtenerContenido(int index) throws ListaEnlazadaException {
        NodoGenerico nodoBuscado = obtenerNodo(index);
        return (T) nodoBuscado.getContenido();
    }

    private NodoGenerico<T> obtenerNodo(int index) throws ListaEnlazadaException {
        if (index < 0 || index >= tamaño) {
            throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
        }
        NodoGenerico<T> actual = inicio;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
}
