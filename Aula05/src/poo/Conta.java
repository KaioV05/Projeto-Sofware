package poo;

public class Conta {
	
	//atributos
	double alimentacao;
	double agua;
	double luz;
	
	//metodos
	public double somaConta() {
		double gastoMes = alimentacao + luz + agua;
		return gastoMes;
	}
	
	

}
