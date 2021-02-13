package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long) = {
    println("by Value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long) = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 24)
  printFirst(34, infinite())
}

