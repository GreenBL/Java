package bin.es11;
import bin.util.LoadingBar;
import bin.util.ScreenClearer;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestCrivello {
    public static void main(String[] args) {
        LoadingBar.load("Crivello di Eratostene - v0.1");
        System.out.println("Crivello di Eratostene\n");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Inserisci n: ");
            try {
                switch(n = scanner.nextInt()) {
                    case -1:
                        return;

                    default:
                        Crivello.printPrimes(n);
                }
            } catch (InputMismatchException e) {
                System.out.println("Only integers are supported.");
                scanner.nextLine();
            }
            System.out.println();
        } while(true);
        
    }
}