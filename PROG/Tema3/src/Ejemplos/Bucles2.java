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
    //1. mostrar los numeros que hay entre 1 y el numero introducido por el usuario
    
    //2. mostrar los numeros que hay entre 2 valores enteros introducidos por teclado
    
    //3. mostrar los pares que hay entre 1 y 100, contarlos y sumarlos
    
    //4. pedir al usuario enteros repetidamente hasta que introduzca 0, entonces
    //   el programa dirá cuantos positivos y negativos a introducido.
public class Bucles2 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1.
        int n=0; 
        System.out.print("Introduce hasta que numero quieres contar: ");
        int m =sc.nextInt();
        while(n <= m){
            System.out.print(" "+n);
            n++; */
            
        //2.
        System.out.println(" ");
        System.out.print("Introduce primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int n2 = sc.nextInt();
        if (n1<n2){
        while (n1 < n2){
             System.out.print(" "+n1);
            n1++;
        }}if (n1>n2){
        while (n1 > n2){
             System.out.print(" "+n2);
            n2++;
        } } 
        /*3.
        int n=2; 
        int suma=0;
        int cont=0;
        while(n <= 100){            
            cont++;
            suma = suma + n;
            System.out.println(n);
            n=n+2;
        }System.out.println("Hay "+ cont +" pares entre el 1 y el 100"); 
        System.out.println("Los pares suman: " + suma);
        }*/
        /*4.
        int pos=0;
        int neg=0;
        int n = -1; //variable que almacena los numeros introducidos
        while(n!=0){
         System.out.print("Introduce un numero: ");
         n=sc.nextInt();
         if (n>0){
             pos++;
             
         }else if (n<0){
             neg++;
         }
            
         }System.out.println("Has introducido " + pos + " numeros positivos");
            System.out.println("Has introducido " + neg + " numeros negativos");*/
         
        
}}

