/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;



/**
 *
 * @author garbenjo
 */
public class SumaCuadrados {
     public static void main(String[] args) {
        int cuadrado=0;
        int n = 1;
        while(n<=100){
            int c = n*n;
            n=n+2;
            System.out.println("El cuadrado de " +n+ " es: "+ c);
            cuadrado=c+c;
        }
         System.out.println("La suma de los cuadrados es: " + cuadrado);
}}
