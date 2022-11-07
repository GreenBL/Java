package bin.es6;
import java.util.Scanner;

public class Input{

    // design pattern singleton
    private static Input instance;
    private Scanner input;
    private String buffer;
    private int intBuffer;
    private Input(){
        input = new Scanner(System.in);
    }
    public static Input getInstance(){
        if (instance == null){
            instance = new Input();
        }
            return instance;
    }

    public String next(String type){
        if(type.equals("name")){
            System.out.print("\nInserisci un nome: ");
            buffer = input.next();
            input.nextLine();
            return buffer;
        }
        if(type.equals("surname")){
            System.out.print("\nInserisci un cognome: ");
            buffer = input.next();
            input.nextLine();
            return buffer;
        }
        return null;
    }

    public int nextNumber(int lowerB, int upperB){
        System.out.print("\nInserisci un eta': ");
        if(input.hasNextInt()){
            intBuffer = input.nextInt();
            if(intBuffer > lowerB && intBuffer < upperB){
                input.nextLine();
                return intBuffer;
            }
        }
        System.out.println("Errore, eta' impostata a 0.");
        input.nextLine();
        return 0;
    }

    public String nextChoice(){
        System.out.print("\nInserisci scelta : ");
        buffer = input.next();
        input.nextLine();
        return buffer;
    }
}