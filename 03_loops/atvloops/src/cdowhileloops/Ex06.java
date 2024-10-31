/*Escreva um algoritmo em Java, que leia números inteiros via teclado, 
 * até que o número zero seja digitado. Ao final, mostre na tela a 
 * média de todos os números digitados, que sejam múltiplos de 3
 * */

package cdowhileloops;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Iniciar as variáveis e leitor de dados
		Scanner leitor = new Scanner(System.in);
		int num, qtd = 0, soma = 0;

		// Entrada de dados pelo teclado e loop condicional
		do {
			System.out.println("Digite um número: ");
			num = leitor.nextInt();
			if (num % 3 == 0) {
				qtd++;
				soma += num;
			}
		} while (num != 0);

		// Saida da soma dos números divisiveis por 3
		System.out.println("A média de todos os números múltiplos de 3 é: " + soma / qtd);
		leitor.close();
	}
}