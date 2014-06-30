object Problem10 {

  //The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  //Find the sum of all the primes below two million.

  def main(args: Array[String]) {

    print((2L to 2000000L).filter(isPrime).sum)

  }

  def isPrime(n: Long): Boolean = {

    if(n < 2) {
      return false
    }

    if(n == 2 || n == 3) {
      return true
    }

    val limit = (Math.sqrt(n) + 1).toLong

    (2L to limit).forall(x => n % x != 0)

  }

}
