package bin.es2;

public class TestRettangolo{
	public static void main(String args[]){
		Rettangolo rectangle1 = new Rettangolo(7, 3);
		Rettangolo rectangle2 = new Rettangolo(20, 10);
		System.out.println("Perimetro R1(7,3) = " + rectangle1.perimetro() + " cm");
		System.out.println("Perimetro R2(20,10) = " + rectangle2.perimetro() + " cm");
		System.out.println("Area R1(7,3) = " + rectangle1.area() + " cm");
		System.out.println("Area R2(20,10) = " + rectangle2.area() +" cm");
	}
}