
public class Pessoa {
	public int idade,RG,CPF;
	public String nome;

	void fazaniversario() {
	int maisum = this.idade+1;
	this.idade = maisum;
	  }
	void mostraapessoa() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Idade atual "+this.idade);
	 }
}
