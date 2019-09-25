
public class LivroBiblioteca {

	public String nome, autor, editora;
	public int datadelançamento;
	public int numeraçãodolivro;

	public void Livros(String nomedolivro, String nomedoautor, String editora, int datadelançamento,int numeraçãodolivro){
		this.nome  = nomedolivro;
		this.autor = nomedoautor;
		this.editora = editora;
		this.datadelançamento = datadelançamento;
		this.numeraçãodolivro = numeraçãodolivro;
	 	}
	
		public String getNome(){
	    return this.nome;
		}
	
		public String getAutor(){
	    return this.autor;
	    }
	  
		public int getDatadelançamento(){
	    return this.datadelançamento;
	  	}
	
		public String getEditora() {
		return this.editora;
	  }
		public int getNumeraçãodolivro() {
		return this.numeraçãodolivro;

}
}
