// Presupponendo che nella stessa directory ci sia "NumeroIntero.class"
public class Primi{
	public static void main(String args[]){
		NumeroIntero num = new NumeroIntero();
		for (num.numeroIntero = 2; num.numeroIntero < 100; num.numeroIntero++){ 
			if (num.èPrimo()){
				System.out.println(num.numeroIntero);
			}
		}
	}
}