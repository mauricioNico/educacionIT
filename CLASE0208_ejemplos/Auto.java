public class Auto {
    private String marca;
    private int velocidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Auto(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    // Método acelerar SIN parámetros (aumenta velocidad fija)
    public void acelerar() {
        this.velocidad += 10;
        System.out.println(marca + " aceleró a " + velocidad + " km/h");
    }

    // Sobrecarga: Método acelerar CON parámetro (aumenta según valor)
    public void acelerar(int incremento) {
        this.velocidad += incremento;
        System.out.println(marca + " aceleró a " + velocidad + " km/h");
    }

    // Sobrecarga: Método acelerar CON parámetro double (multiplica la aceleración)
    public void acelerar(double factor) {
        int incremento = (int)(10 * factor);
        this.velocidad += incremento;
        System.out.println(marca + " aceleró a " + velocidad + " km/h con factor " + factor);
    }

    public int getVelocidad() {
        return velocidad;
    }
    public static void mostrarCantidadDeRuedas(){
        System.out.println("Todos los autos tienen cuatro ruedas");
    }
}
