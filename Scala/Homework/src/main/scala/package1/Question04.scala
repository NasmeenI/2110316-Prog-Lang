package package1

object Question04 {
  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 3, 2, 1)
    println(palindrome(l))
  }
  def palindrome(l :List[Any]): Boolean ={
    rec(0, l.length/2, l, reverse(l))
  }
  private def rec(pos: Int, goal: Int, l1: List[Any], l2: List[Any]): Boolean = {
    if(pos == goal) true
    else if(l1.head != l2.head) false
    else rec(pos+1, goal, l1.tail, l2.tail)
  }
  private def reverse(l: List[Any]): List[Any] = {
    if(l.isEmpty) Nil
    else reverse(l.tail) ++ List(l.head)
  }
}