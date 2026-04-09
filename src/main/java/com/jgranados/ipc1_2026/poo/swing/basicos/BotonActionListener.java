/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.swing.basicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jose
 */
public class BotonActionListener implements ActionListener {
    
    private JTextField textField;

    public BotonActionListener(JTextField textField) {
        this.textField = textField;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("se activo el action en el boton." + textField.getText());
    }
    
}
