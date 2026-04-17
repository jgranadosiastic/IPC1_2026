/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.threads.secuencial;

import com.jgranados.ipc1_2026.poo.avanzados.threads.Articulo;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        Articulo[] articulos = new Articulo[5];
        articulos[0] = new Articulo("a1", 2);
        articulos[1] = new Articulo("a2", 3);
        articulos[2] = new Articulo("a3", 1);
        articulos[3] = new Articulo("a4", 6);
        articulos[4] = new Articulo("a5", 3);
        
        
        Articulo[] articulos2 = new Articulo[1];
        articulos2[0] = new Articulo("cerveza", 2);
        Cajero cajero = new Cajero();
        Cajero cajero2 = new Cajero();
        
        try {
            cajero.procesarArticulos(articulos);
            cajero2.procesarArticulos(articulos2);
        } catch (InterruptedException e) {
            // manejando el error
            e.printStackTrace();
        }
        
        
    }
}
