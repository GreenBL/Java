package bin.es7;

public class TestRandomizzatore{
    public static void main(String args[]){
        Moneta coin = new Moneta();
        Dado dice = new Dado();
        Dado d20 = new Dado(20);

        coin.lancia();
        System.out.println(coin.toString());
        System.out.println("");
        dice.lancia();
        System.out.println(dice.toString());
        System.out.println("");
        d20.lancia();
        System.out.println(d20.toString());
        System.out.println("");
    }
}