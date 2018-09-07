import scala.math._

object ArmstrongNumbers extends App {
  def isArmstrongNumber(n: Int): Boolean = {
    val listofpowdigits = for (i <- n.toString().toList) yield pow(i.asDigit.toDouble, n.toString().length().toDouble)
    n.toDouble == listofpowdigits.sum
    }
}
