package Ejercicios;
import java.util.Scanner;

public class EstanEnOrden2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Los números están ordenados de menor a mayor");
        } else if (a > b && b > c) {
            System.out.println("Los números están ordenados de mayor a menor");
        } else {
            System.out.println("Los números están desordenados");
        }
    }
}