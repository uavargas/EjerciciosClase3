/*Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete.*/

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int number = input.nextInt();

        String validateNumber = (number % 2 == 0 && number % 7 == 0)?"Verdadero": "Falso";

        System.out.printf("El numero %d es divisible entre 2 y 7 ?:  %s", number,validateNumber);
        input.close();

    }
}
