package package1

object Question05 {
  def main(args: Array[String]): Unit = {
    val l = List(12 ,94, 41, 54, 86 ,14, 65 ,34, 91, 4 ,8 ,19, 47)
    println(mergesort(l))
  }
  def mergesort(l: List[Int]): List[Int] = {
    merge(l)
  }
  private def merge(l: List[Int]): List[Int] = {
    if(l.length == 1) l
    else {
      val left = merge(getLeft(l))
      val right = merge(getRight(l))
      conquer(left, right)
    }
  }
  private def conquer(left: List[Int], right: List[Int]): List[Int] = {
    if(left.isEmpty && right.isEmpty) Nil
    else if(left.isEmpty) right.head :: conquer(left, right.tail)
    else if(right.isEmpty) left.head :: conquer(left.tail, right)
    else if(left.head <= right.head) left.head :: conquer(left.tail, right)
    else right.head :: conquer(left, right.tail)
  }
  private def getLeft(l: List[Int]): List[Int] = {
    divide(0, 0, ceiling(l.length, 2), l)
  }
  private def getRight(l: List[Int]): List[Int] = {
    divide(0, ceiling(l.length, 2), l.length, l)
  }
  private def divide(pos: Int, begin: Int, goal: Int, l: List[Int]): List[Int] = {
    if(pos < begin) divide(pos + 1, begin, goal, l.tail)
    else if (pos == goal) Nil
    else List(l.head) ++ divide(pos + 1, begin, goal, l.tail)
  }
  private def ceiling(x: Int, y: Int): Int = {
    if(x % y == 0) x/y
    else x/y+1
  }
}