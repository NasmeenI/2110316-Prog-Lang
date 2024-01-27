package package1

object one {
  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5)
    println(partition(l, f1)) // List(List(1, 3, 5), List(2, 4))
    println(partition(l, f2)) // List(List(4, 5), List(1, 2, 3))
    println(partition(l, (x => x == 0))) // List(List(), List(1, 2, 3, 4, 5))
    println(partition(l, (x => x < 6))) // List(List(1, 2, 3, 4, 5), List())
  }

  private def partition(l: List[Int], f: Int => Boolean): List[List[Int]] = {
    return List(rec1(l, f), rec2(l, f))
  }

  private def rec1(l: List[Int], f: Int => Boolean): List[Int] = {
    if(l.isEmpty) return l
    else if(f(l.head)) return l.head :: rec1(l.tail, f)
    else return rec1(l.tail, f)
  }

  private def rec2(l: List[Int], f: Int => Boolean): List[Int] = {
    if(l.isEmpty) return l
    else if(!f(l.head)) return l.head :: rec2(l.tail, f)
    else return rec2(l.tail, f)
  }

  private def f1(x: Int): Boolean = {
    x % 2 == 1
  }

  private def f2(x: Int): Boolean = {
    x * x > 10
  }
}