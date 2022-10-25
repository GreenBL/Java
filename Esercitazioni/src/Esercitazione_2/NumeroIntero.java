package bin.es2;

public class NumeroIntero {
	public int numeroIntero;
	NumeroIntero(){
	}
	NumeroIntero(int a){
		numeroIntero = a;
		System.out.println("Numero inizializzato a " + a);
	}
	
	public void stampaNumero() {
		System.out.println(numeroIntero);
	}

	public boolean isPrime(){
		for(int i = 2; i <= numeroIntero / 2; i++){
			if(numeroIntero % i == 0){
				return false;
			}
		}
		return true;
	}
}