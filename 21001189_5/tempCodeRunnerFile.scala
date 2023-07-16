object Q4{

    def main(args:Array[String]):Unit={
        println(detEvenOrOdd(12));
    }

    def detEvenOrOdd(num : Int):Int={
        if (num == 1)
            1;
        else if (num == 0)
            0;
        else 
            {
                detEvenOrOdd(num-2);
            }
    }
}