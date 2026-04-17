/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.threads.hiloclase;

import com.jgranados.ipc1_2026.poo.avanzados.threads.Articulo;

/**
 *
 * @author jose
 */
public class CajeroHilo extends Thread {
    
    private String nombre;
    private Articulo[] articulos;
    
    public CajeroHilo(Articulo[] articulos, String nombre) {
        this.articulos = articulos;
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("Iniciando hilo: " + nombre);
            procesarArticulos(articulos);
            System.out.println("Finalizo hilo: " + nombre);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    } 
    
    private void procesarArticulos(Articulo[] articulos) throws InterruptedException {
        for (int i = 0; i < articulos.length; i++) {
            Articulo articulo = articulos[i];
            System.out.println("Articulo :" + i);
            System.out.println("Nombre: " + articulo.getNombre());
            Thread.sleep(articulo.getPeso() * 1000);
            System.out.println("Articulo procesado.");
        }
    }
}
