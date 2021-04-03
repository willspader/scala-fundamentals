package com.github.willspader.urionlinejudge

// URI 1192

object Main1192 {

  def main(args: Array[String]): Unit = {
    val times = io.StdIn.readLine().toInt

    for (w <- 1 to times) {
      val line = io.StdIn.readLine()

      val intA = line.charAt(0).asDigit
      val intB = line.charAt(2).asDigit

      if (intA == intB) {
        println(intA * intB)
      } else if (line.charAt(1) >= 'a' && line.charAt(1) <= 'z') {
        println(intA + intB)
      } else {
        println(intB - intA)
      }
    }
  }

}
