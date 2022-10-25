package bin.es2;


public class TestNumeroIntero{
	public static void main(String args[]){
		NumeroIntero n1 = new NumeroIntero();
		NumeroIntero n2 = new NumeroIntero();
		n1.numeroIntero = 6;
		n2.numeroIntero = 9;
		n1.stampaNumero();
		n2.stampaNumero();
		// Inizializza numero 3 a 7
		NumeroIntero n3 = new NumeroIntero(7);
		// n3.stampaNumero();
		// senza inizializzare
		NumeroIntero n4 = new NumeroIntero();
		n4.stampaNumero(); // = 0
	}
}