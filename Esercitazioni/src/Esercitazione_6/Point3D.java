package bin.es6;
import bin.es6.Point2D;

public class Point3D extends Point2D {

    private double z;

    public Point3D(){
        this(0,0,0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.setZ(z);
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

    public boolean equals(Object other){
        Point3D altro = (Point3D)other;
        return (super.equals(altro)) && this.getZ() == altro.getZ();
    }
}