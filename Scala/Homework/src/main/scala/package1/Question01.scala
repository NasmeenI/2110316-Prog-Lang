package package1

object Question01 {
  def main(args: Array[String]): Unit = {
    val l = List(10, 20, 30, 40)
    println(insertAtPosition(30, 2, l))
  }
  def insertAtPosition(x: Any, pos: Int, l:List[Any]): List[Any] = {
    if(pos == 0 || l.isEmpty) x :: l
    else l.head :: insertAtPosition(x, pos-1, l.tail)
  }
}