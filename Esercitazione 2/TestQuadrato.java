public class TestQuadrato{
	public static void main(String args[]){
		Quadrato square = new Quadrato(5);
		//square.lato = 5;
		System.out.println("Perimetro = " + square.perimetro());
		System.out.println("Area = " + square.area());
	}
}