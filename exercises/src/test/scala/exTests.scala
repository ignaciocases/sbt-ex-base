import org.specs2._
import fp.Ex2._

class Ex2 extends Specification { def is = s2"""

 This is a specification to check the Exercises of FP Chapter 2

 Ex 2.1
 The Fibonacci result should
   contain 20 elements                                           $e211
   start with F(0) = 0                                           $e212
   end with F(20) = 2584                                         $e213

 Ex 2.2
 The Fibonacci result should
   contain 20 elements                                           $e221
   start with F(0) = 0                                           $e222
   end with F(20) = 2584                                         $e223

                                                                 """

  import Ex2_1._

  def e211 = twentyFibos must have size(20)
  def e212 = twentyFibos.head === (1)
  def e213 = twentyFibos.last === (2584)


  def e221 = twentyFibos must have size(20)
  def e222 = twentyFibos.head === (1)
  def e223 = twentyFibos.last === (2584)

}