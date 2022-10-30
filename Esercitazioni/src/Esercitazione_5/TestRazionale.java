package bin.es5;
import java.util.Scanner;

public class TestRazionale{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String info = "Inserire due numeri separati da spazio e premere INVIO";

        System.out.println(info);
        Razionale num1 = new Razionale(scanner.nextInt(), scanner.nextInt());
        System.out.println("# " + num1.toString());

        System.out.println(info);
        Razionale num2 = new Razionale(scanner.nextInt(), scanner.nextInt());
        System.out.println("# " + num2.toString() + "\n");
        
        Razionale num3 = num1.somma(num2);
        Razionale num4 = num1.sottrai(num2);
        Razionale num5 = num1.moltiplica(num2);
        Razionale num6 = num1.dividi(num2);

        System.out.println(num1.toString() + " + " + num2.toString() + " = " + num3.toString());
        System.out.println(num1.toString() + " - " + num2.toString() + " = " + num4.toString());
        System.out.println(num1.toString() + " * " + num2.toString() + " = " + num5.toString());
        System.out.println(num1.toString() + " / " + num2.toString() + " = " + num6.toString());

    }
}