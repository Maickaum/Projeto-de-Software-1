package ex7x6;

public class TesteTrianguloRetangulo {

	public static void main(String[] args) {
		TrianguloRetangulo r2 = new TrianguloRetangulo(new Ponto2D(3, 2), new Ponto2D(7,2), new Ponto2D(3,5));

		System.out.println("Altura : " +r2.altura());
		System.out.println("Largura : " + r2.largura());
		System.out.println("Perimetro : " +r2.perimetro());
		System.out.println("Area : " + r2.area());
		
	}
}
