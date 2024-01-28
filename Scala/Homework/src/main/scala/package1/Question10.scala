package package1

object Question10 {
  def main(args: Array[String]): Unit = {
    println(alternate((a: Int, b: Int) => a+b, (a: Int, b:Int) => a-b, List()))           // 0
    println(alternate((a: Int, b: Int) => a+b, (a: Int, b:Int) => a-b, List(55)))         // 55
    println(alternate((a: Int, b: Int) => a+b, (a: Int, b:Int) => a-b, List(1, 2)))       // 3
    println(alternate((a: Int, b: Int) => a+b, (a: Int, b:Int) => a-b, List(1, 2, 3)))    // 0
    println(alternate((a: Int, b: Int) => a+b, (a: Int, b:Int) => a-b, List(1, 2, 3, 4))) // 4
  }
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list: List[Int]): Int = {
    if(list.isEmpty) 0
    else rec(0, list.head, f1, f2, list.tail)
  }
  private def rec(cnt: Int, bf: Int, f1: (Int,Int) => Int, f2: (Int,Int) => Int, l: List[Int]): Int = {
    if(l.isEmpty) bf
    else if(cnt % 2 == 0) rec(cnt+1, f1(bf, l.head), f1, f2, l.tail)
    else rec(cnt+1, f2(bf, l.head), f1, f2, l.tail)
  }
}