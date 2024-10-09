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
public class Bucles {
      public static void main(String[] args) {
    
        //mostrar 100 primeros numeros
        int n=0; //variable para generar los numeros
        int suma=0; //variable para acumular sumas
        while(n <= 100){
            System.out.print(" "+n);
            n++;
        }System.out.println("");
      int m=100; //variable para generar los numeros
        while(m >= 1){
            System.out.print(" "+m);
            m--;
      }
      //sumar los 100 primeros numeros
      int p=0;
      while (p <= 100){
          System.out.println(p);
          suma=suma+n;
          p++;
          System.out.println("Suman " + suma);
      }
          System.out.println("Los numeros del 1 al 100 suman " +suma);
      }
}
