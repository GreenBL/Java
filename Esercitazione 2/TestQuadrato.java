public class TestQuadrato{
	public static void main(String args[]){
		Quadrato square = new Quadrato(Integer.parseInt(args[0]));
		//square.lato = 5;
		System.out.println("Perimetro = " + square.perimetro());
		System.out.println("Area = " + square.area());
	}
}