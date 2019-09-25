
public class Alunos {
	public class Alunos extends Pessoa {
		private String curso;
		private double notas[] = new double[4];
		
		
		Alunos(String curso, double notas[]) {
			this.curso = curso;
			this.notas = notas;
		}
		
		public boolean verificaSituacao() {
			int contador = 0;
			for(int i = 0; i < 4; i++) {
				if(this.notas[i] >= 70) {
					contador++;
				}
			}
			if(contador == 4) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}
}
