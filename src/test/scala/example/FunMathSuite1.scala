package example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import math.FunMath
import math.FunMath._

class FunMathSuite1 extends FunSuite {
  test("1 should fail") {
    assert(FunMath.divisibleByThree(1) == false)
  }
  test("2 should fail") {
    assert(FunMath.divisibleByThree(2) == false)
  }
  test("3 should pass") {
    assert(FunMath.divisibleByThree(3) == true)
  }
}