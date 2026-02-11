/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2026;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class CalculoMunicipal {

    public static final double CUOTA_FIJA = 10;
    public static final double PRECIO_EXTRA_MEDIO = 1.1;
    public static final double PRECIO_EXTRA_ALTO = 2;
    public static final double TARIFA_BAJA_ELECTRICIDAD = 0.75;
    public static final double TARIFA_MEDIA_ELECTRICIDAD = 1.15;
    public static final double TARIFA_ALTA_ELECTRICIDAD = 1.25;

    public static Scanner scanner = new Scanner(System.in);
    public static int variableGlobal1;

    public static void main(String[] args) {
        variableGlobal1 = 25;
        String opcion;
        do {
            calcularTotalFactura();

            System.out.println("Desea realizar otro calculo? [S|N]");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public static void calcularTotalFactura() {

        double metrosCubicos;
        double totalDeAgua;
        double totalDeEnergia;
        int zona;
        double kwh;
        double sumaTotal;
        System.out.println("variable global:" + variableGlobal1);
        System.out.println("Ingrese M3");
        metrosCubicos = Double.valueOf(scanner.nextLine());

        System.out.println("Ingrese Zona");
        zona = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese Kw/H");
        kwh = Double.valueOf(scanner.nextLine());

        totalDeAgua = calcularAgua(metrosCubicos);

        totalDeEnergia = calcularEnergia(kwh, zona);

        sumaTotal = totalDeAgua + totalDeEnergia;

        System.out.println("El total gastado es: Q.");
        System.out.println(sumaTotal);
    }

    public static double calcularAgua(double metrosCubicos) {

        // Calculo
        double total;
        double subtotal;
        if (metrosCubicos <= 10) {
            total = CUOTA_FIJA;
        } else if (metrosCubicos <= 100) {
            subtotal = metrosCubicos - 10;
            total = CUOTA_FIJA + subtotal * PRECIO_EXTRA_MEDIO;
        } else {
            subtotal = metrosCubicos - 100;
            total = CUOTA_FIJA + 90 * PRECIO_EXTRA_MEDIO + subtotal * PRECIO_EXTRA_ALTO;
        }

        return total;
    }

    public static double calcularEnergia(double kwh, int zona) {

        double tarifa;
        if (zona == 1) {
            tarifa = TARIFA_BAJA_ELECTRICIDAD;
        } else if (zona >= 4 && zona <= 8) {
            tarifa = TARIFA_MEDIA_ELECTRICIDAD;
        } else {
            tarifa = TARIFA_ALTA_ELECTRICIDAD;
        }

        return kwh * tarifa;
    }
}
