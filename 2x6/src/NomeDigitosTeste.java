import java.util.Scanner;
public class NomeDigitosTeste {
	public static void main(String[] Args) {
		NomeDigitos teste = new NomeDigitos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero de 5 dig�tos:");
		int numero = sc.nextInt();
		teste.setNumero(numero);
		teste.imprimeNumeros();
	}
}
