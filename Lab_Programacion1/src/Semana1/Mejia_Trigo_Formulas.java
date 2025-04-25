/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

/**
 *
 * @author trigo
 */

import java.util.Scanner;

public class Mejia_Trigo_Formulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio a
        System.out.println("Ejercicio a:");
        System.out.print("Ingrese el numerador 1: ");
        double numerador1 = sc.nextDouble();
        System.out.print("Ingrese el denominador 1: ");
        double denominador1 = sc.nextDouble();
        System.out.print("Ingrese el numerador 2: ");
        double numerador2 = sc.nextDouble();
        System.out.print("Ingrese el denominador 2: ");
        double denominador2 = sc.nextDouble();
        double resultadoA = (numerador1 / denominador1) + (numerador2 / denominador2);
        System.out.println("Resultado a: " + resultadoA);

        //Ejercicio b
        System.out.println("\nEjercicio b:");
        System.out.print("Ingrese x: ");
        double x = sc.nextDouble();
        System.out.print("Ingrese y: ");
        double y = sc.nextDouble();
        double resultadoB = (1 / (x - 5)) - ((3 * x * y) / 4);
        System.out.println("Resultado b: " + resultadoB);

        //Ejercicio c
        System.out.println("\nEjercicio c:");
        double resultadoC = (1.0 / 2) + 7;
        System.out.println("Resultado c: " + resultadoC);

        //Ejercicio d
        System.out.println("\nEjercicio d:");
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        double resultadoD = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
        System.out.println("Resultado d: " + resultadoD);

        //Ejercicio e
        System.out.println("\nEjercicio e:");
        double resultadoE = (Math.pow(x, 2) + Math.pow(y, 2)) / (x - y);
        System.out.println("Resultado e: " + resultadoE);
        
        //Ejercicio f
        System.out.println("\nEjercicio f:");
        System.out.print("Ingrese m: ");
        double m = sc.nextDouble();
        System.out.print("Ingrese n: ");
        double n = sc.nextDouble();
        double resultadoF = Math.sqrt(Math.pow(m, 2) + Math.pow(n, 2));
        System.out.println("Resultado f: " + resultadoF);

        //Ejercicio g
        System.out.println("\nEjercicio g:");
        System.out.print("Ingrese p: ");
        double p = sc.nextDouble();
        double resultadoG = (Math.pow(p, 2) + 2 * p + 1) / (p + 1);
        System.out.println("Resultado g: " + resultadoG);

        //ejercicioo h
        System.out.println("\nEjercicio h:");
        System.out.print("Ingrese t: ");
        double t = sc.nextDouble();
        double resultadoH = (9 * t + 160) / 5;
        System.out.println("Resultado h: " + resultadoH);

        //ejericio i
        System.out.println("\nEjercicio i:");
        System.out.print("Ingrese base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese altura: ");
        double altura = sc.nextDouble();
        double resultadoI = (base * altura) / 2;
        System.out.println("Resultado i: " + resultadoI);

        //Ejericio j
        System.out.println("\nEjercicio j:");
        System.out.print("Ingrese radio del círculo: ");
        double radio = sc.nextDouble();
        double resultadoJ = Math.PI * Math.pow(radio, 2);
        System.out.println("Resultado j: " + resultadoJ);

        //Ejercicio k
        System.out.println("\nEjercicio k:");
        double resultadoK = Math.sqrt(Math.pow(x - y, 2));
        System.out.println("Resultado k: " + resultadoK);
    }
}
