package lectures.part1basics

object DefaultArgs extends App {

  def trFact(x: BigInt, accumulator: BigInt = 1): BigInt = {
    if (x <= 1) accumulator
    else trFact(x-1, x * accumulator) // recursão de cauda = use uma chamada recursiva como a ultima expressão
  }

  val fact10 = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080) = println("saving picture")
  savePicture()


  /*
    1. pass in every leading argument
    2. name the arguments
  */
}
