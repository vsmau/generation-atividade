/* Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
 * onde o primeiro número deve ser menor do que o segundo número. 
 * Caso contrário, deve ser exibida uma mensagem na tela informando que 
 * o intervalo é inválido e sair do programa. No intervalo informado,
 * mostre na tela todes os números que são múltiplos de 3 e 5
 * */

package forloops;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int num1, num2;
		// Entrada de dados
		System.out.println("Digite o primeiro número: ");
		num1 = leitor.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leitor.nextInt();
		// Saida de dados
		if (num1 < num2) {
			for (int i = num1; i < num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo inválido");
		}
		leitor.close();
	}
}
