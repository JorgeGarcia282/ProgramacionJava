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
public class SignoNumero {
     public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Introduce un numero real: ");
    int n = sc.nextInt();
    if (n > 0){
    System.out.println("Su numero es positivo");
    }if(n==0){
    System.out.println("Su numero es 0");
    }if (n < 0){
    System.out.println("Su numero es negativo");
    }
}}
