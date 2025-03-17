package poo;



public class ContaMesEstruturada {

	public static void main(String[] args) {
		
		double janAlim, janEnergia, janAgua, fevAlim, fevEnergia, fevAgua;
		
		//gastos janeiro
		janAlim = 1000;
		janEnergia = 300;
		janAgua = 300;
		
		//gastos fevereiro
		fevAlim = 1500;
		fevEnergia= 500;
		fevAgua= 500;
		
		//total de gastos e ambos os meses
		double gastoJan = janAgua + janAlim + janEnergia;
		double gastoFev = fevAgua + fevAlim + fevEnergia;
		
		
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
