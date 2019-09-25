public class LacosAninhadosFor {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void imprimirTabela(int n) {
		for(int i = 1; i <= n; i++) {
			int auxiliar = i;
			for(int j = 1; j <= i; j++) {
				auxiliar = i * j;
				System.out.printf(auxiliar + " ");
			}
			System.out.println();
		}
	}
}