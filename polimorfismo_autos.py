class Auto:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0  # Velocidad inicial en km/h

    def acelerar(self):
        self.velocidad += 10  # Aumenta velocidad en 10 km/h
        print(f"{self.marca} {self.modelo} acelera a {self.velocidad} km/h.")


class AutoCarrera(Auto):
    def __init__(self, marca, modelo, turbo):
        super().__init__(marca, modelo)
        self.turbo = turbo

    def acelerar(self):
        self.velocidad += 30  # Aumenta velocidad más rápido
        print(f"{self.marca} {self.modelo} (turbo: {self.turbo}) acelera fuertemente a {self.velocidad} km/h!")


# Prueba del polimorfismo
def probar_aceleracion(auto):
    for _ in range(3):
        auto.acelerar()


# Crear instancias
auto_normal = Auto("Toyota", "Corolla")
auto_de_carrera = AutoCarrera("Ferrari", "F8", "V12")

# Mostrar comportamiento polimórfico
print("Acelerando auto normal:")
probar_aceleracion(auto_normal)

print("\nAcelerando auto de carrera:")
probar_aceleracion(auto_de_carrera)
