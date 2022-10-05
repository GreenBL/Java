public class Punto{
    // metodo costruttore
    public Punto(int a, int b){    
        x = a;
        y = b;
    }
    public int x;
    public int y;
    public void print_point(){
        System.out.println("( " + x + " , " + y + " )");
    }
}