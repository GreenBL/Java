public class Quadrato{
	public int lato;
	Quadrato(int a){
		lato = a;
	}
	public int perimetro(){
		return lato * 4;
	}
	public int area(){
		return lato * lato;
	}
}