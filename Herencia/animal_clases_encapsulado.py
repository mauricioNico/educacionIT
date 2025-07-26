class Animal:
    def __init__(self, especie, nombre, edad, peso):
        self.__especie = especie
        self.__nombre = nombre
        self.__edad = edad
        self.__peso = peso

    # Getters y setters
    def get_especie(self):
        return self.__especie

    def set_especie(self, especie):
        self.__especie = especie

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_edad(self):
        return self.__edad

    def set_edad(self, edad):
        self.__edad = edad

    def get_peso(self):
        return self.__peso

    def set_peso(self, peso):
        self.__peso = peso

    def mostrar_info(self):
        print(f"Especie: {self.__especie}")
        print(f"Nombre: {self.__nombre}")
        print(f"Edad: {self.__edad} años")
        print(f"Peso: {self.__peso} kg")

    def hacer_sonido(self):
        print("Este animal hace un sonido genérico.")


class Perro(Animal):
    def __init__(self, nombre, edad, peso, raza):
        super().__init__("Perro", nombre, edad, peso)
        self.__raza = raza

    def get_raza(self):
        return self.__raza

    def set_raza(self, raza):
        self.__raza = raza

    def hacer_sonido(self):
        print(f"{self.get_nombre()} dice: ¡Guau!")

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Raza: {self.__raza}")


class Gato(Animal):
    def __init__(self, nombre, edad, peso, color):
        super().__init__("Gato", nombre, edad, peso)
        self.__color = color

    def get_color(self):
        return self.__color

    def set_color(self, color):
        self.__color = color

    def hacer_sonido(self):
        print(f"{self.get_nombre()} dice: ¡Miau!")

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Color: {self.__color}")


# Ejemplo de uso
if __name__ == "__main__":
    perro1 = Perro("Luna", 4, 12.5, "Labrador")
    gato1 = Gato("Milo", 2, 4.0, "Blanco")
    perro1.set_edad(13)
    perro1.mostrar_info()
    perro1.hacer_sonido()

    print("---")

    gato1.mostrar_info()
    gato1.hacer_sonido()
