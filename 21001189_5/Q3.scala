import scala.io.StdIn
object Q3{

  def main (args:Array[String]):Unit={
    print("Enter Number: ")
    val n = StdIn.readInt()
    println(sum(n));
  }

  def sum(num:Int):Int={
    if (num == 1)
      return 1;


    num + (sum(num-1));
  }
}