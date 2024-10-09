/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author garbenjo
 */
import java.util.Scanner;
public class GetASCCICodeFromChar {
     public static void main(String[] args) {
     System.out.print("Introduce un caracter: ");
     Scanner sc = new Scanner(System.in);
     char caracter = sc.next().charAt(0);
     System.out.println("El caracter ocupa el puesto "+ (int)caracter + " en la tabla ASCCI");
         
     }
}
