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

    public Line(Point2D a, double x2, double y2){
        this.setP1(a);
        this.setP2(x2, y2);
    }

    public Point2D getP1(){
        return this.p1;
    }

    public Point2D getP2(){
        return this.p2;
    }

    public double getP1x(){
        return (this.p1).getX();
    }

    public double getP1y(){
        return (this.p1).getY();
    }

    public void setP1(Point2D newPoint){
        this.p1 = new Point2D(newPoint.getX(), newPoint.getY());
    }

    public void setP1x(double x){
        this.p1 = new Point2D(x, this.getP1y());
    }

    public void setP1y(double y){
        this.p1 = new Point2D(this.getP1x(), y);
    }

    public void setP1(double x, double y){
        this.p1 = new Point2D(x, y);
    }

    public void setP2(Point2D newPoint){
        this.p2 = new Point2D(newPoint.getX(), newPoint.getY());
    }

    public void setP2x(double x){
        this.p2 = new Point2D(x, this.getP2y());
    }

    public void setP2y(double y){
        this.p2 = new Point2D(this.getP2x(), y);
    }

    public void setP2(double x, double y){
        this.p1 = new Point2D(x, y);
    }

    public double getP2x(){
        return (this.p2).getX();
    }

    public double getP2y(){
        return (this.p2).getY();
    }

    public boolean equals(Object line){
        Line retta = (Line)line;
        return (this.p1).equals(retta.getP1()) && (this.p2).equals(retta.getP2());
    }
    public String toString(){
        return "line going from " + p1.toString() + " to " + p2.toString();
    }

    
    
}