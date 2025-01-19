
/*Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.*/

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char letra ;
        System.out.print("Ingrese una letra: ");


        letra = input.next().charAt(0);

        String validateLetter = (letra >= 65 && letra <=90)?"Mayuscula":"Minuscula";

        System.out.printf("La letra es: " + validateLetter);

        input.close();

    }
}
