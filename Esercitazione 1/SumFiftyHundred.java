public class SumFiftyHundred{
    public static void main(String[] args){
        int sum = 0;
        for(int counter = 50; counter <= 100; ++counter){
            sum += counter;
            // info sul funzionamento
//            System.out.print(counter);
//           System.out.println("");
//            if(counter != 100){
//                System.out.print("+ ");
//            }

        }
        System.out.print("La somma dei numeri da 50 a 100 è: ");
        System.out.println(sum);
    }
}