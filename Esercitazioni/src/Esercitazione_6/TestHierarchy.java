package bin.es6;

public class TestHierarchy{
    public static void main(String[] args){
        Shape a = new Shape();
        Square b = new Square();
        Rectangle c = new Rectangle();
        Circle d = new Circle();

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

    }
}