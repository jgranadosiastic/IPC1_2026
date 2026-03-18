/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces.volumenes;

/**
 *
 * @author jose
 */
public class Esfera extends Volumen {
    private int radio;
    
    public int calcularVolumen() {
        return 10;
    }

    @Override
    public void pintar(int color) {
        System.out.println("Pintando una esfera");
    }
}
