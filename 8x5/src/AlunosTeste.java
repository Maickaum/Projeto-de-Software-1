public class AlunosTeste {
	public static void main(String[] args) {
		
		double notas[] = {70.0, 70.0, 83.0, 70.0};
		Alunos teste = new Alunos("CC", notas);
		
		if(teste.verificaSituacao()) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}