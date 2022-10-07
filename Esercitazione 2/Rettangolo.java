public class Rettangolo{
	public int base;
	public int altezza;
	Rettangolo(int b, int h){
		base = b;
		altezza = h;
	}
	public int perimetro(){
		return (2*base) + (2*altezza);
	}
	public int area(){
		return base * altezza;
	}
}