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
public class Calculo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Intorduce primer numero: ");
        int num = sc.nextInt();
        System.out.print("Introduce la operacion que quieras hacer: ");
        char num1 = sc.next().charAt(0);
        System.out.print("Intorduce segundo numero: ");
        int num2 = sc.nextInt();
       
        if (num1 ==43) {        
        System.out.println("El resultado es: " + (num+num2));
        } if (num1 ==45){
        System.out.println("El resultado es: " + (num-num2));
        } if (num1 ==42){
        System.out.println("El resultado es: " + (num*num2));
        } if (num1 ==47){
        System.out.println("El resultado es: " + (num/num2));
            
        }else {
        System.err.println("Error. operacion no permitida");
        }
    }
}
