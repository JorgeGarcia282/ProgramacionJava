/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 * Ejemplos de declaracion de variables de los tipos numericos de java, caracter
 * y booleano.
 *
 * @author garbenjo
 */
public class TiposDatos1 {

    //psvn + TAB
    public static void main(String[] args) {
        //Variables enteras
        int variableA;
        int edad;
        int numero;

        variableA = 123;
        edad = 25;
        numero = -10;

        System.out.println("VariableA: " + variableA);
        System.out.println("Edad: " + edad);
        System.out.println("Numero: " + numero);
        System.out.println("\n");
        double altura = 1.8;
        short saldoCuenta = 2000;
        System.out.println("Altura: " + altura);
        System.out.println("Saldo cuenta: " + saldoCuenta);
        System.out.println("\n");
        //Errores de precisiom --> solucion: casting

        int i = 12;
        byte b;
        b = (byte) i;  //casting de int a byte

        int i1;
        byte b2 = 125;
        i1 = b2; //no es necesario casting porque int es mas grande que byte

        short s1;
        short s2;
        short s3;

        float fl = (float) 1.1; //casting de double a floar
        float f2 = 0.123F;

        double d1 = 1.1;
        double d2 = 0.123;
        System.out.println("\n");
        //variables de tipo booleno
        boolean cierto;
        cierto = true;
        cierto = false;

        System.out.println("Cierto?? " + cierto);

        boolean mayor;
        mayor = true;
        mayor = false;
        mayor = (6 < 9); //sera true

        //variables de tipo char
        char letra;
        letra = 'A';
        letra = 'z';
        System.out.println("Contenido de la variable letra: " + letra);

        letra = 99;
        System.out.println("Contenido de la variable letra: " + letra);

        letra = 'B';
        System.out.println("Contenido de la variable \"letra\":" + letra);

        //Declaracion de constantes
        final int meses = 12;
        final double PI = 3.14;
        final double IVA21 = 0.21;

        //ejemplo error compilación
        char c;
        c = 'T' + 5;

        System.out.println(c);
        
        char n = 'T';
        n =(char)(n + 5);

        System.out.println(c);
    }
}
