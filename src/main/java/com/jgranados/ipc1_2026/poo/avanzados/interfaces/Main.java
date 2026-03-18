/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.avanzados.interfaces;

import com.jgranados.ipc1_2026.poo.avanzados.interfaces.lineas.DobleFlecha;
import com.jgranados.ipc1_2026.poo.avanzados.interfaces.lineas.Flecha;
import com.jgranados.ipc1_2026.poo.avanzados.interfaces.lineas.Linea;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        AdminDeCalculos admin = new AdminDeCalculos();
        /*admin.solicitarCantidadFiguras();
        admin.solictarFiguras();
        admin.mostrarCalculos();*/
        
        Flecha flecha1 = new Flecha();
        Flecha flecha2 = new Flecha();
        DobleFlecha dobleFlecha = new DobleFlecha();
        
        Linea[] lineas = new Linea[3];        
        
        // casteo implicito
        lineas[0] = flecha1;
        lineas[1] = flecha2;
        lineas[2] = dobleFlecha;
        
        // quiero mover las lineas que si se pueden mover
        for (Linea linea : lineas) {
            // casteo explicito
            // ((Movible) linea).mover(5, 9);
            
            /*if (linea instanceof Movible) {
                ((Movible) linea).mover(5, 9);
            }*/
            
            if (linea instanceof Movible lineaMovible) {
                lineaMovible.mover(5, 9);
            }
        }
        
    }
}
