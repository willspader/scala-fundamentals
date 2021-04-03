package com.github.willspader.urionlinejudge

// URI 1329

object Main1329 {

    def main(args: Array[String]) {

        var times = io.StdIn.readLine().toInt

        while (times != 0) {
            val sum = io.StdIn.readLine().split(" ").map(x => x.toInt).sum

            println(s"Mary won ${times-sum} times and John won $sum times")

            times = io.StdIn.readLine().toInt
        }
    }

}