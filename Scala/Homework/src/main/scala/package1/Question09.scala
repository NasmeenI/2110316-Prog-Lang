package package1

object Question09 {
  def main(args: Array[String]): Unit = {
    val tape = List('C','H','A','R')
    println( turingStep(a => a.toLower, tape, 2) ) // List(c, h, A, R)
    println( turingStep(a => a.toLower, tape, 3) ) // List(c, h, a, R)
    println( turingStep(a => a.toLower, tape, 0) ) // List(C, H, A, R)
    println( turingStep(a => a.toLower, tape, 5) ) // List(c, h, a, r)
  }
  def turingStep(f: Char => Char, tape: List[Char], n: Int): List[Char] = {
    if(n == 0 || tape.isEmpty) tape
    else f(tape.head) :: turingStep(f, tape.tail, n-1)
  }
}