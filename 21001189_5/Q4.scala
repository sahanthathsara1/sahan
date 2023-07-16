import scala.io.StdIn
object Q4{

    def main(args:Array[String]):Unit={
        print("Enter Number: ")
        val n = StdIn.readInt()
        println(detEven(n));
    }

    def detEven(num : Int):Boolean={
        if (num == 1)
            false;
        else if (num == 0)
            true;
        else 
            {
                detEven(num-2);
            }
    }
}