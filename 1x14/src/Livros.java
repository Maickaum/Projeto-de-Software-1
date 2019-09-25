
public class Livros {

	public String nome, autor, editora,contracapa;
	public int datadelançamento;

	public Livros(String nomedolivro, String nomedoautor, String editora, String Contracapa, int datadelançamento) {
		this.nome  = nomedolivro;
		this.autor = nomedoautor;
		this.editora = editora;
		this.contracapa = Contracapa;
		this.datadelançamento = datadelançamento;
	 	}

		public String getNome(){
	    return this.nome;
	  }
		public String getAutor(){
	    return this.autor;
	  }
		public int getdatadelançamento(){
	    return this.datadelançamento;
	  }
	  
		public String getContracapa(){
		return this.contracapa;
	  }
	  
	  	public String getEditora(){
		return this.editora;
	  }
}
