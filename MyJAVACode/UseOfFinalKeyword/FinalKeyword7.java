//final with foreach loop
class FinalKeyword7
{
    public static void  main(String [] args)
    {
        int [] a={10,20,30};

        for (final int i:a)
            System.out.println(i);
        //Since the “i” variable goes out of scope with each iteration of the 
        //loop, it is actually re-declaration each iteration, allowing the 
        //same token (i.e. i) to be used to represent multiple variables. 


    }
}
