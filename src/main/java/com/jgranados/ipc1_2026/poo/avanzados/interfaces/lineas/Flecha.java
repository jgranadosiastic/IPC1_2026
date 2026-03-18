/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces.lineas;

import com.jgranados.ipc1_2026.poo.avanzados.interfaces.Movible;

/**
 *
 * @author jose
 */
public class Flecha extends Linea implements Movible {

    @Override
    public void mover(int x, int y) {
        System.out.println("MOviendo la flecha"); 
    }
    
}
