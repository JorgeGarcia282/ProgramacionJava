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
public class Divisible {
     public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce dividendo: ");
        int d1= sc.nextInt();
        System.out.print("Introduce divisor: ");
        int d2= sc.nextInt();
        
        if(d1%d2==0){
        System.out.println(d2+" SI  es divisor de " + d1);
        }else{
        System.out.println(d2+" NO  es divisor de " + d1);
        }
}}
