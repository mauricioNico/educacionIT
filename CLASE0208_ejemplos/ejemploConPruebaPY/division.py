def dividir(dividendo, divisor):
    if not isinstance(dividendo, (int, float)) or not isinstance(divisor, (int, float)):
        raise ValueError("Los valores deben ser numéricos")
    if divisor == 0:
        raise ZeroDivisionError("No se puede dividir por cero")
    return dividendo / divisor
