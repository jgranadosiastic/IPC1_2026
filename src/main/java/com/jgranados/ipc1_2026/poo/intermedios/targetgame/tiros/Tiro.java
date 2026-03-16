/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros;

import java.util.Random;

/**
 *
 * @author jose
 */
public abstract class Tiro {
    public static final int PUNTAJE_SECCION_1 = 10;
    public static final int PUNTAJE_SECCION_2 = 20;
    public static final int PUNTAJE_SECCION_3 = 30;
    public static final int PUNTAJE_AL_CENTRO = 40;
    public static final int PUNTAJE_FALLO = 0;
    
    public int peso;
    
    public Tiro() {
        Random random = new Random();
        peso = random.nextInt(5, 11);
    }
    
    public abstract int calcularPuntaje();
    
    public int obtenerPeso() {
        return peso;
    }
}
