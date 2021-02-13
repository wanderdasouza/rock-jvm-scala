package lectures.part1basics

object Recursion extends App {

  def anotherFactorial(n: BigInt): BigInt = {

    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x-1, x * accumulator) // recursão de cauda = use uma chamada recursiva como a ultima expressão
    }

    factorialHelper(n,1)
  }

  println(anotherFactorial(1))

  // quando precisar de loops, use recursão de cauda

  // mesmos exercicios da aula de função, mas usando recursão de cauda

  def concatenateNTimes(s: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateNTimes(s, n-1, s + accumulator)
  }

  println(concatenateNTimes("Hello", 5, ""))

  def isPrime(n: Int): Boolean = {

    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n / 2, true)
  }

  println(isPrime(11))
  println(isPrime(10))

  def fibonacci(n: Int): Int = {

    def fibonacciTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fibonacciTailRec(i+1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibonacciTailRec(2, 1, 1)
  }

  println(fibonacci(8))
}


