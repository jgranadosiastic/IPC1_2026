/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.swing;

import com.jgranados.ipc1_2026.poo.basicos.alumno.Alumno;
import com.jgranados.ipc1_2026.poo.intermedios.arreglosobjetos.ordenamiento.OrdenamientoBurbuja;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author jose
 */
public class PrimerFrame {
    
    public static void main(String[] args) {
        OrdenamientoBurbuja burbuja = new OrdenamientoBurbuja();
        
        JFrame miFrame = new JFrame("Hola Mundo!");
        Dimension dimensionFrame = new Dimension(250, 250);
        miFrame.setSize(dimensionFrame);
        miFrame.setPreferredSize(dimensionFrame);
        
        BorderLayout borderLayout = new BorderLayout();
        //miFrame.setLayout(borderLayout);
        
        GridLayout gridLayout = new GridLayout(2, 2);
        miFrame.setLayout(gridLayout);
        miFrame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        //JButton btnBoton1 = new JButton("click me!");
        //btnBoton1.setSize(35, 15);
        
        //miFrame.add(btnBoton1, BorderLayout.NORTH);
        //miFrame.add(btnBoton1);
        
        //JTextField txtTexto1 = new JTextField();
        //txtTexto1.setSize(50, 15);
        
        //miFrame.add(txtTexto1, BorderLayout.SOUTH);
        //miFrame.add(txtTexto1);
        
        Alumno[] alumnos = new Alumno[3];
        alumnos[0] = new Alumno();
        alumnos[0].cambiarCui("333");
        alumnos[0].cambiarNotas(54, 85, 74);
        alumnos[0].cambiarNombre("333");
        
        alumnos[1] = new Alumno();
        alumnos[1].cambiarCui("678");
        alumnos[1].cambiarNotas(54, 85, 74);
        alumnos[1].cambiarNombre("678");
        
        alumnos[2] = new Alumno();
        alumnos[2].cambiarCui("222");
        alumnos[2].cambiarNotas(54, 85, 74);
        alumnos[2].cambiarNombre("222");
        
        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            JLabel lblAlumno = new JLabel(alumno.obtenerCui());
            miFrame.add(lblAlumno);
            System.out.println(alumno.obtenerCui());
        }
        
        burbuja.ordenar(alumnos);
        
        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            JLabel lblAlumno = new JLabel(alumno.obtenerCui());
            lblAlumno.setBackground(Color.BLUE);
            miFrame.add(lblAlumno);
            System.out.println(alumno.obtenerCui());
        }
        
        miFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miFrame.setVisible(true);
        
        FrameAsistido frameAsistido = new FrameAsistido();
        frameAsistido.setVisible(true);
    }
}
