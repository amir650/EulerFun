object Problem124 {

  def main (args: Array[String]) {

    val v = (1 to 100000).map(x => (x, rad(x))).sortBy(_._2)
    println(v(10000 - 1))

  }

  def rad(number: Int) : Int = primeFactors(number).product

  def primeFactors(number: Int) : Set[Int] = {

    def primeFactorsImpl(number: Int, result: Set[Int] = Set()): Set[Int] = {
      for(n <- 2 to number if number % n == 0) {
        return primeFactorsImpl(number / n, result + n)
      }
      result
    }

    collection.immutable.SortedSet[Int]() ++ primeFactorsImpl(number)

  }


}
