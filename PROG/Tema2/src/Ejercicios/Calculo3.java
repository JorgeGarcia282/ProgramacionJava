/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author garbenjo if condicional
 */
public class Calculo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce primer numero: ");
        double num1 = sc.nextDouble();
        System.out.print("introduce segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Elige una operacion (+,-,*,/): ");
        char operacion = sc.next().charAt(0);

        //Vemos los que contiene la variable operacion
        //para realizar la operacion correspondiente
        if (operacion == '+') {
            System.out.print("La suma es: " + (num1 + num2) + "\n");
        }
        else if (operacion == '-') {
            System.out.print("La suma es: " + (num1 - num2) + "\n");
        }
        else if (operacion == '*') {
            System.out.print("La suma es: " + (num1 * num2) + "\n");
        }
        else if (operacion == '/') {
            System.out.print("La suma es: " + (num1 / num2) + "\n");
        }
        else {
            System.err.println("Error. operacion no valida");
        }
    }
}
