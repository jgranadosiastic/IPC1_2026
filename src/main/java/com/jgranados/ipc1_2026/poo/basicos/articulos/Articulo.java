/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026.poo.basicos.articulos;

/**
 *
 * @author jose
 * 
 * Modificadores de visibilidad:
 * private: el miembro solo es visible para la propia clase
 * protected: el miembro es visible por la propia clase, clases hijas y clases en el mismo paquete    
 * public: el miembro es visible por cualquier otro objeto
 * default: el miembro es visible por la propia clase y clases del mismo paquete
 */
public class Articulo {
    public static final float PORCENTAJE_INCREMENTO_PRECIO_MAYOR = 0.15f;
    public static final float PORCENTAJE_INCREMENTO_PRECIO_MENOR = 0.30f;
    
    
    private float costoBase;
    
    
    public Articulo(float costoBaseInicial) {
        costoBase = costoBaseInicial;
    }
    
    
    public void cambiarCostoBase(float nuevoCosto) {
        costoBase = nuevoCosto;
    }
    
    public float calcularPrecioAlMayor() {
        // aqui hace algo
        
        // Var precio
        // Var valorIncremento
        // valorIncremento = costoBase * porcentajeVentaMayor
        // precio = costoBase + valorIncremento
        
        float valorIncremento = costoBase * PORCENTAJE_INCREMENTO_PRECIO_MAYOR;
        
        return costoBase + valorIncremento;
    }
    
    public float calcularPrecioAlMenor() {
        float valorIncremento = costoBase * PORCENTAJE_INCREMENTO_PRECIO_MENOR;
        
        return costoBase + valorIncremento;
    }
    
}
