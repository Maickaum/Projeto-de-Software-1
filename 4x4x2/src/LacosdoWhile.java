public class LacosdoWhile {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void imprimirTabela(int n) {
		int i = 1; 
		do {
			int auxiliar = i;
			int j = 1; 
			do {
				if(n != 0) {
					auxiliar = i * j;
					System.out.printf(auxiliar + " ");
					j++;
				}
			} while(j <= i);
			System.out.println();
			i++;
		} while(i <= n); 
	}
}