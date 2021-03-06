object Problem6 {

  /**
  The sum of the squares of the first ten natural numbers is, 12 + 22 + ... + 102 = 385
  The square of the sum of the first ten natural numbers is,
  (1 + 2 + ... + 10)2 = 552 = 3025
  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
  **/

  def main(args: Array[String]) {

    print(difference(100))

  }

  def difference(n: Long) : Long = squareOfSums(n) - sumOfSquares(n)

  def sumOfSquares(n: Long) : Long = (1L to n).map(x => x * x).sum

  def squareOfSums(n: Long) : Long = (1L to n).sum * (1L to n).sum

}
