/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces.volumenes;

import com.jgranados.ipc1_2026.poo.avanzados.interfaces.Movible;
import com.jgranados.ipc1_2026.poo.avanzados.interfaces.Pintable;

/**
 *
 * @author jose
 */
public abstract class Volumen implements Movible, Pintable {
    private int[] dimensiones;
    
    
    public abstract int calcularVolumen();
    
    
    @Override
    public void mover(int x, int y) {
        System.out.println("se movio a punto X =" + x + ", Y = " + y );
    }
}
