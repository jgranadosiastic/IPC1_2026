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
public class MotorTotito {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    
    private boolean turnoDeUno;
    

    public MotorTotito() {
        tablero = new Tablero();
    }
    
    public void reiniciarJuego() {
        tablero.limpiarTablero();
    }
    
    public void registrarJugadores(String nombre1, String nombre2) {
        jugador1 = new Jugador(nombre1, 1);
        jugador2 = new Jugador(nombre2, 2);
    }
    
    public Jugador obtenerJugadorEnTurno() {
        return turnoDeUno ? jugador1 : jugador2;
    }
    
    public boolean esTurnoDeUno() {
        return turnoDeUno;
    }
    
    public void marcarCasilla(int fila, int columna) throws CasillaMarcadaException {
        Jugador jugadorEnTurno = obtenerJugadorEnTurno();
        tablero.marcarCasilla(jugadorEnTurno.getMarca(), fila, columna);
        turnoDeUno = !turnoDeUno;
    }
    
    public boolean hayGanador() {
        return tablero.alguienYaGano();
    }
}
