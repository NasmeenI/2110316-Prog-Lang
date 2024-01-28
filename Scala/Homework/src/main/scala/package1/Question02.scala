package package1

object Question02 {
  def main(args: Array[String]): Unit = {
    val l = List(10, 30, 40, 50)
    println(insertInOrder(20, l))
  }
  def insertInOrder(x: Int, l: List[Int]): List[Int] = {
    if (l.isEmpty) List(x)
    else if (l.head >= x) x :: l
    else l.head :: insertInOrder(x, l.tail)
  }
}