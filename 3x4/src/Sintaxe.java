import java.util.Scanner;
public class Sintaxe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;
		do {
				
			System.out.println("\n1 - Exercício 4.2.1");
			System.out.println("2 - Exercício 4.2.2");
			System.out.println("3 - Exercício 4.2.3");
			System.out.println("4 - Exercício 4.2.4");
			System.out.println("5 - Exercício 4.2.5");
			System.out.println("6 - Exercício 4.2.6");
			System.out.println("7 - Exercício 4.2.7");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					System.out.println("Exercício 4.2.1");
					for(int i = 150; i <= 300; i++) {
						System.out.println(i);
					}
					break;
				case 2:
					System.out.println("Exercício 4.2.2");
					int i = 1;
					int soma = 0;
					while(i <= 1000) {
						soma += i;
						i++;
					}
					System.out.println(soma);
					break;
				case 3:
					System.out.println("Exercício 4.2.3");
					for(i = 1000; i <= 1200; i ++) {
						if(i % 3 == 0) {
							System.out.println(i);
						}
					}
					break;
				case 4:
					System.out.println("Exercício 4.2.4");
					i = 1000;
					while(i <= 1200) {
						if(i % 3 == 0) {
							System.out.println(i);
						}
						i++;
					}
					break;
				case 5:
					System.out.println("Exercício 4.2.5");
					i = 1000;
					do {
						if(i % 3 == 0) {
							System.out.println(i);
						}
						i++;
					} while(i <= 1200);
					break;
				case 6:
					int fatorial = 1;
					for(i = 1; i <= 10; i++) {
						fatorial *= i;
						System.out.println("Fatorial de " + i);
						System.out.println(fatorial);
					}
					break;
				case 7:
					int atual = 0, antigo = 1, novo = 0;
					System.out.println(novo);
					while(novo < 100) {
						novo = atual + antigo;
						antigo = atual;
						atual = novo;
						System.out.println(novo);
					}
					break;
			}
		} while(escolha != 0);
	}
}
