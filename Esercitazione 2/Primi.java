public class Primi{
	public static void main(String args[]){
		int divcount = 0;
		for (int i = 2; i < 100; i++){ 
			divcount = 0; 
			for (int j = 2; j <= i / 2; j++){
				if (i % j == 0){ 
					divcount++;;
					break; 
				}
			}
			if (divcount == 0){ 
			System.out.println(i);
			}
		}
	}
}