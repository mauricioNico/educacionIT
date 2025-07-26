class IDValidator:
    def __init__(self, id_number):
        self.id_number = id_number

    def es_valido(self):
        if not isinstance(self.id_number, int):
            return False
        if 10000000 <= self.id_number <= 99999999:
            return True
        return False