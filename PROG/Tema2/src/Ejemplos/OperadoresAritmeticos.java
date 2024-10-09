/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author garbenjo
 */
public class OperadoresAritmeticos {
     public static void main(String[] args) {
     /*
        int a=12;
        int b=5;
        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicacion: " + (a*b));
        System.out.println("Division: " + ((double)a/b));
        System.out.println("Resto de division: " + (a%b));
        */
        //ejemplo operador ?
        //Si ka persona es mayor de edad recibe una beca de 500, sino nada
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        boolean mayorDeEdad = (edad >= 18);
        
        double beca=(edad >= 18) ? 500 : 0;
        
        System.out.println("Tu beca es de: " + beca + "€");
        
        //otro ejemplo
        System.out.println("Introduce nota del examen: ");
        double nota = sc.nextDouble();
        String calificacion = (nota > 5) ? "Aprobado" : "Sustpenso";
        
     }
}
