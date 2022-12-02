package bin.es9;
import java.util.Scanner;

public class TestComplex{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        Complex c1 = new Complex(scan.nextDouble(), scan.nextDouble());
        Complex c2 = new Complex(scan.nextDouble(), scan.nextDouble());

        System.out.println(c1);
        System.out.println(c2);

        Complex c3 = c1.somma(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Complex c4 = c1.sottrai(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("distanza = " + c1.distance(c2));
        System.out.println("equals : " + c1.equals(c2));

    }
}