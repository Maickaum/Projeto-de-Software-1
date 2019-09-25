
public class Imposto {
	public double salario;
	public double imposto;
	
	public int Recebesalario(double salario) {
	      int porcentagem = 0;
		if(salario <= 2487.00) {
	    	porcentagem = 0;
	     }else if(salario <= 3873.00) {
	    	 porcentagem = 13;
	     }
	     else if(salario <= 4733.00) {
	    	 porcentagem = 17;
	     }
	     else if(salario <= 5827.00) {
	    	 porcentagem = 22;
	     }
	     else if(salario <= 5827.00) {
	    	 porcentagem = 27;
	     }
		return porcentagem;
	     
	}
	
	public double ImpostoAnual(double salario) {
		double imposto = 0;
		if(salario <= 2487.00) {
			imposto = 0;
			
		}else if(salario <= 3873.00) {
			imposto = 0.13 * salario;
	
		}else if(salario <= 4733.00) {
			imposto = 0.17 * salario;
			
		}else if(salario <= 5827.00) {
			imposto = 0.22 * salario;
			
		}else if(salario > 5827.00) {
			imposto = 0.27 * salario;
		}
		
		return imposto * 12;
		
	}
}
