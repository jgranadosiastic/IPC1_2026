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
public class TiroConFuerza extends Tiro {

    @Override
    public int calcularPuntaje() {
        Random random = new Random();
        if (random.nextInt(100) < 50) {
            return PUNTAJE_SECCION_2;
        } else {
            return PUNTAJE_SECCION_3;
        }
    }
}
