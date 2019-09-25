
public class Triangulo {
	public	int a;
	public  int b;
	public	int c;
	String tipotriangulo;
		
	public String classificatriangulo(int a, int b , int c){
		if(a == b && a == c) {
			tipotriangulo = "Equilatero";
		}else if(a == b ||a == c || b == c) {
			tipotriangulo = "Isosceles";
		}
		else {
			tipotriangulo = "Escaleno";
		}
		return tipotriangulo;
	}
}
