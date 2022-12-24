package bin.es11;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;

public class Crivello {
    private static Collection<Integer> primeSet = new TreeSet<>();
    private static Collection<Integer> notPrimes = new TreeSet<>();

    public static void printPrimes(int n){
        try {
            buildSetOfPrimes(n);
            Iterator iter = primeSet.iterator();
            while(iter.hasNext()) {
                System.out.println("> " + iter.next());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        primeSet.clear();
        notPrimes.clear();
    }

    private static void buildSetOfPrimes(int n) throws Exception {
        if(n < 0) {
            throw new NegativeNumberException(n);
        }
        if(!(n > 2)) {
            throw new PrimeNumberException(n);
        }
        primeSet.add(2);
        for(int i = 2; i <= n; i++) {
            primeSet.add(i);
        }
        int temp = 0;
        Iterator<Integer> it = primeSet.iterator();
        while(it.hasNext()) {
            temp = it.next();
            for(int i = 2; i <= n/2; ++i) {
                if(temp % i == 0 && temp != i) {
                    notPrimes.add(temp);
                }
            }
        }
        primeSet.removeAll(notPrimes);
    }

}

class PrimeNumberException extends Exception {
    public PrimeNumberException(int debug){
        super("can't calculate prime numbers in this range: 0-" + debug);
    }
}
class NegativeNumberException extends Exception {
    public NegativeNumberException(int debug) {
        super("can't have negative numbers for input: inserted " + debug);
    }
}