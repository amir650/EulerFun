object Problem5 {

  //2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
  //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

  def main(args: Array[String]) {

    print(Iterator.iterate(20L)(_+20L).find(isEvenlyDivisible))

  }

  def isEvenlyDivisible(n: Long) : Boolean = (1 to 20).forall(n % _ == 0)

}
