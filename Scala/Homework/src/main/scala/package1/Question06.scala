package package1

object Question06 {
  def main(args: Array[String]): Unit = {
    println( myFilter(x => x%2==0)(List(1,2,3,4,5)) ) // List(2,4)
    println( myFilter(x =>  x < 3)(List(1,2,3,4,5)) ) // List(1,2)
  }
  def myFilter(f: Int => Boolean) (list: List[Int]): List[Int] = {
    if (list.isEmpty) Nil
    else if (f(list.head)) list.head :: myFilter(f)(list.tail)
    else myFilter(f)(list.tail)
  }
}