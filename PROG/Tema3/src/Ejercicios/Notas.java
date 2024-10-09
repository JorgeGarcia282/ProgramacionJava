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
public class Notas {
    public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Introduce tu nota: ");
    int nota = sc.nextInt();
    switch (nota){
        case 0:
        case 1:
        case 2:
            System.out.println("Tienes una F");
            break;
        case 3:
        case 4:
            System.out.println("Tienes un insuficiente");
            break;
        case 5:
            System.out.println("Tienes un suficiente");
            break;
        case 6:
            System.out.println("Tienes un bien");
            break;
        case 7:
        case 8:
            System.out.println("Tienes un notable");
            break;
        case 9,10:
            System.out.println("Tienes un sobresaliente");
            break;                    
    }
    //Math.sqrt(...)
}
}