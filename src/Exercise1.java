/*Ejercicio 1
Escriba un programa que permita ingresar un número real e identifique si el número es negativo, positivo o cero.*/


import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        double number = input.nextDouble();
        if (number < 0){
            System.out.printf("El numero %.1f es Negativo" ,number);
        }else if (number > 0){
            System.out.printf("El numero %.1f es Positivo" , number);
        }else {
            System.out.printf("El numero %.1f es Cero" , number);
        }
    }
}
