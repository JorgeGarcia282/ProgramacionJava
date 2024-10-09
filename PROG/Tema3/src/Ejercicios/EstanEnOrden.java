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
public class EstanEnOrden {
     public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    
         System.out.print("Introduce el primer numero entero: ");
         int n1 = sc.nextInt();
         System.out.print("Introduce el segudno numero entero: ");
         int n2 = sc.nextInt();
         System.out.print("Introduce el tercer numero entero: ");
         int n3 = sc.nextInt();
         
         if (n1 > n2 ){
         boolean mayor=(n2 > n3);
            if (mayor=true){
                System.out.println("Los numeros estan en orden de mayor a menor");                                          
            }else{
         }if (n1 < n2 ) {
         boolean menor=(n2 < n3);
             if (menor=true){
                System.out.println("Los numeros estan en orden de menor a mayor"); }
         }else {
                 System.out.println("Los numeros estan desordenados");
                         
             }}
             
}}
