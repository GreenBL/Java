package bin.es4;
import java.util.Scanner;
import java.util.ArrayList;

public class Moderatore{  
    public static void main(String args[]){ 
        Scanner scanner = new Scanner(System.in);  
        String stringa = "";
        ArrayList<String> listaCensura = new ArrayList<>();
        listaCensura.add("alfa");
        listaCensura.add("beta");
        listaCensura.add("gamma");
        listaCensura.add("delta");
        listaCensura.add("epsilon");
        listaCensura.add("kappa");
        listaCensura.add("lambda");
        listaCensura.add("sigma");
        listaCensura.add("omega");

        System.out.println("Digita qualcosa e batti enter, oppure " + "scrivi \"fine\" per terminare il programma");  

        while(!(stringa = scanner.next()).equals("fine")){
            if(!((listaCensura.contains(stringa)) || !(listaCensura.contains(stringa.toUpperCase())))){
                System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            }
        }  
        System.out.println("Fine programma!"); 
    } 
}