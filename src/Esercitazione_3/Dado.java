package bin.es3;

public class Dado{
    public int lancia(){
        //System.out.println("debug " + Math.random() * 5 + 1);
        return 1 + (int) (Math.random() * 6);
    }
}