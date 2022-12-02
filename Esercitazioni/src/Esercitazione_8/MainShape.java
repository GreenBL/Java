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
    }
}