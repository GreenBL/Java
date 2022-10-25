package bin.es1;

public class Contatore2{
    public static void main(String args[]){
        for(int i = args.length - 1; i >= 0 ; --i){
            System.out.print(args[i] + " ");
        }
    }
}