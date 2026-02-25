/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.articulos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        float costoBase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese costo base");
        costoBase = Float.valueOf(scanner.nextLine());
        
        Articulo articulo = new Articulo();
        articulo.costoBase = costoBase;
        
        float precioAlMayor = articulo.calcularPrecioAlMayor();
        float precioAlMEnor = articulo.calcularPrecioAlMenor();
        
        System.out.println("PRecios:");
        System.out.println("MAyor: " + precioAlMayor);
        System.out.println("MEnor: " + precioAlMEnor);
        
    }
}
