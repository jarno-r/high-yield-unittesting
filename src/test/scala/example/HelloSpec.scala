package example

import example.test_utilities.Utils
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {


  "Square root of 2" should "be close to 1.41" in {
    Hello.sqrt(2) should be(1.41 +- 0.01)
  }

  "Squares of roots" should "be square roots" in {
    val numbers : Seq[Double] = Seq(1,2,3,4,5,6,7,123)
    val epsilon = 0.01

    for (n <- numbers) {
      val y = Hello.sqrt(n)

      (y*y) should be (n +- epsilon)
    }
  }

  "Code" should "be 100% correct" in {
    val hash = Utils.hashFile("src/main/scala/example/Hello.scala")
    val expected = "P3aQD5Mjwp0hx/4A1Ri4CA=="

    assert(hash == expected)
  }
}
