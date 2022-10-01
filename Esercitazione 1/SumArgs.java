public class SumArgs{
    public static void main(String args[]){
        int sum = 0;
        int size = args.length;
        for(int i = 0; i < size; ++i){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("La somma è: " + sum);
    }
}