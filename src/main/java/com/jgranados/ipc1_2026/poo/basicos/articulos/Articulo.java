/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.articulos;

/**
 *
 * @author jose
 */
public class Articulo {
    public static final float PORCENTAJE_INCREMENTO_PRECIO_MAYOR = 0.15f;
    public static final float PORCENTAJE_INCREMENTO_PRECIO_MENOR = 0.30f;
    
    
    float costoBase;
    
    float calcularPrecioAlMayor() {
        // aqui hace algo
        
        // Var precio
        // Var valorIncremento
        // valorIncremento = costoBase * porcentajeVentaMayor
        // precio = costoBase + valorIncremento
        
        float valorIncremento = costoBase * PORCENTAJE_INCREMENTO_PRECIO_MAYOR;
        
        return costoBase + valorIncremento;
    }
    
    float calcularPrecioAlMenor() {
        float valorIncremento = costoBase * PORCENTAJE_INCREMENTO_PRECIO_MENOR;
        
        return costoBase + valorIncremento;
    }
    
}
