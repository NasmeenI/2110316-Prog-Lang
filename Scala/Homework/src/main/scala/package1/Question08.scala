package package1

object Question08 {
  def main(args: Array[String]): Unit = {
    println(maxAll(List()))                                                                                           // List()
    println(maxAll(List(List())))                                                                                     // List()
    println( maxAll(List(List(1,2,3,4,8,9),List(),List(4,5),List(1,2,3,5,6,10,11))) )                                 // List(4, 5, 3, 5, 8, 10,11)
    println(maxAll(List(List(3, 4), List(1, 2, 3, 4, 51, 61), List(1, 2, 31, 41, 61, 51))))                           // List(3, 4, 31, 41, 61, 61)
    println(maxAll(List(List(1, 2, 3, 40, 5, 6), List(10, 2, 30, 4), List(1, 200), List(0, 0, 0, 0, 0, 0, 0, 0, 9)))) // List(10, 200, 30, 40, 5, 6, 0, 0, 9)
  }
  def maxAll(lists: List[List[Int]]): List[Int] = {
    rec1(0, getGoal(lists), lists)
  }
  private def rec1(pos: Int, goal: Int, lists: List[List[Int]]): List[Int] = {
    if(lists.isEmpty || pos == goal) Nil
    else rec2(pos, lists) :: rec1(pos+1, goal, lists)
  }
  private def rec2(pos: Int, lists: List[List[Int]]): Int = {
    if(lists.isEmpty) 0
    else if(rec3(0, pos, lists.head) > rec2(pos, lists.tail)) rec3(0, pos, lists.head)
    else rec2(pos, lists.tail)
  }
  private def rec3(cnt: Int, pos: Int, list: List[Int]): Int = {
    if(list.isEmpty) 0
    else if(cnt == pos) list.head
    else rec3(cnt+1, pos, list.tail)
  }
  private def getGoal(lists: List[List[Int]]): Int = {
    if(lists.isEmpty) 0
    else if(lists.head.length > getGoal(lists.tail)) lists.head.length
    else getGoal(lists.tail)
  }
}