package com.github.willspader

object ObjectOrientation extends App {

  class Animal {
    val age: Int = 0
    def eat() = println("I'm eating")
  }
  val anAnimal = new Animal

  // inheritance
  class Dog(val name: String) extends Animal

  val aDog = new Dog("Alemao")

  // subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Odie")

  abstract class WalkingAnimal {
    val hasLegs = true // public by default
    def walk(): Unit
  }

  // "interface"
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(animal: Animal): Unit = println("I am eating you, animal!")

    override def eat(): Unit = super.eat()
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // infix notation

  val basicMath = 1 + 2
  val anotherBasicMath = 1.+(2)

  // anonymous classes
  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I am a dinosaur, so I can eat anything")
  }

  // singleton object
  object MySingleton {
    val mySpecialValue = 452
    def mySpecialMethod(): Int = 31
    def apply(x: Int): Int = x + 1
  }

  MySingleton.mySpecialMethod()
  MySingleton.apply(65)
  MySingleton(65) // equivalent to MySingleton.apply(65)

  /*
    case classes
    - sensible equals and hash code
    - serialization
    - companion with apply
    - pattern matching
  */
  case class Person(name: String, age: Int)
  val bob = Person("Bob", 54) // Person.apply("Bob", 54)

  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => "Oops!"
  } finally {
    println("hello")
  }

  // generics
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  val aList: List[Int] = List(1, 2, 3) // List.apply(1, 2, 3)
  val first = aList.head
  val rest = aList.tail

}
