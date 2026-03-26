/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.targetgame;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Target {

    public static void main(String[] args) {
        String opcion;
        Scanner scanner = new Scanner(System.in);
        GrabadorPuntaje grabador = new GrabadorPuntaje();
        do {
            Partida partida = new Partida(grabador);
            partida.ejecutarPartida();

            System.out.println("Desea otra partida? (SI/NO)");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("si"));
    }
}
