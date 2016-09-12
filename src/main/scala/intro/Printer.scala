package intro

/**
  * Created by vic on 9/11/16.
  */
class Printer(x: String) {
  def print(): Unit = {
    println(x)
  }
}

object Printer {
  def apply(x: String): Printer = new Printer(x)
}
