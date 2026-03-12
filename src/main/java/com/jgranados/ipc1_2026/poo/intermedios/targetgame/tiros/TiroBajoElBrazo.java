/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros;

import static com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.Tiro.PUNTAJE_SECCION_1;
import static com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.Tiro.PUNTAJE_SECCION_2;
import static com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.Tiro.PUNTAJE_SECCION_3;
import java.util.Random;

/**
 *
 * @author jose
 */
public class TiroBajoElBrazo extends Tiro {
    
    @Override
    public int calcularPuntaje() {
        Random random = new Random();
        int probabilidad = random.nextInt(5);
        
        switch (probabilidad) {
            case 0:
                return PUNTAJE_SECCION_1;
            case 1:
                return PUNTAJE_SECCION_2;
            case 2:
                return PUNTAJE_SECCION_3;
            case 3:
                return PUNTAJE_AL_CENTRO;
            default:
                return PUNTAJE_FALLO;
        }
    }
}
