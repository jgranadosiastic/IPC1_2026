/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.swing.basicos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author jose
 */
public class FrameBasicoAcciones {
    
    private JFrame frame;

    public FrameBasicoAcciones() {
        frame = new JFrame("Hola mundo con acciones");
        Dimension dimensionFrame = new Dimension(500, 500);
        frame.setSize(dimensionFrame);
        frame.setPreferredSize(dimensionFrame);
        
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        
        JButton btnBoton1 = new JButton("click me!");
        btnBoton1.setSize(35, 15);
        
        JTextField txtTexto1 = new JTextField();
        
        BotonActionListener btonActionListener = new BotonActionListener(txtTexto1);
        btnBoton1.addActionListener(btonActionListener);
        
        frame.add(btnBoton1);
        
        
        Dimension txtDimension = new Dimension(100, 35);
        txtTexto1.setSize(txtDimension);
        txtTexto1.setPreferredSize(txtDimension);
        
        frame.add(txtTexto1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
    }
    
    
}
