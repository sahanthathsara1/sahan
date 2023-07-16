import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter Number: ")
    val n = StdIn.readInt()

    primeSeq(n)
  }

  def isPrime(n: Int, i: Int): Boolean = {
    if (n==1 )
    {
        false
    }
    else if (n == 2) 
    {
      true
    } 
    else if (i <= 1) 
    {
      true
    } 
    else if (n % i == 0) 
    {
      false
    } 
    else 
    {
      prime(n, i - 1)
    }
  }
  }

  def primeSeq(n: Int): Unit = {
    if (n <= 0) {
      return
    }

    if (isPrime(n, n - 1)) {
      println(n)
    }

    primeSeq(n - 1)
  }
