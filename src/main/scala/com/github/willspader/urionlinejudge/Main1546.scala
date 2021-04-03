package com.github.willspader.urionlinejudge

object Main1546 {

  def main(args: Array[String]): Unit = {
    val categories = Map((1, "Rolien"), (2, "Naej"), (3, "Elehcim"), (4, "Odranoel"))

    val n = io.StdIn.readLine().toInt

    for (i <- 0 until n) {
      val k = io.StdIn.readLine().toInt

      for (j <- 0 until k) {
        val feedbackCat = io.StdIn.readLine().toInt

        println(categories(feedbackCat))
      }
    }
  }

}
