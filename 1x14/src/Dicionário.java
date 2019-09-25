
public class Dicionário {
	public String nome, autor, editora;
	public int datadelançamento;

	public void Livros(String nomedodicionario, String nomedoautor, String editora, int datadelançamento){
		this.nome  = nomedodicionario;
		this.autor = nomedoautor;
		this.editora = editora;
		this.datadelançamento = datadelançamento;
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

}
