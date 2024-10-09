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
public class Vocales {
     public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Introduce un caracter: ");
    int caracter = sc.next().charAt(0);
    switch (caracter){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':    
                System.out.print("El carcater si es una vocal");
                break;
            default:
                System.out.print("El caracter no es una vocal");
                break;
                
}}}
