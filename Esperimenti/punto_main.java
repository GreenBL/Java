public class punto_main{
    public static void main(String args[]){
        Punto p1;
        p1 = new Punto(1, 2);
        Punto p2, p3, p4;
        p2 = new Punto(3, 4);
        p3 = new Punto(5, 6);
        p4 = new Punto(7, 8);

        p1.print_point();
        p2.print_point();        
        p3.print_point();
        p4.print_point();            
    }
}