import math


class GeneratePrimes:
    def __init__(self):
        pass

    def generate_primes(self, max_value):
        if max_value >= 2:    # the only valid case
            f, s = self.init_check_primes(max_value)
            self.sieve(f, s)
            count = self.count_primes(f, s)
            primes = self.make_primes(count, f, s)
            return primes    # return the primes
        else:
            return []    # return null array if bad input

    def init_check_primes(self, max_value):
        # declarations
        s = max_value + 1  # size of array
        f = []
        # initialize array to true
        for i in range(0, s):
            f.append(True)
        # get rid of know non-primes
        f[0] = f[1] = False
        return f, s

    def count_primes(self, f, s):
        # how many primes are there?
        count = 0
        for i in range(s):
            if f[i]:
                # bump count
                count += 1
        return count

    def make_primes(self, count, f, s):
        primes = [0 for i in range(count)]
        # move the primes into the result
        j = 0
        for i in range(s):
            if f[i]:  # if prime
                primes[j] = i
                j += 1
        return primes

    def sieve(self, f, s):
        # sieve
        for i in range(2, int(math.sqrt(s) + 1)):
            # if i is uncrossed, cross its multiples
            if f[i]:
                j = 2 * i
                while j < s:
                    # multiple is not prime
                    f[j] = False
                    j += i

