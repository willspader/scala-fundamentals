package com.github.willspader

object Basics extends App {

  val meaningOfLife: Int = 42

  val aBoolean = false

  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expressions = structures that can be reduced to a value
  val anExpression = 2 + 3

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999
  val chainedIfExpression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else 0

  val aCodeBlock = {
    val aLocalValue = 67

    // value of block is the value of the last expression
    aLocalValue + 3
  }

  // define a function
  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  // recursive functions
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  val theUnit = ()

}
