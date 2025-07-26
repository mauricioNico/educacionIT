import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionConValidacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();

            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {
                System.out.println("Error: División por cero no permitida.");
            } else {
                double resultado = dividendo / divisor;
                System.out.println("El resultado es: " + resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números válidos (por ejemplo, 10 o 3.14).");
        }

        System.out.println("Fin del programa.");
        scanner.close();
    }
}