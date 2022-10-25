package bin.es2;


public class Rettangolo{
	public int base;
	public int altezza;
	Rettangolo(int b, int h){
		base = b;
		altezza = h;
	}
	public int perimetro(){
		return (base + altezza) * 2;
	}
	public int area(){
		return base * altezza;
	}
}