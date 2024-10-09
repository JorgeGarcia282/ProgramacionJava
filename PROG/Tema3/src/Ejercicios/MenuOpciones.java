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
        System.out.println("Introduce una opcion: ");
        char opcion =0;
        while(opcion != 's'){
        System.out.println("Introduce una opcion: ");
        opcion =sc.next().charAt(0);
        switch(opcion){
        case'a':
            System.out.println("""
                               Vengeance LPX 32GB (2 x 16GB) DDR4 3200MHz
                               G.Skill Trident Z Royal 64GB (2 x 32GB) DDR5 6000MHz
                               Kingston FURY Beast 16GB (2 x 8GB) DDR4 3600MHz 
                               Crucial Ballistix 32GB (2 x 16GB) DDR4 3200MHz 
                               TeamGroup T-Force Delta RGB 32GB (2 x 16GB) DDR5 5600MHz """);
            break;
        case'b':
            System.out.println("""
                               Corsair NVIDIA GeForce RTX 409
                               AMD Radeon RX 7900 XTX
                               NVIDIA GeForce RTX 4080 Ti
                               AMD Radeon RX 7900 XT 
                               NVIDIA GeForce RTX 4070 Ti""");
            break;
        case 'c':
            System.out.println("""
                               Apple MacBook Pro (M3 Max) 
                               Dell XPS 15 (2024) 
                               HP Spectre x360 14 
                               Lenovo ThinkPad X1 Carbon Gen 11 
                               Asus ROG Zephyrus G14""");
            break;
        case 'd':
            System.out.println("""
                               AMD Ryzen Threadripper PRO 7995WX 
                               Intel Core i9-14900K
                               AMD Ryzen 9 7950X 
                               Apple M3 Max 
                               Intel Xeon w9-3495X """);
            
        }
        
       
    }
}}
