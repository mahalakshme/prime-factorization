package com.tw.obc;

import java.util.ArrayList;

class PrimeFactors
{
    ArrayList<Integer> primeFactors;
    int no;

    public PrimeFactors(int no)
    {
        primeFactors = new ArrayList<Integer>();
        this.no = no;
    }

    private boolean isPrime(int no)
    {
        if(no == 1)
        {
            return false;
        }

       for(int i = 2; i < no/2 ; i++)
       {
           if(no % i == 0)
               return false;
       }

        return true;
    }

    public ArrayList generate()
    {
       for(int i = 1; i <= no; i++)
       {
           if((no % i == 0) && (isPrime(i)))
           {
              primeFactors.add(i);
           }
       }

        return primeFactors;
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        PrimeFactors sample = new PrimeFactors(10);
        primeFactors = sample.generate();

        for (Integer primeFactor : primeFactors) {
            System.out.println(primeFactor);
        }
    }
}
