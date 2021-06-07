package example.test_utilities

import java.nio.file.{Files, Paths}
import java.security.MessageDigest
import java.util.Base64

object Utils {
  def hashFile(path: String) = {
    val codePath = Paths.get(path)
    val bytes = Files.readAllBytes(codePath)
    val md = MessageDigest.getInstance("MD5")
    md.update(bytes)
    val digest = md.digest()
    val hash = Base64.getEncoder().encodeToString(digest)

    hash
  }
}
