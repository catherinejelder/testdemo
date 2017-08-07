package math
import FunMath._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(25); 
  
  val x = -1243458349;System.out.println("""x  : Int = """ + $show(x ));$skip(14); val res$0 = 
  Math.abs(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  x.toString();System.out.println("""res1: String = """ + $show(res$1));$skip(40); val res$2 = 
  x.toString.toList.map(c => c.asDigit);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(59); val res$3 = 
  x.toString.toList.map(c => c.asDigit).foldLeft(0)(_ + _);System.out.println("""res3: Int = """ + $show(res$3));$skip(23); val res$4 = 
  divisibleByThree(39);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(24); val res$5 = 
  divisibleByThree(400);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(22); val res$6 = 
  divisibleByThree(0);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(25); val res$7 = 
  divisibleByThree(-300);System.out.println("""res7: Boolean = """ + $show(res$7))}
}
