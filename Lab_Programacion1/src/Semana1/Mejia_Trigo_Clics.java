/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

/**
 *
 * @author trigo
 */
public class Mejia_Trigo_Clics {
    public static void main(String[] args) {
        
        int clics1 = 60;
        double costo1 = 0.30;
        
        int clics2 = 100;
        double costo2 = 0.25;
        
        int clics3 = 20;
        double costo3 = 0.80;
        
        //total sin ISV
        double totalSinISV = (clics1 * costo1) + (clics2 * costo2) + (clics3 * costo3);
        
        //Calculo de ISV
        double isv = totalSinISV * 0.16;
        
        //Total con ISV
        double totalConISV = totalSinISV + isv;
        
        //Total de clics
        int totalClics = clics1 + clics2 + clics3;
        
        //Costo promedio
        double costoPromedio = totalConISV / totalClics;
        
        System.out.println("****COSTO PROMEDIO DE CLICS****");
        System.out.println("Total sin ISV: HNL" + String.format("%.2f", totalSinISV));
        System.out.println("Total con ISV (16%): HNL" + String.format("%.2f", totalConISV));
        System.out.println("Costo promedio por clic: HNL" + String.format("%.2f", costoPromedio));
              
    }
}
