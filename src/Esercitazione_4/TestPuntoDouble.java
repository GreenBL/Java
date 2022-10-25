package bin.es4;
import java.util.Scanner;

public class TestPuntoDouble{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String infoX = "Inserire coordinata X";
        String infoY = "Inserire coordinata Y";
        double tempX = 0.0;
        double tempY = 0.0;
        // [punto 1]
        System.out.println(infoX + " del punto 1:");
        tempX = scanner.nextDouble();
        System.out.println(infoY + " del punto 1:");
        tempY = scanner.nextDouble();
        PuntoDouble punto1 = new PuntoDouble(tempX, tempY);
        // [punto 2]
        System.out.println(infoX + " del punto 2:");
        tempX = scanner.nextDouble();
        System.out.println(infoY + " del punto 2:");
        tempY = scanner.nextDouble();
        PuntoDouble punto2 = new PuntoDouble(tempX, tempY);
        System.out.println(punto1.toString() +"\n"+punto2.toString());
        System.out.println("Distanza P1, P2 = " + punto1.distance(punto2));
        PuntoDouble puntoM = punto1.middle(punto2);
        System.out.println("Punto medio = " + puntoM.toString());
        System.out.println("P1 e P2 " + (punto1.equals(punto2)? "sono" : "non sono") + " uguali");
    }
}