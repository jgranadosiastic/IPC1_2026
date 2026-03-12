/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros;

import static com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.Tiro.PUNTAJE_AL_CENTRO;
import static com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.Tiro.PUNTAJE_FALLO;
import java.util.Random;

/**
 *
 * @author jose
 */
public class TiroControlado extends Tiro {
    
    
    @Override
    public int calcularPuntaje() {
        Random random = new Random();
        int probabilidad = random.nextInt(3);
        
        switch (probabilidad) {
            case 0:
                return PUNTAJE_SECCION_1;
            case 1:
                return PUNTAJE_SECCION_2;
            default:
                return PUNTAJE_SECCION_3;
        }
    }
}
