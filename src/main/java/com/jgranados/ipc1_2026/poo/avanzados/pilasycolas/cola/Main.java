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
public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola(5);

        try {
            cola.agregarACola("Jose");
            cola.agregarACola("Alice");
            cola.agregarACola("Juan");
            cola.agregarACola("Andres");
            cola.agregarACola("Maria");
            cola.agregarACola("Pedrito");
        } catch (ColaException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                String nombre = cola.sacarElemento();
                System.out.println(nombre);
            }
        } catch (ColaException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
