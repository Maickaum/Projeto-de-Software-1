
public class Fibonacci {
	private int quantos;
	public Fibonacci(int x) {
		setQuantos(x);
		PrintaString();
	}
	public String PrintaString() {
		String fibo = "1 ";
		for(int a=1, b=2, i=0; i<this.quantos-1; b+=a, a=b-a, i++) {
			fibo += (a + " ");
		}
		
		return fibo;		
	}
	public int getQuantos() {
		return quantos;
	}
	public void setQuantos(int quantos) {
		this.quantos = quantos;
	}

}
