/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.targetgame;

import com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.Tiro;
import com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.TiroBajoElBrazo;
import com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.TiroControlado;
import com.jgranados.ipc1_2026.poo.intermedios.targetgame.tiros.TiroRapido;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Jugador {
    
    public static final int PUNTEO_PARA_GANAR = 200;
    
    private String nombre;
    private int punteo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void lanzarTiro() {
        Tiro tiro = seleccionarTiro();
        int puntaje = tiro.calcularPuntaje();
        punteo = punteo + puntaje;
        mostrarPuntajeObtenido(puntaje);
    }
    
    private void mostrarPuntajeObtenido(int puntaje) {
        System.out.printf("El jugador %s obtuvo %d puntos y su total es: %d\n",
                nombre, puntaje, punteo);
    }
    
    public boolean esGanador() {
        return punteo >= PUNTEO_PARA_GANAR;
    }
    
    private Tiro seleccionarTiro() {
        int opcion;
        System.out.println("1. Tiro Rapido ");
        System.out.println("2. Tiro Controlado");
        System.out.println("3. Tiro Bajo el Brazo");
        
        Scanner scanner = new Scanner(System.in);
        opcion = Integer.parseInt(scanner.nextLine());
        
        Tiro tiroSeleccionado = instanciarTiro(opcion);
        
        return tiroSeleccionado;
    }
    
    private Tiro instanciarTiro(int opcion) {
        switch (opcion) {
            case 1:                
                return new TiroRapido();
            case 2:
                return new TiroControlado();
            default:
                return new TiroBajoElBrazo();
        }
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerPunteo() {
        return punteo;
    }
}
