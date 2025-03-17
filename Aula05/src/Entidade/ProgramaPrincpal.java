package Entidade;

public class ProgramaPrincpal {

	public static void main(String[] args) {
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EUB-6530";
		civic.ano = 2022;
		civic.cor = "Preto";
		civic.acelera();
		civic.exibirInfo();
		
		
		Carro kicks = new Carro();
		kicks.fabricante = "Nissan";
		kicks.modelo = "Kicks SV";
		kicks.placa = "KLF-6830";
		kicks.ano = 2023;
		kicks.cor = "Prata";
		kicks.acelera();
		kicks.exibirInfo();
		
		
		Carro corolla = new Carro();
		corolla.fabricante = "Toyota";
		corolla.modelo = "Corolla";
		corolla.placa = "ABC-1234";
		corolla.ano = 2015;
		corolla.cor = "Vermelho";
		corolla.acelera();
		corolla.exibirInfo();
		
		

	}

}
