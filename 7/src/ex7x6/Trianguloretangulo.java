package ex7x6;

public class TrianguloRetangulo extends FormaGeometrica {
	private Ponto2D a;
	private Ponto2D b;
	private Ponto2D c;

	public TrianguloRetangulo(Ponto2D a, Ponto2D b, Ponto2D c) {
		super();
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
		this.c = new Ponto2D(c.getX(), c.getY());
	}

	public TrianguloRetangulo() {
		this.a = new Ponto2D();
		this.b = new Ponto2D();
		this.c = new Ponto2D();
	}

	public Ponto2D getA() {
		return new Ponto2D(a.getX(), a.getY());
	}

	public void setA(Ponto2D a) {
		this.a = new Ponto2D(a.getX(), a.getY());
	}

	public Ponto2D getB() {
		return new Ponto2D(b.getX(), b.getY());
	}

	public void setB(Ponto2D b) {
		this.b = new Ponto2D(b.getX(), b.getY());
	}

	public Ponto2D getC() {
		return new Ponto2D(c.getX(), c.getY());
	}

	public void setC(Ponto2D c) {
		this.b = new Ponto2D(c.getX(), c.getY());
	}

	public Ponto2D centro() {
		return new Ponto2D((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
	}

	@Override
	public String toString() {
		return "{" + a + "; " + b + ";" + c + "}";
	}
	public float distancia(Ponto2D p, Ponto2D l) {
		return (float) Math.sqrt( (p.getX()-l.getX())*(p.getX()-l.getX()) + 
				(p.getY()-l.getY())*(p.getY()-l.getY()));
	}

	@Override
	public float perimetro() {
		return altura() + largura() + distancia(c,b) ;
	}

	@Override
	public float area() {
		return (altura() * largura())/2;
	}

	@Override
	public float largura() {
		return distancia(a,b);
	}

	@Override
	public float altura() {
		return distancia(a,c);
	}

}