/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

/**
 *
 * @author trigo
 */

//Scanner en java
import java.util.Scanner;

public class Mejia_Trigo_PlantillaEmpleados {
    public static void main(String[] args) {
        //Scanner en java
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Horas de Trabajo Mensual: ");
        int horasMensuales = sc.nextInt();
        
        System.out.print("Tarifa por hora: Lps. ");
        double tarifaPorHora = sc.nextDouble();
        
        //Calcular salario semanal
        double salario_mensual = horasMensuales * tarifaPorHora;
        double salario_semanal = salario_mensual / 4;
        
        System.out.println("-----Boleta del Empleado-----");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Hora de Trabajo Mensual: " + horasMensuales);
        System.out.println("Tarifa por Hora: Lps." + tarifaPorHora);
        System.out.println("Salario del empleado semanal: Lps." + salario_semanal);
        
        
    }
}
