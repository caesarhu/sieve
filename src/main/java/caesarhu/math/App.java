package caesarhu.math;

import java.util.Iterator;
import caesarhu.math.sieve;

public class App 
{
    public static void main( String[] args )
    {
        long n = 1000000000;
        long strt = System.currentTimeMillis();
        Iterator<Long> gen = new sieve();
        int count = 0;
        while (gen.next() <= n) count++;
        long elpsd = System.currentTimeMillis() - strt;
        System.out.println("Found " + count + " primes up to " + n + " in " + elpsd + " milliseconds.");
    }
}
