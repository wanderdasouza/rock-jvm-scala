package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  // VALS SÃO IMUTAVEIS
  // COMPILADOR PODE INFERIR OS TIPOS DAS VARIAVEIS

  val aString: String = "Hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 461 // int com menor capacidade (tipo short em C)
  val aLong: Long = 43423424234234L // mesmo que o c
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  aVariable = 5 // sujeitos a efeitos colaterais (segundo a programação funcional)
}
