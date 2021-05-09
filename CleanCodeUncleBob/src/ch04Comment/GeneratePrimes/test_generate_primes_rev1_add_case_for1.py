import unittest
from generate_primes import GeneratePrimes

class TestGeneratePrimes(unittest.TestCase):
    def setUp(self):
        self.gen_primes = GeneratePrimes()

    def tearDown(self):
        del self.gen_primes

    def test_generate_primes(self):
        # given
        max_value = 15
        answer = [2, 3, 5, 7, 11, 13]

        # when
        primes = self.gen_primes.generate_primes(max_value)
        # then

        print("Primes : ", primes)
        self.assertEqual(answer, primes)

    def test_generate_primes_less_than_two(self):
        # given
        max_value = 1

        # when
        primes = self.gen_primes.generate_primes(max_value)

        # then
        answer = []
        self.assertEqual(answer, primes)


if __name__ == "__main__":
    unittest.main()