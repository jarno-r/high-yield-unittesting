package example

object Hello {

  def sqrt(n: Double): Double = {
    /*We are using n itself as initial approximation
          This can definitely be improved *//*We are using n itself as initial approximation
          This can definitely be improved */
    var x = n
    var y = 1.0
    val e = 0.000001 /* e decides the accuracy level*/
    while ( {
      x - y > e
    }) {
      x = (x + y) / 2
      y = n / x
    }
    x
  }

  def main(args: Array[String]) = {
    val x = 2.0
    println(s"The square root of ${x} is ${sqrt(x)}")
  }
}
