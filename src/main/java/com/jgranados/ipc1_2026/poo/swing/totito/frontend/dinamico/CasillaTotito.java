/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.swing.totito.frontend.dinamico;

import com.jgranados.ipc1_2026.poo.swing.totito.backend.MotorTotito;
import com.jgranados.ipc1_2026.poo.swing.totito.backend.exceptions.CasillaMarcadaException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author jose
 */
public class CasillaTotito extends JLabel {
    private static final String PATH_CIRCLE = "/images/totito/icons8-circle-96.png";
    private static final String PATH_CROSS = "/images/totito/icons8-cross-96.png";
    private MotorTotito motorTotito;
    private TotitoFrame totitoFrame;
    private int fila;
    private int columna;

    public CasillaTotito(MotorTotito motorTotito, int fila, int columna, TotitoFrame totitoFrame) {
        this.motorTotito = motorTotito;
        this.totitoFrame = totitoFrame;
        this.fila = fila;
        this.columna = columna;
        setFont(new java.awt.Font("Fira Sans", 0, 48)); // NOI18N
        setHorizontalAlignment(SwingConstants.CENTER);
        setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                registrarMarca();
            }
        });
        Dimension dimension = new Dimension(100, 100);
        setSize(dimension);
        setPreferredSize(dimension);
    }
    
    private void registrarMarca() {
        try {
            motorTotito.marcarCasilla(fila, columna);

            if (motorTotito.obtenerJugadorEnTurno().getMarca() == 1) {
                setIcon(new ImageIcon(getClass().getResource(PATH_CIRCLE)));
            } else {
                setIcon(new ImageIcon(getClass().getResource(PATH_CROSS)));
            }
            
            totitoFrame.registrarMarca();
            
        } catch (CasillaMarcadaException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
