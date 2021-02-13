package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // Expressão
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension) - operadores aritméticos

  println(1 == x)
  // == != > >= < <= - operadores relacionais

  println(!(1 == x))
  // ! && || - operadores booleanos

  var aVariable = 2
  aVariable += 3 // também valido com -= *= /= (todos esses causam efeitos colaterais)
  println(aVariable)

  // Instruções (comandos, imperativos) vs Expressões (possui valor ou tipo)

  // IF expression (Em Scala If's são expressões)
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF expression
  print(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while(i < 10) {
    println(i)
    i += 1
  }

  // ^ NUNCA ESCREVA ISSO ACIMA DE NOVO (EM SCALA)

  // TUDO em Scala é uma expressão!!

  val aWeirdValue = (aVariable = 3) // Tipo Unit === void
  println(aWeirdValue)

  // efeitos colaterais: println(), whiles, reatribuições

  // blocos de código

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "goodbye" // O tipo de um bloco de código é o valor da sua ultima expressão
  }

  // 1. Qual a difereça entre "Hello World" vs println("hello world")?
  // R: "Hello world" é um valor do tipo String, já println("hello world") é uma expressão que imprime "Hello World" na tela, mas retorna Unit

  // 2
  val someValue = {
    2 < 3
  } // R: tipo Booleano false

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  } // Retorna o valor 42

  println(someOtherValue)
}
