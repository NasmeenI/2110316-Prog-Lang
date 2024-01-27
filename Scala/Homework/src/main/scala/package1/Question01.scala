package package1

object Question01 {
  def main(args: Array[String]): Unit = {
    val x = 30
    val pos = 2
    val l = List(10, 20, 30, 40)
    println(insertAtPosition(x, pos, l))
  }

  def insertAtPosition(x: Any, pos: Int, l:List[Any]): List[Any] = {
    rec(x, pos, l, 0)
  }

  private def rec(x: Any, pos: Int, l:List[Any], cnt: Int): List[Any] = {
    if(l.isEmpty) l
    else if(cnt == pos) x :: l
    else l.head :: rec(x, pos, l.tail, cnt+1)
  }
}