package bin.es7;

public class Videoteca{
    public static void main(String args[]){
        AbbonatoPremium marco = new AbbonatoPremium("Marco", "Spiti", 21, 0);
        System.out.println("compra debug : " + marco.acquista(500));
    }
}