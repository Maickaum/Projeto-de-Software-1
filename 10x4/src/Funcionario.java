public class Funcionario {
	private String nome;
	private String sobrenome;
	private String trabalho;
	private String dataEntrada;
	private String RG;
	private String CPF;
	private float salario;
	
	public Funcionario(String nome,String sobrenome,String trabalho,String dataEntrada,String RG,String CPF,float salario) {
		setNome(nome);
		setSobrenome(sobrenome);
		setTrabalho(trabalho);
		setDataEntrada(dataEntrada);
		setRG(RG);
		setCPF(CPF);
		setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if(salario < 0)
			salario=0;
		this.salario = salario;
	}
	
	public String toString(String string) {
		return string;		
	}
	
	public void recebeAumento(float aumento) {
		this.salario *= 1+aumento;
	}
	public float calculaGanhoAnual() {
		return this.salario*13;
	}
	
}