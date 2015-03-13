package ronak.com.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by ronak on 08-03-2015.
 */
public class Fibonacci {
    int index;
    int upto_index;
    BigInteger b,a,c;
    ArrayList<BigInteger> bigInteger_numbers = new ArrayList<BigInteger>();
    ArrayList<BigInteger> bigIntegers = new ArrayList<BigInteger>();

    public Fibonacci()
    {
        this.index=1;
        this.upto_index=0;
        a = BigInteger.ZERO;
        b = BigInteger.ONE;
        c = BigInteger.ZERO;
        bigInteger_numbers.add(BigInteger.ONE);
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setUpto_index(int upto_index) {
        this.upto_index = upto_index;
    }

    public String generate_number(int number)
    {
            if(number==1)
                return "1";
            int i=1;
            for(;i<number;i++)
            {
                c = c.add(a);
                c = c.add(b);
                a = b;
                b = c;
                c =BigInteger.ZERO;
                bigInteger_numbers.add(b);
            }
            return b.toString();
    }

    public ArrayList<BigInteger> generate_series(int number)
    {
        bigIntegers.clear();
        bigIntegers.add(BigInteger.ONE);
        int i;
        a = BigInteger.ZERO;
        b = BigInteger.ONE;
        c = BigInteger.ZERO;
        for(i=1;i<number;i++)
        {
            c = c.add(a);
            c = c.add(b);
            a = b;
            b = c;
            c = BigInteger.ZERO;
            bigIntegers.add(b);
        }
        return bigIntegers;
    }

}

