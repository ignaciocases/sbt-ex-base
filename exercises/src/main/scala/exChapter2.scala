package fp

import scala.annotation._

object Ex2 {
  
  object Ex2_1 {
  
    def fibonacci(n: Int): Int = {
      @annotation.tailrec
      def go(a: Int, b: Int, n: Int): Int = (a, b, n) match {
        case (a, b, 0) => b
        case (a, b, n) => go(a + b, a, n - 1)
      }
      go(0, 1, n)
    }
  
    def twentyFibos = {
      val m = List.tabulate(20)(e => e).map(fibonacci)
      // println("Fibonacci of the first 20 numbers: " + m)
      m
    }
  }

}
