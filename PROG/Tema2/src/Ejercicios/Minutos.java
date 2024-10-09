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
public class Minutos {
    public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Dame un numero de segundos: ");
    int entrada = sc.nextInt();
    
    int minutos = entrada / 60;
    int segundos = entrada % 60;
    
    System.out.println(entrada + " Segundos son: " + minutos + " minutos, "
    + segundos + " segundos");
    }
}
