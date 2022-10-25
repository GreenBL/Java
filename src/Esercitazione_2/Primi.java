package bin.es2;

public class Primi{
	public static void main(String args[]){
		NumeroIntero num = new NumeroIntero();
		for (num.numeroIntero = 2; num.numeroIntero < 100; num.numeroIntero++){ 
			if (num.isPrime()){
				System.out.println(num.numeroIntero);
			}
		}
	}
}