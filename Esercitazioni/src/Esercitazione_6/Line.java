package bin.es6;

public class Line {

    private Point2D p1;
    private Point2D p2;

    public Line(){
        this(0, 0, 1, 1);
    }
    public Line(Point2D a, Point2D b) {
        this(a.getX(), a.getY(), b.getX(), b.getY());
    }

    public Line(double x1, double y1, double x2, double y2){
       // p1 = new Point2D(x1, y1);
        this.setP1(x1, y1);
        this.setP2(x2, y2);
        p2 = new Point2D(x2, y2);
    }

    public Point2D getP1(){
        return p1;
    }

    public double getP1x(){
        return (this.p1).getX();
    }

    public void setP1(Point2D newPoint){
        this.p1 = new Point2D(newPoint.getX(), newPoint.getY());
    }

    public void setP1(double x, double y){
        this.p1 = new Point2D(x, y);
    }

    public void setP2(double x, double y){
        this.p2 = new Point2D(x, y);
    }

    // mancano setter e getter per P2 ma sono identici a livello di implementazione
    
    public String toString(){
        return "line going from " + p1.toString() + " to " + p2.toString();
    }

    
    
}