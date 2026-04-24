/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.pilasycolas.pila;

import com.jgranados.ipc1_2026.poo.avanzados.pilasycolas.pila.exceptions.PilaException;



/**
 *
 * @author jose
 */
public class Pila {
    
    private String[] elementos;
    private int topeDePila;

    public Pila(int tamaño) {
        elementos = new String[tamaño];
        topeDePila = -1;
    }
    
    public void apilar(String nombre) throws PilaException {
        if (estaLlena()) {
            throw new PilaException("La pila ya esta llena. NO se pudo apilar a: " + nombre);
        }
        topeDePila = topeDePila + 1;
        elementos[topeDePila] = nombre;
    }
    
    public String desapilar() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila esta vacia, nada que sacar.");
        }
        String nombre = elementos[topeDePila];
        topeDePila = topeDePila - 1;
        
        return nombre;
    }
    
    public String darVistazo() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila esta vacia, nada que ver.");
        }
        return elementos[topeDePila];
    }
    
    public boolean estaVacia() {
        return topeDePila == -1;
    }
    
    
    public boolean estaLlena() {
        return topeDePila == elementos.length - 1;
    }
    
}
