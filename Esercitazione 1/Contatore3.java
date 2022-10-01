public class Contatore3{
    public static void main(String args[]){
        for(int i = args.length - 1; i >= 0 ; --i){
            if((i + 1) % 2 == 0){
                continue;
            }
            System.out.print(args[i] + " ");
        }
    }
}