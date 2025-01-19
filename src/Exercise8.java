
/*
Escriba un programa que permita ingresar un número (va a representar la cantidad de años) y de como respuesta la etapa
en la que se encuentra la persona de acuerdo con la siguiente tabla.
Años	Etapas
0  - 5	Primera infancia
6  - 11	Infancia
12 - 18	Adolescencia
19 - 26	Juventud
27 - 59	Adultez
   > 59	Persona mayor
* */

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de la Edad: ");
        int numberOfAge = input.nextInt();

        if (numberOfAge < 0) {
            System.out.println("La edad ingresada no es válida. Por favor ingrese un número positivo.");
        } else if (numberOfAge >= 0 && numberOfAge <= 5) {
            System.out.print("Eres de la etapa de Primera infancia  ");

        } else if (numberOfAge >= 6 && numberOfAge <= 11) {
            System.out.print("Eres de la etapa de Infancia  ");

        } else if (numberOfAge >= 12 && numberOfAge <= 18) {
            System.out.print("Eres de la etapa de Adolescencia ");
        } else if (numberOfAge >= 19 && numberOfAge <= 26) {
            System.out.print("Eres de la etapa de Juventud ");
        } else if (numberOfAge >= 27 && numberOfAge <= 59) {
            System.out.print("Eres de la etapa de Adultez ");

        } else {
            System.out.print("Eres de la etapa Persona mayor ");

        }

        input.close();


    }
}
