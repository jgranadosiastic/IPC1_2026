/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.listasenlazdas.listadoble;

/**
 *
 * @author jose
 */
public class NodoDoble {
    private String contenido;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(String contenido) {
        this.contenido = contenido;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public String getContenido() {
        return contenido;
    }
    
    
}
