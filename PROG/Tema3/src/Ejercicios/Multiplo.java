/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author garbenjo
 */
public class Multiplo {
    public static void main(String[] args) {
    int n2 =0;
    int n3 =0;
    int multi2 =0;
    int multi3 = 0;
        System.out.println("Multiplos de 2:");
    while(n2<100){
    n2++;
    if(n2%2==0){
        multi2++;
        System.out.println(n2+ " es multiplo de 2");
    }
    }while(n3<100){
    n3++;
    if(n3%3==0){
        multi3++;
        System.out.println(n3+ " es multiplo de 3");
    }
        
    }
        System.out.println("Hay "+ multi3 + " multiplos de 3");    
     System.out.println("Hay "+ multi2 + " multiplos de 2");
    }}

