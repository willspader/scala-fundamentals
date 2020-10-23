package com.github.willspader

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global

object Advanced extends App {

  // lazy evaluation
  lazy val aAlazyValue = 2
  lazy val lazyValueWithSideEffect = {
    println("I am so very lazy!")
    43
  }
  val eagerValue = lazyValueWithSideEffect + 1

  // "pseudo-collections": Option, Try

  def methodWhichCanReturnNull(): String = "Hello, Scala"
  val anOption = Option(methodWhichCanReturnNull())

  val stringProcessing = anOption match {
    case Some(_) => "Valid string"
    case None    => "Nothing"
  }

  def methodWhichCanThrowException(): String = throw new RuntimeException
  val aTry = Try(methodWhichCanThrowException())

  val anotherStringProcessing = aTry match {
    case Success(_) => "Valid value"
    case Failure(_) => "Exception"
  }

  // evaluate something on another thread - async programming
  val aFuture = Future({
    println("Loading ...")
    Thread.sleep(1000)
    println("I have computed a value.")
    67
  })

  Thread.sleep(2000)

  // implicits
  // #1: implicit args
  def aMethodWithImplicitArgs(implicit arg: Int): Int = arg + 1
  implicit val myImplicitInt = 46
  println(aMethodWithImplicitArgs)

  // #2: implicit conversions
  implicit class MyRichInteger(n: Int) {
    def isEven(): Boolean = n % 2 == 0
  }

  println(23.isEven()) // new MyRichInteger(23).isEven()

}
