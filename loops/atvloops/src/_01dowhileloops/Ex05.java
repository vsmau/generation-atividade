/*Escreva um algoritmo em Java, que leia números inteiros
 *via teclado, até que o número zero seja digitado. 
 *Ao final, mostre na tela a soma de todos os números 
 *digitados, que sejam positivos.
 * */

package _01dowhileloops;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int num, soma = 0;
		// Entrada e saida de dados e loop
		do {
			System.out.println("Digite um número: ");
			num = leitor.nextInt();
			if (num > 0) {
				soma += num;
			}
		} while (num != 0);
		// Saida da soma
		System.out.println("A soma dos números positivos é: " + soma);

		leitor.close();
	}

}
