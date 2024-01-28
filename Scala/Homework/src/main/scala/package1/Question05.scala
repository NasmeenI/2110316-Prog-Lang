package package1

object Question05 {
  def main(args: Array[String]): Unit = {
    val l = List(12 ,94, 41, 54, 86 ,14, 65 ,34, 91, 4 ,8 ,19, 47)
    println(mergesort(l))
  }
  def mergesort(l: List[Int]): List[Int] = {
    if (l.length <= 1) l
    else {
      val temp = divide(List(), l)
      val left = mergesort(temp.head)
      val right = mergesort(temp.tail.head)
      conquer(left, right)
    }
  }
  private def conquer(left: List[Int], right: List[Int]): List[Int] = {
    if(left.isEmpty && right.isEmpty) Nil
    else if(left.isEmpty) right
    else if(right.isEmpty) left
    else if(left.head <= right.head) left.head :: conquer(left.tail, right)
    else right.head :: conquer(left, right.tail)
  }
  private def divide(left: List[Int], right: List[Int]): List[List[Int]] = {
    if(left.length < right.length) divide(left ++ List(right.head), right.tail)
    else List(left, right)
  }
}