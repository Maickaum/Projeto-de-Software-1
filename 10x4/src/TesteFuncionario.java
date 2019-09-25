public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario A = new Funcionario("Victor","Marques","MC Donalds","20/12/2021","11.111.111-0","123.456.789-12",1500);
		Funcionario B = new Funcionario("Victor","Alicino","Hotel Mabu","20/12/2021","33.333.333-0","789.654.321-21",-520);
		System.out.println(A.calculaGanhoAnual());
		System.out.println(B.calculaGanhoAnual());
		A.recebeAumento((float) 0.1);
		B.recebeAumento((float) 0.1);
		System.out.println(A.calculaGanhoAnual());
		System.out.println(B.calculaGanhoAnual());
		
	}
}
