/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.swing.totito.backend;

import com.jgranados.ipc1_2026.poo.swing.totito.backend.exceptions.CasillaMarcadaException;

/**
 *
 * @author jose
 */
public class Tablero {

    private int[][] tablero = new int[3][3];

    public boolean alguienYaGano() {
        return verificarLineaRecta(true) || verificarLineaRecta(false)
                || verificarDiagonal(true) || verificarDiagonal(false);

    }

    public boolean verificarLineaRecta(boolean esFila) {
        boolean yaGano = false;
        for (int i = 0; i < tablero.length; i++) {
            int valorActual = 0;
            for (int j = 0; j < tablero.length; j++) {
                int celda;
                if (esFila) {
                    celda = tablero[i][j];
                } else {
                    celda = tablero[j][i];
                }
                if (celda == 0) {
                    break;
                }
                if (j == 0) {
                    valorActual = celda;
                } else if (valorActual != celda) {
                    break;
                }

                if (j == 2) {
                    yaGano = true;
                }
            }
        }
        return yaGano;
    }

    public boolean verificarDiagonal(boolean esArriba) {
        boolean yaGano = false;
        for (int i = 0; i < tablero.length; i++) {
            int valorActual = 0;
            int celda;
            if (esArriba) {
                celda = tablero[i][i];
            } else {
                celda = tablero[tablero.length - 1 - i][i];
            }
            if (celda == 0) {
                break;
            }
            if (i == 0) {
                valorActual = celda;
            } else if (valorActual != celda) {
                break;
            }

            if (i == 2) {
                yaGano = true;
            }
        }
        return yaGano;
    }
    
    public void limpiarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 0;                
            }            
        }
    }
    
    public void marcarCasilla(int marca, int fila, int columna) throws CasillaMarcadaException {
        if (tablero[fila][columna] != 0) {
            throw new CasillaMarcadaException("Casilla en fila y columna  ya marcada: " + fila + "," + columna);
        }
        tablero[fila][columna] = marca;
        
    }
}
