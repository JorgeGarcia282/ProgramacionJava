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
public class Cambio {
    public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    final double CAMBIO=1.12;
    
    System.out.print("Introduce cantidad en euros: ");
    double euros = sc.nextDouble();
    
    double dolares=euros + CAMBIO;
    System.out.printf("%s %.2f %n","cambio a dolares: " , dolares);  
    } 
}
