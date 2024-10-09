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
public class Bisiesto {
     public static void main (String[] args) {
     Scanner sc= new Scanner(System.in);
    System.out.print("Introduce el año: ");
    int anio = sc.nextInt();
    boolean bisiesto=false;  //Inicialmente considero que el año NO es bisiesto
    
    if(anio % 4 == 0){
        bisiesto=true;
        //seria bisiesto si cumple lo siguiente
     if((anio % 100 == 0) && (anio % 400 == 0)){
     bisiesto=false;
        //si es bisiesto
    }}
        //No es bisiesto
    
        //Para mostrar resultados consulto la bandera
        if(bisiesto==true){
            System.out.print("El año es BISIESTO");
        }else{
            System.out.print("El año NO ES BISIESTO");
            
        }
    }}
