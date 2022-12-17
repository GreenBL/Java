package bin.es10;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestPunto{
    public static void main(String args[]){
        String info = "Inserire due numeri separati da spazio e premere INVIO:";
        Scanner scanner = new Scanner(System.in);

        System.out.println(info);
        try {
            Punto firstPoint = new Punto(scanner.nextDouble(), scanner.nextDouble());
            System.out.println(firstPoint.toString());
            System.out.println(info);
            Punto secPoint = new Punto(scanner.nextDouble(), scanner.nextDouble());
            System.out.println(secPoint.toString());    
            System.out.println("Distanza = " + firstPoint.distance(secPoint));
            Punto medPoint = firstPoint.middle(secPoint);
            System.out.println(medPoint.toString() + " - punto medio tra p1 e p2");
            System.out.println("Punto 1 e Punto 2 " + (firstPoint.equals(secPoint) ? "sono" : "non sono") + " uguali");
        }
        catch (InputMismatchException e) {
            System.out.println("I asked you for a double not a string!");
            //e.printStackTrace();
            System.out.println("execution stopped at " + (System.currentTimeMillis() / 1000) / 60 + "minutes");
        }
    }
}