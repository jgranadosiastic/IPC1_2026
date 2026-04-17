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
public class Cajero {
    
    public void procesarArticulos(Articulo[] articulos) throws InterruptedException {
        for (int i = 0; i < articulos.length; i++) {
            Articulo articulo = articulos[i];
            System.out.println("Articulo :" + i);
            System.out.println("Nombre: " + articulo.getNombre());
            Thread.sleep(articulo.getPeso() * 1000);
            System.out.println("Articulo procesado.");
        }
    }
}
