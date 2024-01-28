package package1

object Question03 {
  def main(args: Array[String]): Unit = {
    val l1 = List(1, 2, 3)
    val l2 = List(1, 2, 3, 4)
    println(subList(l1, l2))
  }
  def subList(l1: List[Any], l2:List[Any]): Boolean = {
    if (l1.isEmpty) true
    else if (find(l1.head, l2)) subList(l1.tail, l2)
    else false
  }
  private def find(x: Any, l2: List[Any]): Boolean = {
    if(l2.isEmpty) false
    else if(x == l2.head) true
    else find(x, l2.tail)
  }
}