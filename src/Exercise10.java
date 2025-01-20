/*
* Escriba una función en la que ingrese un número entero entre 1 y 12. Este número corresponde con un mes
(1 enero, 2 febrero, ..., 12 diciembre). El resultado debe ser el número de días del mes ingresado.
Ejemplo:

Input : 12
Output : 31
*
A continuación encuentras la cantidad de días que tienen cada mes.

Mes	                     Días
1, 3, 5, 7, 8, 10 y 12	 31
4, 6, 9, 11	             30
2	                     28
 */


import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el numero del Mes: ");
        int numeroMes = input.nextInt();
        System.out.println(cantidadDiasPorMes(numeroMes) );
        input.close();

    }

    // Funcion para determinar los dias por cada mes de acuerdo al numero ingresado por el usuario
    public static String cantidadDiasPorMes(int numeroMes) {
        // Validación del rango del mes
        if (numeroMes < 1 || numeroMes > 12) {
            return "Dato incorrecto";
        }
        if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7 ||
                numeroMes == 8 || numeroMes == 10 || numeroMes == 12) {
            return "31";
        } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            return "30";
        } else {
            return "28";
        }
    }

}
