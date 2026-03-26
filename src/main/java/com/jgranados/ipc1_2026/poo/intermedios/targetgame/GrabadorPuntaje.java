/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.intermedios.targetgame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author jose
 */
public class GrabadorPuntaje {

    //private static final String ARCHIVO_CON_PUNTAJES = "/home/jose/CUNOC/IPC1/2026 01/TARGET/puntajes.txt";
    private static final String ARCHIVO_CON_PUNTAJES = "puntajes.txt";

    public void grabarGanador(Jugador elGanador) {
        File archivo = new File(ARCHIVO_CON_PUNTAJES);
        try (FileWriter fileWriter = new FileWriter(archivo, StandardCharsets.UTF_8, true); PrintWriter writer = new PrintWriter(fileWriter);) {
            writer.printf("%s gano con %d puntos.\n", elGanador.obtenerNombre(), elGanador.obtenerPunteo());
        } catch (IOException e) {
            System.out.println("falló la grabacion del puntaje al archivo " + ARCHIVO_CON_PUNTAJES);
        }
    }
}
