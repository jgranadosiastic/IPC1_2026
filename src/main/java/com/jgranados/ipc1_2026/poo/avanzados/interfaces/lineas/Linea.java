/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces.lineas;

import com.jgranados.ipc1_2026.poo.avanzados.interfaces.Pintable;

/**
 *
 * @author jose
 */
public class Linea implements Pintable {
    private int grosor;

    @Override
    public void pintar(int color) {
        System.out.println("Pintando una linea");
    }
    
    
}
