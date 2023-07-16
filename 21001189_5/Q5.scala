import scala.io.StdIn
object Q4{

    def main(args:Array[String]):Unit={
        print("Enter Number: ")
        val n = StdIn.readInt()
        evenSeq(n);
    }

    def detEvenOrOdd(num : Int):Boolean={
        if (num == 1)
            false;
        else if (num == 0)
            true;
        else 
            {
                detEvenOrOdd(num-2);
            }
    }

    def evenSeq(n:Int):Unit={
        if (n<=1)
            return;
        if (detEvenOrOdd(n))
            println(n);
        
        
        evenSeq(n-1);
    }
}