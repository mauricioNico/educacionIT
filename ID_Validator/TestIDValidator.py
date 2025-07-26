import unittest
from id_validator import IDValidator

class TestIDValidator(unittest.TestCase):
    def test_id_valido(self):
        validator = IDValidator(12345678)
        self.assertTrue(validator.es_valido())

    def test_id_no_entero(self):
        validator = IDValidator("12345a78")
        self.assertFalse(validator.es_valido())

    def test_id_menos_digitos(self):
        validator = IDValidator(1234567)
        self.assertFalse(validator.es_valido())

    def test_id_mas_digitos(self):
        validator = IDValidator(123456789)
        self.assertFalse(validator.es_valido())

if __name__ == '__main__':
    unittest.main()