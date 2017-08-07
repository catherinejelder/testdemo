package example


import org.scalatest.FunSuite
import math.FunMath

class FunMathSuite3 extends FunSuite {
  val multiplesOfThree = List(-17077161, 0, 3, 6442449)
  val nonMultiplesOfThree = List(Int.MinValue, 1, 2, Int.MaxValue)
  
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