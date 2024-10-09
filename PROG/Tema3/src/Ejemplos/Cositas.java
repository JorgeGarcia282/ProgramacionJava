/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;
import java.util.Scanner;
/**
 *
 * @author garbenjo
 */
public class Cositas {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce una operacion: ");
        char operacion = sc.next().charAt(0);
       
        //vemos ls que contiene la variable operacion
        //para realizar la operacion correspondiente
        switch (operacion) {
        case'+':
            //si condicion cierta
            //hacemos la suma
            System.out.print("La suma es: "+ (num1 + num2));
            break;
        case '-':
            System.out.print("La resta es: "+ (num1 - num2));
            break;
        case'x':
        case'X':
            System.out.print("El producto es: "+ (num1 * num2));
            break;
        case'/':
            System.out.print("La division es: "+ (num1 / num2));
        }
        
}}
