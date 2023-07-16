import scala.io.StdIn

object Q6 {
  def main(args: Array[String]): Unit = {
    print("Enter Number: ")
    val n = StdIn.readInt()
    printFibo(n, 0)
  }

  def fib(n: Int): Int = {
    if (n <= 1)
      n
    else
      fib(n - 1) + fib(n - 2)
  }

  def printFibo(n: Int, i: Int): Unit = {
    if (i < n) {
      println(fib(i))
      printFibo(n, i + 1)
    }
  }
}
