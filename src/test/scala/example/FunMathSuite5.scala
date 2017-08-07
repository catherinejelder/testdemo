package example

import org.scalatest.prop.Checkers
import org.scalacheck.Prop.forAll
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import math.FunMath
import math.FunMath._

class FunMathSuite5 extends FunSuite with Checkers {
  val propIsMultipleOfThree = forAll{(n: Int) => FunMath.divisibleByThree(n) == ((n % 3) == 0)}
  
  test("results agree with mod 3") {
    check(propIsMultipleOfThree)
  }
}