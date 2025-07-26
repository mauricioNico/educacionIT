// Clase base Animal
// Clase base abstracta Animal
abstract class Animal {
    private String especie;
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String especie, String nombre, int edad, double peso) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Especie: " + especie);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
    }

    // Método abstracto a implementar por subclases
    public abstract void hacerSonido();
}

// Subclase Perro
class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, double peso, String raza) {
        super("Perro", nombre, edad, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raza: " + raza);
    }
}

// Subclase Gato
class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, double peso, String color) {
        super("Gato", nombre, edad, peso);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Color: " + color);
    }
}

// Clase principal
public class AnimalEjemplo {
    public static void main(String[] args) {
        Perro perro = new Perro("Luna", 4, 12.5, "Labrador");
        Gato gato = new Gato("Milo", 2, 4.0, "Blanco");
       // Animal a= new Animal();
       // a.mostrarInfo();
        gato.setEdad(12);
        perro.mostrarInfo();
        perro.hacerSonido();
        String valor=perro.getNombre();
System.out.println(valor);
        System.out.println("---");

        gato.mostrarInfo();
        gato.hacerSonido();
    }
}
