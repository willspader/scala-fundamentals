package com.github.willspader

object PatternMatching extends App {

  val anInteger = 55
  val order = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }
  println(order)

  case class Person(name: String, age: Int)
  val will = Person("William", 21)

  val personGreeting = will match {
    case Person(name, age) => s"Hi, my name is $name and I am $age years old."
    case _ => "Something else"
  }
  println(personGreeting)

  // deconstructing tuples
  val aTuple = ("Bon Jovi", "Rock")
  val bandDescription = aTuple match {
    case (band, genre) => s"$band belongs to the genre $genre"
    case _ => s"I don't know what you're talking about"
  }

  // decomposing a list
  val aList = List(1, 2, 3)
  val listDescription = aList match {
    case List(_, 2, _) => "List containing 2 on its second position"
    case _ => "unknown list"
  }

}
