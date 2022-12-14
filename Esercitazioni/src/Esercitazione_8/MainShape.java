package bin.es8;

public class MainShape{
    public static void main(String args[]){
        Rectangle rettangolo = new Rectangle(12, 6);
        // Shape forma = new Shape();
        
        // src\Esercitazione_8\MainShape.java:6: error: Shape is abstract; cannot be instantiated
        // Shape forma = new Shape();
        //            ^
        // 1 error

        rettangolo.draw();

        rettangolo.scale(0.5);

        System.out.println("");
        rettangolo.draw();

        space();

        Square quadrato = new Square(10.0D, "rosso", true);
        quadrato.draw();
        quadrato.scale(0.5D);
        System.out.println("");
        quadrato.draw();

        space();

        Circle cerchio = new Circle(1.5, "verde", false);
        cerchio.draw();
        cerchio.scale(2);
        System.out.println("");
        cerchio.draw();
        


        Drawable circle = new Circle(90.2, "arancione", true);
        space();
        circle.draw();

        Shape rim = cerchio;
        space();
        System.out.println(rim.getArea());


    }

    private static void space(){
        System.out.println("[]=====================================[]");
    }
}