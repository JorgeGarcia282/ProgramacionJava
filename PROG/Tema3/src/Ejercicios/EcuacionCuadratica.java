/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author garbenjo
 */
public class EcuacionCuadratica {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita los coeficientes al usuario
        System.out.print("Introduce el valor de a (a ≠ 0): ");
        double a = sc.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el valor de c: ");
        double c = sc.nextDouble();

        // Asegúrate de que a no sea cero
        if (a == 0) {
            System.out.println("El valor de a no puede ser cero.");
        } else {
            // Calcula el discriminante
            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                // Dos soluciones reales
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones son " + raiz1 + " y " + raiz2);
            } else if (discriminante == 0) {
                // Una solución real
                double raiz = -b / (2 * a);
                System.out.println("La solución es " + raiz);
            } else {
                // Soluciones complejas
                double parteReal = -b / (2 * a);
                double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                System.out.println("Las soluciones son " + parteReal + " + " + parteImaginaria + "i y " + parteReal + " - " + parteImaginaria + "i");
            }
        }

        
    }
}

