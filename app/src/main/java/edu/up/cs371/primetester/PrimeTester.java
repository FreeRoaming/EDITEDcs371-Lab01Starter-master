package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n)
    {
        boolean returning = false;
        // for now, return a random result
        if (n == 0 | n == 1)
        {
            returning =  false;
        }
        else if (n == 2)
        {
            returning =  true;
        }
        else
        {
                if(n%2 == 0)
                {
                    returning =  false;
                }
                else if (n%3 == 0 & n != 3)
                {
                    returning = false;
                }
                else if (n%4 == 0 & n != 4)
                {
                    returning = false;
                }
                else if (n%5 == 0 & n != 5)
                {
                    returning = false;
                }
                else if (n%6 == 0 & n != 6)
                {
                    returning = false;
                }
                else if (n%7 == 0 & n != 7)
                {
                    returning = false;
                }
                else if (n%8 == 0 & n != 8)
                {
                    returning = false;
                }
                else if (n%9 == 0 & n != 9)
                {
                    returning = false;
                }
                else
                {
                    returning =  true;
                }

        }
        return returning;
    }
}
