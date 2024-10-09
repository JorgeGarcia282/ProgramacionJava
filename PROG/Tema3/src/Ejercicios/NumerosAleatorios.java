/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author garbenjo
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
    int n =0;
    double ale = 0;
    int impar=0;
    int par=0;
    while(n<=24){
     ale= 1000*Math.random();
     n++;
        System.out.println((int)ale);
        
        if ((int)ale%2==0){
        par++;
        }else if((int)ale%2==1) {
        impar++;
        }
     }
        System.out.println("Hay " + par + " numeros pares y " + impar + " numeros impares.");
    }
}
