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
public class Pascua {
     public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce el anio: ");
    int ano= sc.nextInt();
int A = ano % 19;
int B = ano % 4;
int C = ano % 7;
int D = (19 * A + 24) % 30;
int E = (2 * B + 4 * C + 6 * D + 5) % 7;
int N = 22 + D + E;
    if(N > 31){
        int dia = (N-31);
        System.out.println("Pascua cae el " + dia+ " de abril");
    }else{
    System.out.println("Pascua cae el "+ N + " de marzo");
    }

}}
