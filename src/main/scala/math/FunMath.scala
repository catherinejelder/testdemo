package math
import scala.annotation.tailrec

object FunMath {
  
  @tailrec
  def divisibleByThree(x: Int): Boolean = {
    val sum = sumOfDigits(x)
    if (sum < 10) {
      sum match {
        case 0 | 3 | 6 | 9 => true
        case _ => false
      }
    } else divisibleByThree(sum)
  }
  
  private def sumOfDigits(x: Int): Int = 
    Math.abs(x).toString.toList.map(c => c.asDigit).foldLeft(0)(_ + _)
}