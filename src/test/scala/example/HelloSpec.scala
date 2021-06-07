package example

import example.test_utilities.Utils
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {


  "Square root of 2" should "be close to 1.41" in {
    Hello.sqrt(2) should be(1.41 +- 0.01)
  }

  "Code" should "be 100% correct" in {
    val hash = Utils.hashFile("src/main/scala/example/Hello.scala")
    val expected = "P3aQD5Mjwp0hx/4A1Ri4CA=="

    assert(hash == expected)
  }
}
