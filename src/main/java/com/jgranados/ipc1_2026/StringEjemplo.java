/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026;

/**
 *
 * @author jose
 */
public class StringEjemplo {
    
    public static void main(String[] args) {
         String texto ;
         texto = "otro valor";
         texto = "valor nuevo";
         
         System.out.println("ocurrencia de 'lo': " + texto.indexOf("lo"));
         System.out.println("ocurrencia de 'o': " + texto.indexOf('o'));
         
         
         System.out.println("ocurrencia de 'lo': " + texto.lastIndexOf("lo"));
         System.out.println("ocurrencia de 'o': " + texto.lastIndexOf('o'));
         
   }
    
}
