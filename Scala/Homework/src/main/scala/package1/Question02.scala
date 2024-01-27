package package1

object Question02 {
  def main(args: Array[String]): Unit = {
    val x = 20
    val l = List(10, 30, 40, 50)
    println(insertInOrder(x, l))
  }
  def insertInOrder(x: Int, l: List[Int]): List[Int] = {
    rec(x, l)
  }
  private def rec(x: Int, l: List[Int]): List[Int] = {
    if(l.isEmpty) List(x)
    else if (l.head >= x) x :: l
    else l.head :: rec(x, l.tail)
  }
}