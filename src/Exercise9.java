/*Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de unidades que le compren.
 La siguiente tabla muestra la información:

Unidades	Precio por unidad
[1 - 50]	$50.000
(50 - 100]	$45.000
(100 - 150]	$40.000
(150 - 200]	$35.000
     > 200	$25.00
*/

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = input.nextInt();

        if (cantidad >= 1 && cantidad <= 50) {
            System.out.printf("Por comprar una cantidad de %d camisas el precio por unidad le queda a: $50.000",
                    cantidad);
        } else if (cantidad > 50 && cantidad <= 100) {
            System.out.printf("Por comprar una cantidad de %d camisas el precio por unidad le queda a: $45.000",
                    cantidad);
        } else if (cantidad > 100 && cantidad <= 150) {
            System.out.printf("Por comprar una cantidad de %d camisas el precio por unidad le queda a: $40.000",
                    cantidad);
        } else if (cantidad > 150 && cantidad <= 200) {
            System.out.printf("Por comprar una cantidad de %d camisas el precio por unidad le queda a: $35.000",
                    cantidad);
        } else if (cantidad > 200) {
            System.out.printf("Por comprar una cantidad de %d camisas el precio por unidad le queda a: $25.000",
                    cantidad);
        } else {
            System.out.printf("El valor  %d no es una cantidad válida", cantidad);

        }
        input.close();


    }
}
