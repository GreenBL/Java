package prg.es03;
public class TestDado{
    public static void main(String args[]){
        Dado dice1 = new Dado();
        Dado dice2 = new Dado();
        int d1 = 0;
        int d2 = 0;
        int dSum = 0;
        int[] array = new int[11];
        for(int i = 0; i < 100; ++i){
            d1 = dice1.lancia();
            d2 = dice2.lancia();
            dSum = d1 + d2;
            ++array[dSum - 2];
            if(dSum == 12){
                System.out.println("-------->" + "(" + dSum + ")");
            }
            System.out.println(d1 + d2);
        }

        System.out.println("");
        System.out.print("[ ");
        for(int i = 0; i < array.length; ++i){
            System.out.print(array[i] + "(" + (i + 2) + ")" + " ");
        }
        System.out.print("]\n");
    }
}