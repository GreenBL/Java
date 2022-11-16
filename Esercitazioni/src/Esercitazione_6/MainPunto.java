package bin.es6;

public class MainPunto{
    public static void main(String args[]){
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D(3, 5);

    System.out.println(p1.toString());
    System.out.println(p2.toString());

    Line retta = new Line(p1, p2);
    System.out.println(retta.toString());


    }
}