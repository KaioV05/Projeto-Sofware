package tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			System.out.println("O número digitado foi " + numero);
			System.out.println("Digite outro valor: ");
			int numero2 = sc.nextInt();
			System.out.println("O número digitado foi " + numero2);
		}catch(InputMismatchException e) {
			System.out.println("Digite um valor do tipo numerico");
		}
		
		System.out.println();
		
		sc.close();
		
	}

}
