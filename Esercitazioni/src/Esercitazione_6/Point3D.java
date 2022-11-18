package bin.es6;
import bin.es6.Point2D;

public class Point3D extends Point2D {

    private double z;

    public Point3D() {}

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.setZ(z);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        super.setX(x);
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        super.setY(y);
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString() {
        return "(<" + this.getX() + " >,< " + this.y + " >,< " + this.z + " >)";
    }  
}