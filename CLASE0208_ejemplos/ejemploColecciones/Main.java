import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Creación de una lista de personas
 List<Persona> personas = new ArrayList<>();

 // Agregar personas a la lista
 personas.add(new Persona("Juan", 25));
 personas.add(new Persona("María", 30));
 personas.add(new Persona("Pedro", 28));

 // Iterar sobre la lista
 for (Persona persona : personas) {
 System.out.println(persona.getNombre()+" "+persona.getEdad());
 }
    }

}
