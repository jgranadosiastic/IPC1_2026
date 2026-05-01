/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.genericas.listaobject;

import com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listasimple.*;

/**
 *
 * @author jose
 */
public class ListaEnlazadaObject {

    private NodoObject inicio;
    private NodoObject fin;
    private int tamaño;

    public ListaEnlazadaObject() {
        tamaño = 0;
    }

    public void agregarAlFinal(Object contenido) {
        NodoObject nuevo = new NodoObject(contenido);
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

    public Object obtenerContenido(int index) throws ListaEnlazadaException {
        NodoObject nodoBuscado = obtenerNodo(index);
        return nodoBuscado.getContenido();
    }

    private NodoObject obtenerNodo(int index) throws ListaEnlazadaException {
        if (index < 0 || index >= tamaño) {
            throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
        }
        NodoObject actual = inicio;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
}
