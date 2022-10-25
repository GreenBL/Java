package bin.es1;

public class ContaParola{
    public static void main(String args[]){
        int ciaoCount = 0;
        int size = args.length;
        for(int i = 0; i < size; ++i){
            if(args[i].equals("Ciao")){
                ++ciaoCount;
            }
        }
        System.out.println("Hai inserito " + ciaoCount + " Argomenti uguali alla parola Ciao.");
    }
}