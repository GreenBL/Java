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
}