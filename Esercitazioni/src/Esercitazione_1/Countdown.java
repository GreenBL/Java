package bin.es1;

public class Countdown{
    public static void main(String args[]){

        for(int i = 10; i > 0; --i){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}