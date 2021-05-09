import unittest
from generate_primes import GeneratePrimes

class TestGeneratePrimes(unittest.TestCase):
    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_generate_primes(self):
        gen_primes = GeneratePrimes()
        max_value = 15
        primes = gen_primes.generate_primes(max_value)
        print("Primes : ", primes)
        answer = [2, 3, 5, 7, 11, 13]
        self.assertEqual(answer, primes)


if __name__ == "__main__":
    unittest.main()