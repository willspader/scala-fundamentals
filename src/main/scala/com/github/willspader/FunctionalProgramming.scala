package com.github.willspader

object FunctionalProgramming extends App {

  val stringConcatenator = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  // equivalent to Function2[String, String, String]
  val stringConcatenator2 = new ((String, String) => String) {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  // --- syntax sugars ---

  // implicit apply method
  val doubler: Int => Int = (x: Int) => x * 2
  doubler(2)

  // higher-order functions: take functions as args / return functions as results
  val aMappedList: List[Int] = List(1, 2, 3).map(x => x + 1)
  val aFlatMappedList: List[Int] = List(1, 2, 3).flatMap(x => List(x, x * 2))
  println(aFlatMappedList)

  val aFilteredList: List[Int] = List(1, 2, 3, 4, 5).filter(_ % 2 == 0)
  println(aFilteredList)

  val chars = List(1, 2, 3).flatMap(number => List('a', 'b', 'c').map(letter => s"$number-$letter"))
  println(chars)

  // for comprehensions
  val alternativePairs = for {
    number <- List(1, 2, 3)
    letter <- List('a', 'b', 'c')
  } yield s"$number-$letter"
  println(alternativePairs)

  // sequences
  val aSequence: Seq[Int] = Seq(1, 2, 3)
  val accessedElement = aSequence(1)

  // vectors: fast Seq implementation
  val aVector: Vector[Int] = Vector(1, 2, 3, 4, 5)

  // sets
  val aSet: Set[Int] = Set(1, 2, 3, 4, 5, 5) // 1, 2, 3, 4, 5
  val setHasFive = aSet.contains(5)

  // ranges
  val inclusive: Range.Inclusive = 1 to 1000
  val rangeAsList: List[Int] = inclusive.toList

  // tuples
  val aTuple = (1, 2)

  // maps
  val aPhoneBook: Map[String, Int] = Map(
    ("William", 1),
    ("Spader", 2)
  )

}
