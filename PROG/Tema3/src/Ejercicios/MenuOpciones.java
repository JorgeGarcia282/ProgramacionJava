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
public class MenuOpciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("a. RAMs");
        System.out.println("b. Graficas");
        System.out.println("c. Ordenadores");
        System.out.println("d. Procesadores");
        System.out.println("s. SALIR");
        char opcion =0;
        while(opcion != 's'){
        System.out.print("Introduce una opcion: ");
        opcion =sc.next().charAt(0);
        switch(opcion){
        case'a':
            System.out.println("""
                               Aqui tienes una lista de 5 RAMs:
                               1. Vengeance LPX 32GB (2 x 16GB) DDR4 3200MHz
                               2. G.Skill Trident Z Royal 64GB (2 x 32GB) DDR5 6000MHz
                               3. Kingston FURY Beast 16GB (2 x 8GB) DDR4 3600MHz 
                               4. Crucial Ballistix 32GB (2 x 16GB) DDR4 3200MHz 
                               5. TeamGroup T-Force Delta RGB 32GB (2 x 16GB) DDR5 5600MHz """);
            break;
        case'b':
            System.out.println("""
                               Aqui tienes una lista de 5 graficas:
                               1. Corsair NVIDIA GeForce RTX 409
                               2. AMD Radeon RX 7900 XTX
                               3. NVIDIA GeForce RTX 4080 Ti
                               4. AMD Radeon RX 7900 XT 
                               5. NVIDIA GeForce RTX 4070 Ti""");
            break;
        case 'c':
            System.out.println("""
                               Aqui tienes una lista de 5 ordenadores:
                               1. Apple MacBook Pro (M3 Max) 
                               2. Dell XPS 15 (2024) 
                               3. HP Spectre x360 14 
                               4. Lenovo ThinkPad X1 Carbon Gen 11 
                               5. Asus ROG Zephyrus G14""");
            break;
        case 'd':
            System.out.println("""
                               Aqui tienes una lista de 5 procesadores:
                               1. AMD Ryzen Threadripper PRO 7995WX 
                               2. Intel Core i9-14900K
                               3. AMD Ryzen 9 7950X 
                               4. Apple M3 Max 
                               5. Intel Xeon w9-3495X """);
            
        }
        if (opcion !='a' && opcion !='b' && opcion !='c' && opcion !='d' && opcion !='s'){
            System.err.println("Opcion introducida no vaida.");
                    
                   
        }
       
    }
}}
