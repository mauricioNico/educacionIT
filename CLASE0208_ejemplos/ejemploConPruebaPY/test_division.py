import unittest
from division import dividir

class TestDivision(unittest.TestCase):
    def test_division_correcta(self):
        self.assertEqual(dividir(10, 2), 5)

    def test_division_por_cero(self):
        with self.assertRaises(ZeroDivisionError):
            dividir(10, 0)

    def test_entrada_no_numerica(self):
        with self.assertRaises(ValueError):
            dividir("a", 2)

    def test_resultado_decimal(self):
        self.assertAlmostEqual(dividir(7, 3), 2.3333333, places=5)

if __name__ == '__main__':
    unittest.main()
