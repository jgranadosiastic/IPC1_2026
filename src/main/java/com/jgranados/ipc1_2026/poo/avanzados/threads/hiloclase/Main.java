/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.threads.hiloclase;

import com.jgranados.ipc1_2026.poo.avanzados.threads.Articulo;
import com.jgranados.ipc1_2026.poo.avanzados.threads.secuencial.Cajero;

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
        CajeroHilo cajero = new CajeroHilo(articulos, "h1");
        CajeroHilo cajero2 = new CajeroHilo(articulos2, "h2");
        CajeroHilo cajero3 = new CajeroHilo(articulos, "h3");
        CajeroHilo cajero4 = new CajeroHilo(articulos, "h4");
        
        cajero.start();
        cajero2.start();
        cajero3.start();
        cajero4.start();
        
    }
}
