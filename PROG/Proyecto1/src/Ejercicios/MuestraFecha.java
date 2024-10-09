/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author garbenjo
 */
import java.time.LocalDate;
import java.time.LocalTime;
public class MuestraFecha {
     public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es: "+hoy);
        LocalTime Hora = LocalTime.now();
        System.out.println("Son las: "+Hora);        
}}
