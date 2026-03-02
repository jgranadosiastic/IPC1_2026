/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.bicicletas;

/**
 *
 * @author jose
 */
public class Bicicleta {
    private int velocidad;
    private int velocidadCadena;
    private int rpm;
    
    public void frenar() {
        velocidad--;
        System.out.println("Estoy frenando:" + velocidad);
    }
    
    public void cambiarCadena() {
        velocidadCadena++;
        System.out.println("Cambiando de cadena:" + velocidadCadena);
    }
}
