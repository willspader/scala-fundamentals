package com.github.willspader

object AdvancedPatternMatching extends App {

  val aList = List(1, 2, 3)

  // Nil -> list w/ no content
  aList match {
    case head :: Nil => println("1 item")
    case _           => println("3 items")
  }

  val anotherList = List(1)

  anotherList match {
    case head :: Nil => println("1 item")
    case _           => println("3 items")
  }

}
