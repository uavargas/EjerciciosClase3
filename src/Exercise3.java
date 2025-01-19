/*Escriba un programa que permita ingresar un número e identificar si es par o impar.*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = input.nextInt();

        String esParImpar = (number % 2 == 0) ? "Es Par":"Es Impar";
        System.out.printf("El numero %d es: %s", number, esParImpar);
    }
}
