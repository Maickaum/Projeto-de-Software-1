import java.util.Scanner;
public class TesteTriangulo {
	private static Scanner entrada;

	public static void main(String[] args) {
		int a,b,c;
		entrada = new Scanner(System.in);
		Triangulo teste = new Triangulo(); 
		
		System.out.println("Entre com o 1 lado");
		a = entrada.nextInt();
		System.out.println("Entre com o 2 lado");
		b = entrada.nextInt();
		System.out.println("Entre com o 3 lado");
		c = entrada.nextInt();
		
		System.out.println(teste.classificatriangulo(a, b, c));
		
		
		
	}
}
