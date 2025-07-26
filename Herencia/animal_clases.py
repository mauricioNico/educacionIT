class Animal:
    def __init__(self, especie, nombre, edad, peso):
        self.especie = especie
        self.nombre = nombre
        self.edad = edad
        self.peso = peso

    def mostrar_info(self):
        print(f"Especie: {self.especie}")
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad} años")
        print(f"Peso: {self.peso} kg")

    def hacer_sonido(self):
        print("Este animal hace un sonido genérico.")


class Perro(Animal):
    def __init__(self, nombre, edad, peso, raza):
        super().__init__("Perro", nombre, edad, peso)
        self.raza = raza

    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Guau!")

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Raza: {self.raza}")


class Gato(Animal):
    def __init__(self, nombre, edad, peso, color):
        super().__init__("Gato", nombre, edad, peso)
        self.color = color

    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Miau!")

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Color: {self.color}")


# Ejemplo de uso
if __name__ == "__main__":
    perro1 = Perro("Luna", 4, 12.5, "Labrador")
    gato1 = Gato("Milo", 2, 4.0, "Blanco")
    perro2=Perro("Chacha",6,15,"Manto negro")
    perro2.edad=14
    perro2.mostrar_info()
    perro1.hacer_sonido()

    print("---")

    gato1.mostrar_info()
    gato1.hacer_sonido()
