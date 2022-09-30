# ESERCITAZIONE
## **1.** Aprite il prompt dei comandi di windows e digitate javac -version
## Se il JDK è istallato correttamente dovreste leggere la versione installata e siete pronti per iniziare
## l’esercitazione. Se ricevete un messaggio di errore dovete procedere con l’istallazione, aprite il browser e
## andate a https://www.oracle.com/java/technologies/downloads/
## Scaricate l’installer per Windows di Java 17 (potete scaricare si la versione MSI che EXE) e procedete
## con l’istallazione.
## Aprite nuovamente il prompt dei comandi di windows e digitate javac -version per verificare che
## l’istallazione sia andata a buon fine. A questo punto dovreste essere pronti per iniziare l’esercitazione.

## **2.** Create la cartella Esercitazione1 e al suo interno il file HelloWorld.java, il vostro primo programma:
public class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello World!");
    }
}
## - Andate all’interno della cartella Esercitazione1 utilizzando il comando cd (cd nomecartella vi fa
## spostare dentro la cartella e cd .. vi fa tornare alla cartella precedente) e compilate col comando javac
## HelloWorld.java
## - Se avete copiato bene non riceverete alcun messaggio di errore e potete quindi eseguire il vostro
## programma col comando java HelloWorld
## - Eliminate il modificatore static del metodo main() dalla classe HelloWorld. Compilate il programma,
## provate a eseguire e interpretate il messaggio di errore.
## - Eliminate la prima parentesi graffa aperta incontrata dalla classe HelloWorld. Compilate il programma
## e interpretate il messaggio di errore.
## - Eliminate l’ultima prima parentesi chiusa (ultimo simbolo del programma) dalla classe HelloWorld.
## - Compilate il programma e interpretate il messaggio di errore del programma.
## - Provate a far stampare una stringa a piacere al programma HelloWorld al posto di “Hello World!”.
## - Provate a far stampare un numero al programma HelloWorld al posto della stringa “Hello World!”.
## - Provate a far stampare la somma di due numeri al programma HelloWorld al posto della stringa.

## **3.** Create nella cartella Esercitazione1 il file Moltiplica.java, il vostro secondo programma:
import java.util.Scanner;
public class Moltiplica{
    public static void main(String args[]){
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Moltiplicatore v0.1");
        System.out.print("Inserisci il primo numero: ");
        int input1 = keyboardScanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int input2 = keyboardScanner.nextInt();
        System.out.print("Risultato: ");
        System.out.println(input1 * input2); 
    }
}
## **4.** In Java potete definire variabili intere in modo analogo a quanto fate in C. Potete anche utilizzare le
## strutture di controllo for, while e if utilizzando la stessa sintassi. Tenendo conto di ciò:
## - Usando un ciclo for scrivete un programma che somma i numeri da 50 a 100.
## - Usate l’operatore - - per scrivere un ciclo while che stampa i numeri pari da 10 a 0.
NOTA: potete stampare il contenuto di una variabile con System.out.println(nome_variabile)

## **5.** Utilizzando la proprietà length dell’array di stringhe args del main scrivete un programma “Contatore”
## che stampi il numero di argomenti che l’utente ha inserito a riga di comando. Es. Se l’utente digita
java Contatore ciao prova tre argomenti
## il programma stamperà un messaggio del tipo:
Hai inserito 4 argomenti.
## - Modificare il programma precedente in modo da stampare gli argomenti inseriti dall’utente in
## ordine inverso.
## - Modificare il programma in modo da stampare solo gli argomenti di posto dispari (nell’esempio
## precedente: ciao, tre)

## **6.** In java, è possibile confrontare il valore di due String con il metodo equals.
### Es.:
String s1 = “Ciao”;
String s2 = “Ciao”;
String s3 = “OK”;
s1.equals(s2); // restituisce true
s1.equals(s3); //restituisce false
## Scrivete un programma “ContaParola” che stampi il numero di argomenti che l’utente ha inserito a riga di
## comando che siano uguali alla parola “Ciao”. Es. Se l’utente digita
java Contatore ciao prova tre argomenti Ciao Ciao
## il programma stamperà un messaggio del tipo:
Hai inserito 2 argomenti uguali alla parola Ciao.
## **7.** In Java è possibile trasformare una String in intero attraverso l’istruzione Integer.parseInt()
## Es.:
String numeroString = “5”;
int numeroInt = Integer.parseInt(numeroString);
## Scrivete un programma che stampi la somma degli argomenti che l’utente ha inserito a riga di comando
## supponendo che l’utente digiti esclusivamente numeri interi. Es. Se l’utente digita
java Sommatore 1 2 3 4 5
## il programma stamperà un messaggio del tipo:
La somma è 15
## - Cosa succede se uno degli argomenti non è un intero? Un eccezione.