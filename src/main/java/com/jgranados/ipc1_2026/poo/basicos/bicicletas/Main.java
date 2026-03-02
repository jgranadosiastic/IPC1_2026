/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.bicicletas;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.cambiarCadena();
        bicicleta.frenar();
        
        BicicletaMontaña bicicletaMontaña = new BicicletaMontaña();
        bicicletaMontaña.cambiarCadena();
        bicicletaMontaña.frenar();
        
        BicicletaCarreraSobreHielo bicicletaHielo = new BicicletaCarreraSobreHielo();
        bicicletaHielo.cambiarCadena();
        bicicletaHielo.frenar();
    }
}
