
public class LacosWhile {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void imprimirTabela(int n) {
		int i = 1; 
		while(i <= n) {
			int j = 1; 
			int auxiliar = i;
			while(j <= i) {
				auxiliar = i * j;
				System.out.printf(auxiliar + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
