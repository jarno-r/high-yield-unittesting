package example

import java.nio.file.{Files, Path, Paths}
import java.security.MessageDigest
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {

  def hashFile(path : String) = {
    val codePath = Paths.get(path)
    val bytes = Files.readAllBytes(codePath)
    val md = MessageDigest.getInstance("MD5")
    md.update(bytes)
    val digest = md.digest()
    val hash = java.util.Base64.getEncoder().encodeToString(digest)

    hash
  }

  "Square root of 2" should "be close to 1.41" in {
    Hello.sqrt(2) should be (1.41 +- 0.01)
  }

  "Code" should "be 100% correct" in {
    val hash = hashFile("src/main/scala/example/Hello.scala")
    val expected = "P3aQD5Mjwp0hx/4A1Ri4CA=="
    assert(hash == expected)
  }
}
