
public class Objeto {

	private int primeiroNumero;
	private int segundoNumero;
	
	public Objeto(int primeiroNumero, int segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}
	public int somaDosProdutos() {
		return this.primeiroNumero + this.segundoNumero;
	}
	
	public int diferencaDosProdutos() {
		return this.primeiroNumero - this.segundoNumero;
	}
	
}

