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
public class PorcentajeNotas {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("SB:");
    int sb = sc.nextInt(); //sobresaliente
    
    System.out.println("N:");
    int n = sc.nextInt();  //notable
    
    System.out.println("A:");
    int a = sc.nextInt();  //aprobado
     
    System.out.println("S:");
    int s = sc.nextInt();  //suspendido
    
    System.out.println("NP:");
    int np = sc.nextInt();  //no presentado
    
    int total= sb + n +a + s+ np; //total de alumnos
    int aprobados= sb + n +s;  //total aprobados
    int presentados = total - np;  //presentados
    
    //sacamos porcentaje
    //porcentaje sobresaliente
    
    System.out.println("SB= " + ((double)sb/(double)total));
   
    }
}
