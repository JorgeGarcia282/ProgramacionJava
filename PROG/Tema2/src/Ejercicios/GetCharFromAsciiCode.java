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
public class GetCharFromAsciiCode {
    public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     System.out.println("El numero elegido es: "+ (char)num + " en la tabla ASCCI");
    }
}
