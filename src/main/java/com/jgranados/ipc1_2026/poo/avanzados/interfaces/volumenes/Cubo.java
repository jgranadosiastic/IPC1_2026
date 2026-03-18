/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces.volumenes;

/**
 *
 * @author jose
 */
public class Cubo extends Volumen {
    private int lado;
    
    public int calcularVolumen() {
        return lado * lado * lado;
    }

    @Override
    public void pintar(int color) {
        System.out.println("Pintando una cubo");
    }
}
