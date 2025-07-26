try:
    dividendo = float(input("Ingrese el dividendo: "))
    divisor = float(input("Ingrese el divisor: "))

    resultado = dividendo / divisor
    print(f"El resultado es: {resultado}")

except ZeroDivisionError:
    print("Error: División por cero no permitida.")
except ValueError:
    print("Error: Debe ingresar números válidos.")

print("Hola Mundo")