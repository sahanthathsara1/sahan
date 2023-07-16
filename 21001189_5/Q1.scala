import scala.io.StdIn

object Q1 {

  
  def main(args: Array[String]): Unit = {
    print("Enter Number: ")
    val n = StdIn.readInt()

    println(prime(n, n - 1))
  }

  def prime(n: Int, i: Int): Boolean = {
    if (n<=1 )
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
