package bin.es6;

public class Point2D {

    private double x;
    private double y;

    public Point2D() {
        this(0,0);
    }

    public Point2D(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object other){
        Point2D a = (Point2D)other;
        return (this.getX() == a.getX()) && (this.getY() == a.getY());
    }

    public String toString() {
        return "(< " + this.getX() + " >," + "< "+ this.getY() + " >)"; 
    }
}