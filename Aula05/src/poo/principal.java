package poo;

public class principal {

	public static void main(String[] args) {
		Conta janeiro = new Conta();
		Conta fevereiro = new Conta();
		
		
		//gastos janeiro
		janeiro.agua = 300;
		janeiro.alimentacao = 1000;
		janeiro.luz = 300;
		
		//gastos fevereiro
		fevereiro.agua = 300;
		fevereiro.alimentacao = 1200;
		fevereiro.luz = 300;
		
		
		//somar gastos
		double gastoJan = janeiro.somaConta();
		double gastoFev = fevereiro.somaConta();
		
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de janeiro foi maior");
		}
		
		else if (gastoFev> gastoJan) {
			System.out.println("O gasto de fevereiro foi maior");
			
		}
		
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
	}

}
