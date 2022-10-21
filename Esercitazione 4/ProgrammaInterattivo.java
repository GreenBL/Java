import java.util.Scanner; 
public class ProgrammaInterattivo{  
    public static void main(String args[]){ 
        Scanner scanner = new Scanner(System.in);  
        String stringa = "";
        String[] filterArray = {"alfa", "beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega"};     
        System.out.println("Digita qualcosa e batti enter, oppure " + "scrivi \"fine\" per terminare il programma");  

        boolean invalid;
        while(!(stringa = scanner.next()).equals("fine")){
            invalid = false;
            for(int i = 0; i < filterArray.length; ++i){
                if(stringa.equals(filterArray[i]) || stringa.equals(filterArray[i].toUpperCase())){
                    invalid = true;
                    break;
                }
            }
                if(invalid != true){
                    System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
                }
        }  
        System.out.println("Fine programma!"); 
    } 
}