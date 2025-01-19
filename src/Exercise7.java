/*
Escriba un programa que permita ingresar tres números (representan la longitud de una línea) y compruebe si con estos números se puede formar un triángulo.

Para resolver este tipo de problemas debemos entender primero:

Para que tres segmentos o lados puedan formar un triángulo, se debe cumplir con las dos condiciones fundamentales a
continuación:

La Desigualdad Triangular:

- La suma de dos lados cualquiera debe ser MAYOR que el tercer lado
Esto debe cumplirse para todas las combinaciones de lados
En forma matemática:

a + b > c
b + c > a
a + c > b

2. Todos los lados deben ser positivos:
Ningún lado puede medir cero
No pueden existir medidas negativas

* */


import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int segmento1, segmento2,segmento3;
        System.out.print(" Ingrese el valor del Segmento 1: ");
        segmento1 = input.nextInt();
        System.out.print(" Ingrese el valor del Segmento 2: ");
        segmento2 = input.nextInt();
        System.out.print(" Ingrese el valor del Segmento 3: ");
        segmento3 = input.nextInt();

        if ((segmento1 + segmento2 > segmento3) && (segmento2 + segmento3 > segmento1) && (segmento1 + segmento3 > segmento2) && segmento1 > 0 && segmento2 > 0 && segmento3 > 0) {
            System.out.printf("Los valores %d, %d, %d cumplen con las reglas para formar una figura de un triangulo.\n",
                    segmento1,segmento2,segmento3);

        }else {
            System.out.printf("Los valores %d, %d, %d  NO cumplen con las reglas para formar una figura de un " +
                            "triangulo.\n",
                    segmento1,segmento2,segmento3);

        }

        input.close();


    }
}
