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
public class Ticket {
    public static void main (String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.print("Total compra con IVA: ");
    double TotalConIVA=teclado.nextDouble();
    System.out.print("Porcenbtaje con IVA (%): ");
    double iva=teclado.nextDouble();
    
    //sin IVA
    double TotalSinIVA = TotalConIVA - (TotalConIVA * (iva/100));
    System.out.println("Total compra sin IVA: " + TotalSinIVA);
    System.out.println("Total IVA: "+ (TotalConIVA * (iva/100)));
    }}
