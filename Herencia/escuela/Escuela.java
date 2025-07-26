public class Escuela {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Carlos Pérez", 20, "12345678", "Ingeniería");
        Profesor profesor = new Profesor("Laura Gómez", 45, "87654321", "Matemáticas");

        System.out.println("--- Alumno ---");
        alumno.mostrarDatos();
        alumno.presentarse();

        System.out.println("\n--- Profesor ---");
        profesor.mostrarDatos();
        profesor.presentarse();
    }
}
