public class PassaroTeste {
	public static void main(String[] args) {
		Passaros teste = new Passaros("Papagaio", 50.0, 31, 120);
		Passaros teste2 = new Passaros("Cacatua", 800, 12, 30);
		teste.quantidadeTotal();
		teste.valorTotal();
		teste.maisAntigo();
	}
}
