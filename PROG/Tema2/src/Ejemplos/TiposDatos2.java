/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author garbenjo
 */
import java.util.Scanner;
public class TiposDatos2 {
     public static void main(String[] args) {
     //ejemplo de introduccion de datos desde el teclado
     //uso de la clase "Scanner"
     Scanner sc = new Scanner(System.in); //Acceso al teclado
     System.out.print("Introduce resultado: ");
     int numero = sc.nextInt();
     System.out.println("Has introducido el numero: " + numero);
     
      System.out.print("Introduce tu altura en metros: ");
      double altura = sc.nextDouble();
      System.out.println("Tu altura son " + altura + " metros");
       
       System.out.print("Introduce tu nombre: ");
       String nombre = sc.next();
       System.out.println("Te llamas "+ nombre);
     }
}
