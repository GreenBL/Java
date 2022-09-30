import java.util.Scanner;
public class Moltiplica{
    public static void main(String args[]){
        System.out.print("\033\143"); // cls
        int input1, input2;
        Scanner input = new Scanner(System.in); // crea classe Scanner "input"
        System.out.println("Moltiplicatore - build 300922");
        System.out.print("Inserisci il primo numero: ");
        input1 = input.nextInt(); // fetch primo int
        System.out.print("Inserisci il secondo numero: ");
        input2 = input.nextInt(); // fetch secondo int
        System.out.print("Risultato = ");
        System.out.println(input1 * input2);
        // il resto del programma è un esperimento inutile che lancia un eccezione stupidissima perché io lo sono
        System.out.println("Premere ENTER per terminare il programma.");
        if(input.nextInt() != 123456){
            System.exit(1);
        }
        else
        {
            System.exit(0);
        }
    }
}