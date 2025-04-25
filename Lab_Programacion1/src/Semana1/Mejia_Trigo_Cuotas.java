/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

/**
 *
 * @author trigo
 */

//Importar Scanner
import java.util.Scanner;

public class Mejia_Trigo_Cuotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el monto del préstamo: HNL ");
        double montoPrestamo = sc.nextDouble();
        
        System.out.print("Ingrese el plazo en meses: ");
        int plazo = sc.nextInt();
        
        System.out.print("Ingrese el interés mensual: % ");
        double interesMensual = sc.nextDouble() / 100;
        
        System.out.print("Ingrese comisión por cuota: HNL ");
        double comisionPorCuota = sc.nextDouble();
        
        System.out.print("Ingrese porcentaje de seguro mensual aplicado a la cuota: % ");
        double porcentajeSeguroMensual = sc.nextDouble() / 100;

        // Calculo de interes total
        double interesTotal = montoPrestamo * interesMensual * plazo;

        // Total base 
        double totalBase = montoPrestamo + interesTotal;

        // Cuota mensual base sin comisiones y sin seguro
        double cuotaBase = totalBase / plazo;

        // Seguro mensual 
        double seguroMensual = cuotaBase * porcentajeSeguroMensual;

        // Cuota mensual total con seguro y comision
        double cuotaMensualFinal = cuotaBase + seguroMensual + comisionPorCuota;

        // Total a pagar
        double totalPagar = cuotaMensualFinal * plazo;

       
        System.out.println("**** CUOTAS MENSUALES ****");
        System.out.printf("Cuota de Pago Mensual: HNL %.2f\n", cuotaMensualFinal);
        System.out.printf("Total a Pagar: HNL %.2f\n", totalPagar);
        
    }
}
