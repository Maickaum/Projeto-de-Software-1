
public class LivroLivraria {

	public String nome, autor, editora;
	public int datadelançamento;
	public float preço;

	public void Livros(String nomedolivro, String nomedoautor, String editora, int datadelançamento, float preço) {
		this.nome  = nomedolivro;
		this.autor = nomedoautor;
		this.editora = editora;
		this.datadelançamento = datadelançamento;
		this.preço = preço;
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
	  
		public float getPreço(){
		return this.preço;
	  	}
		
		public String getEditora() {
		return this.editora;
	  }
}
