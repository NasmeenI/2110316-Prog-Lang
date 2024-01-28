package package1

object Question04 {
  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 2, 1)
    println(palindrome(l))
  }
  def palindrome(l :List[Any]): Boolean = {
    if(l.length <= 1) true
    else l.head == reverse(l).head && palindrome(reverse(l.tail).tail)
  }
  private def reverse(l: List[Any]): List[Any] = {
    if(l.isEmpty) Nil
    else reverse(l.tail) ++ List(l.head)
  }
}