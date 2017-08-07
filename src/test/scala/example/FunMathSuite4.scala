package example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import math.FunMath
import math.FunMath._

class FunMathSuite4 extends FunSuite {
  val multiplesOfThree = -17077161 :: 6442449 :: (-102 to 100 by 3).toList  
  val nonMultiplesOfThree = (Int.MinValue :: Int.MaxValue :: (-101 to 100 by 3).toList 
    ::: (-100 to 100 by 3).toList)
  
  // passing numbers
  test("multiples of three should pass") {
    for (num <- multiplesOfThree) {
      assert(FunMath.divisibleByThree(num) == true, num + " did not pass")   
    }
  }
  
  // failing numbers
  test("non multiples of three should fail") {
    for (num <- nonMultiplesOfThree) {
      assert(FunMath.divisibleByThree(num) == false, num + " did not fail")   
    }
  }
}