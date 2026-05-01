/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.genericas.listaobject;

import com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listasimple.Nodo;

/**
 *
 * @author jose
 */
public class NodoObject {
    private Object contenido;
    private NodoObject siguiente;

    public NodoObject(Object contenido) {
        this.contenido = contenido;
    }

    public Object getContenido() {
        return contenido;
    }

    public NodoObject getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoObject siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
