/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.targetgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Partida {
    
    private Jugador[] jugadores;
    
    
    public void pedirJugadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos jugadores?");
        int cantidad = Integer.valueOf(scanner.nextLine());
        
        jugadores = new Jugador[cantidad];
        
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Ingrese nombre de jugador");
            String nombre = scanner.nextLine();
            Jugador jugador = new Jugador(nombre);
            jugadores[i] = jugador;
        }
        
    }
    
    public void ordenarJugadores() {
        Jugador[] listadoOrdenado = new Jugador[jugadores.length];
        Random random = new Random();
        int seleccionado = random.nextInt(jugadores.length);
        Jugador jugadorInicial = jugadores[seleccionado];
        listadoOrdenado[0] = jugadorInicial;
        int j = 1;
        for (int i = 0; i < listadoOrdenado.length; i++) {
            Jugador jugador = listadoOrdenado[i];
            if (i != seleccionado) {
                listadoOrdenado[j] = jugador;
                j++;
            }
            
        }
    }
}
