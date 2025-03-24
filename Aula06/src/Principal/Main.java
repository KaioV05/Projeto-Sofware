package Principal;

import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		Livro harry = new Livro();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe os dados do livro:");
		
		System.out.print("Livro: ");
		harry.livro = sc.nextLine();
		
		System.out.print("Autor: ");
		harry.autor = sc.nextLine();
		
		System.out.print("Quantidade: ");
		harry.quantidade = sc.nextInt();
		
		System.out.print("Valor: ");
		harry.valor = sc.nextDouble();
		
		harry.emprestaLivro(7);
	
		
		System.out.println(harry.toString());
		
	
		sc.close();
		
		
		

	}

}
