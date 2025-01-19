/*Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.*/


import java.util.Scanner;
public class Excercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letra ;
        System.out.print("Ingrese una letra: ");
        letra = input.next().charAt(0);
        String validateLetterVocalOrConsonat =
                (letra == 65 || letra == 69 || letra ==  73 || letra == 79 || letra == 85 || letra == 97 || letra == 101
                || letra == 105 || letra == 111 || letra == 117)?" Vocal":"Consonante";
        System.out.printf("La letra %s es: %s", letra, validateLetterVocalOrConsonat);

        input.close();
    }
}
