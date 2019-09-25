public class Passaros extends Loja {
	private	String especie;
	private	double valor;
	private	int numeroGaiola;
	private int tempoNaLojaDias;
		
	Passaros(String especie, double valor, int numeroGaiola, int tempoNaLoja){
		this.especie = especie;
		this.valor = valor;
		this.numeroGaiola = numeroGaiola;
		this.tempoNaLojaDias = tempoNaLoja;
		super.quantidadeDePassaros++;
		if(this.tempoNaLojaDias >= super.individuoMaisAntigo) {
			super.individuoMaisAntigo = this.tempoNaLojaDias;
			super.individuiMaisAntigoNome = this.especie;
		}
		super.valorTotalDoEstoque += this.valor;
	}

	public void maisAntigo() {
		System.out.println("Espécie: " + super.individuiMaisAntigoNome);
		System.out.println("Dias: " + super.individuoMaisAntigo);
	}
	
	public void quantidadeTotal() {
		System.out.println("Total de Pássaros: " + super.quantidadeDePassaros);
	}
	
	public void valorTotal() {
		System.out.println("Valor Total do Estoque: " + super.valorTotalDoEstoque);
	}
	
}

