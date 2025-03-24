package entidades;

public class Livro {
	public String livro;
	public String autor;
	public int quantidade;
	public double valor;
	
	//\n  quebra linha 
	
	public String exibeDados () {
		return "Livro: "  + livro +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nValor: " + valor; 
				
				
	}
	
	
	public void emprestaLivro(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "\nLivro: " + livro + 
				"\nAutor: " + autor + 
				"\nQuantidade: " + quantidade + 
				"\nValor: " + valor ;
	}
	
}
