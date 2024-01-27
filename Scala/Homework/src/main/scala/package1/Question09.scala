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
    rec(f, tape, 0, n)
  }

  private def rec(f: Char => Char, tape: List[Char], pos: Int, n: Int): List[Char] = {
    if(tape.isEmpty) Nil
    else if(pos == n) tape
    else f(tape.head) :: rec(f, tape.tail, pos+1, n)
  }

  private def f(a: Char): Char = {
    a.toLower
  }
}