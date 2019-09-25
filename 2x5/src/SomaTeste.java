import java.util.Scanner;
public class SomaTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros a serem somados:");
		int numero = sc.nextInt();
		SomaNaturais teste = new SomaNaturais();
		teste.setNumero(numero);
		int soma = teste.somaDosNaturaisImpares();
		System.out.println(soma);
	}
}
