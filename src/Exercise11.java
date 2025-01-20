
/*Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.
Por ejemplo:

Input : 3 , 100 , 1
Output : 13100*/


import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        System.out.print("Ingrese el numero 1: ");
        number1 = input.nextInt();
        System.out.print("Ingrese el numero 2: ");
        number2 = input.nextInt();
        System.out.print("Ingrese el numero 3: ");
        number3 = input.nextInt();

        ascendingNumber(number1, number2, number3);

        input.close();
    }

    public static void ascendingNumber(int num1, int num2, int num3) {
        //Validamos que los numeros ingresados no sean iguales.
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("No pueden haber números repetidos");
            return;
        }

        // Ordenar los números de menor a ,mayor
        if (num1 < num2 && num2 < num3) {
            System.out.println("" + num1 + num2 + num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.println("" + num1 + num3 + num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.println("" + num2 + num1 + num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println("" + num2 + num3 + num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println("" + num3 + num1 + num2);
        } else if (num3 < num2 && num2 < num1) {
            System.out.println("" + num3 + num2 + num1);
        }
    }
}