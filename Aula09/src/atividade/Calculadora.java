package atividade;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Calculadora {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;
 
        while (!sucesso) {
            try {
                System.out.print("Digite o numerador (inteiro): ");
                int numerador = scanner.nextInt();
 
                System.out.print("Digite o denominador (inteiro): ");
                int denominador = scanner.nextInt();
 
                int resultado = numerador / denominador;
                System.out.println("Resultado da divisão: " + resultado);
                sucesso = true;
 
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.");
                scanner.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        }
 
        scanner.close();
    }
}
