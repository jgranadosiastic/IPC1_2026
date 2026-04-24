/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.pilasycolas.cola;

import com.jgranados.ipc1_2026.poo.avanzados.pilasycolas.cola.exceptions.ColaException;

/**
 *
 * @author jose
 */
public class Cola {

    private static final int FRENTE_DE_FILA = 0;

    private String[] elementos;
    private int indiceUltimo;

    public Cola(int tamaño) {
        elementos = new String[tamaño];
        indiceUltimo = -1;
    }

    public void agregarACola(String nombre) throws ColaException {
        if (estaLlena()) {
            throw new ColaException("Ya no se puede agregar elemento a la cola: " + nombre);
        }
        indiceUltimo = indiceUltimo + 1;
        elementos[indiceUltimo] = nombre;
    }

    public String sacarElemento() throws ColaException {

        if (estaVacia()) {
            throw new ColaException("La fila esta vacia");
        }
        String nombre = elementos[FRENTE_DE_FILA];

        // move elementos
        for (int i = FRENTE_DE_FILA + 1; i <= indiceUltimo; i++) {
            String nombreAMover = elementos[i];
            elementos[i - 1] = nombreAMover;
        }
        indiceUltimo = indiceUltimo - 1;

        return nombre;
    }

    public boolean estaVacia() {
        return indiceUltimo == -1;
    }

    public boolean estaLlena() {
        return indiceUltimo == elementos.length - 1;
    }

}
