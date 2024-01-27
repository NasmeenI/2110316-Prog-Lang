package package1

object three {
  def main(args: Array[String]): Unit = {
    println(applySeq(1)(List((x => x+1), (x => x*x),(x => x+5)) ))
    println(applySeq(100)(List()))
  }

  def applySeq(x: Int) (fList: List[Int => Int]): Int = {
    rec(x, fList)
  }

  def rec(x: Int, fList: List[Int => Int]): Int = {
    if (fList.isEmpty) x
    else rec(fList.head(x), fList.tail)
  }
}