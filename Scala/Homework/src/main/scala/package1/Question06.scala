package package1

object Question06 {
  def main(args: Array[String]): Unit = {
    println( myFilter(x => x%2==0)(List(1,2,3,4,5)) ) // List(2,4)
    println( myFilter(isLessThan3)(List(1,2,3,4,5)) ) // List(1,2)
  }
  def myFilter(f: Int => Boolean) (list: List[Int]): List[Int] = {
    rec(f, list)
  }
  private def rec(f: Int => Boolean, l: List[Int]): List[Int] = {
    if(l.isEmpty) Nil
    else if(f(l.head)) l.head :: rec(f, l.tail)
    else rec(f, l.tail)
  }
  private def isLessThan3(x:Int) = x<3
}