package package1

object Question07 {
  def main(args: Array[String]): Unit = {
    println( myMap(x => x*2)(List(1,2,3,4,5)) ) // List(2,4,6,8,10)
  }
  def myMap(f: Int => Int) (list: List[Int]): List[Int] = {
    rec(f, list)
  }

  private def rec(f: Int => Int, l: List[Int]): List[Int] = {
    if(l.isEmpty) Nil
    else f(l.head) :: rec(f, l.tail)
  }
}