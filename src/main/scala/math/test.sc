package math
import FunMath._

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = -1243458349                             //> x  : Int = -1243458349
  Math.abs(x)                                     //> res0: Int = 1243458349
  x.toString()                                    //> res1: String = -1243458349
  x.toString.toList           //> res2: List[Int] = List(-1, 1, 2, 4, 3, 4, 5, 8, 3, 4, 9)
  x.toString.toList.map(_.asDigit).sum
                                                  //> res3: Int = 42
  divisibleByThree(39)                            //> res4: Boolean = true
  divisibleByThree(400)                           //> res5: Boolean = false
  divisibleByThree(0)                             //> res6: Boolean = false
  divisibleByThree(-300)
  divisibleByThree(432)//> res7: Boolean = true
  divisibleByThree(4)
}