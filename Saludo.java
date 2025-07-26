import java.util.Scanner;

/**
 * Clase Saludo que solicita el nombre del usuario y muestra un saludo personalizado.
 */
public class Saludo {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            // Crear el objeto Scanner para leer desde consola
            scanner = new Scanner(System.in);

            // Preguntar el nombre al usuario
            System.out.print("¿Cómo te llamás? ");
            String nombre = scanner.nextLine();

            // Mostrar el saludo
            System.out.println("¡Hola, " + nombre + "! ¡Un gusto!");

        } catch (Exception e) {
            // Captura cualquier excepción y muestra un mensaje de error
            System.out.println("Ocurrió un error al leer el nombre. Intentalo de nuevo.");
            e.printStackTrace(); // Opcional: muestra detalles del error
        } finally {
            // Cerrar el scanner si fue creado correctamente
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
