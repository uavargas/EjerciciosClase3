/*Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos.*/

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2,number3;

        System.out.print("Ingrese el numero 1: " );
        number1 = input.nextInt();
        System.out.print("Ingrese el numero 1: " );
        number2 = input.nextInt();
        System.out.print("Ingrese el numero 1: " );
        number3 = input.nextInt();

        // Realizar proceso para validar el mayor.
        if(number1 > number2 && number1 > number3){
            System.out.printf("El numero mayor  es %d",number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.printf("El numero mayor es %d",number2);

        }else {
            System.out.printf("El numero mayor es %d",number3);

        }

    }
}
