package lectures.part1basics

import scala.math.sqrt

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterLessFunnction(): Int = 42
  println(aParameterLessFunnction())
  println(aParameterLessFunnction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // QUANDO VOCÊ PRECISAR DE LOOPS, USE RECURSÃO! NÃO USE CODIGO IMPERATIVO EM SCALA

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFuncion(a: Int, b: Int): Int = a + b

    aSmallerFuncion(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old
    2. Factorial function
    3. A Fibonacci function
    4. Test if a number is prime.
  */

  def greeting(name: String, age: Int) = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(greeting("paulo", 23))

  def factorial(n: Int): Int = if (n == 1) 1 else n * factorial(n-1)

  println(factorial(5))

  def fibonacci(n: Int): Int = if (n <= 2) 1 else fibonacci(n-1) + fibonacci(n-2)

  println(fibonacci(25))

  def isPrime(original: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else original % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(original / 2)
  }

  println(isPrime(11))

}
