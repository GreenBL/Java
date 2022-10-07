public class Operazioni{
	public static void main(String args[]){
		// div (int)
		int r1;
		int a = 5;
		int b = 3;
		r1 = a / b;
		System.out.println("r1 = " + r1);
		// mul (int)
		int r2;
		char c = 'a';
		short s = 5000;
		r2 = s * c;
		System.out.println("r2 = " + r2);		
		// add (float)
		float r3;
		int i = 6;
		float f = 3.14f;
		r3 = i * f;
		System.out.println("r3 = " + r3);		
		// sub r4 = r1 - r2 - r3
		float r4 = r1 - r2 - r3;
		System.out.println("r1 - r2 - r3 = " + r4);
	}
}