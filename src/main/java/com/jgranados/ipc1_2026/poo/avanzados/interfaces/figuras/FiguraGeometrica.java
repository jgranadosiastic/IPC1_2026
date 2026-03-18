/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces.figuras;

import com.jgranados.ipc1_2026.poo.avanzados.interfaces.Movible;

/**
 *
 * @author jose
 */
public abstract class FiguraGeometrica implements Movible {
    
    public abstract double calcularArea();
    
    public abstract void solicitarDatos();
    
    @Override
    public void mover(int x, int y) {
        System.out.println("se movio a punto X =" + x + ", Y = " + y );
    }
}
