package example


import org.scalatest.FunSuite
import math.FunMath

class FunMathSuite extends FunSuite {
  // basic numbers
  test("1 should fail") {
    assert(FunMath.divisibleByThree(1) == false)
  }
  test("2 should fail") {
    assert(FunMath.divisibleByThree(2) == false)
  }
  test("3 should pass") {
    assert(FunMath.divisibleByThree(3) == true)
  }
  
  // tiny numbers
  test("-17077161 should pass") {
    assert(FunMath.divisibleByThree(-17077161) == true)
  }
  test("-2147483648 should fail") {
    assert(FunMath.divisibleByThree(Int.MinValue) == false)
  }
  
  // huge numbers
  test("6442449 should pass") {
    assert(FunMath.divisibleByThree(6442449) == true)
  }
  test("2147483647 should fail") {
    assert(FunMath.divisibleByThree(Int.MaxValue) == false)
  }  
  
  // weird numbers
  test("0 should pass") {
    assert(FunMath.divisibleByThree(0) == true)    
  }
}