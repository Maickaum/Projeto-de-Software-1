
public class SomaNaturais {
	
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int somaDosNaturaisImpares() {
		int soma = 0;
		for(int i = 1; i <= this.numero; i++) {
			if(i % 2 == 0) {
			} else {
				soma += i;
			}
		}
		return soma;
	}
}
