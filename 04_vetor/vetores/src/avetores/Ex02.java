/*
 * Elabore um algoritmo que leia 10 números inteiros e 
 * armazene em um vetor. Em seguida, mostre na tela:
 * 	- Todos os elementos dos índices ímpares do vetor 
 * 	- Todos os elementos do vetor que são números pares
 * 	- A Soma de todos os elementos do vetor
 * 	- A Média de todos os elementos do vetor, armazenada
 * 	  em uma variável do tipo real
 * */

package avetores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Iniciar variáveis e o leitor
		Scanner scanner = new Scanner(System.in);
		int vetorLido[] = new int[10];
		float soma = 0;

		// Entrada dos números pelo teclado e soma 
		for (int i = 0; i < vetorLido.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número de 10: ");
			vetorLido[i] = scanner.nextInt();
			soma += vetorLido[i];
		}

		// Saida dos números em índices impares 
		System.out.println("Elementos nos índices impares: ");
		for (int i = 0; i < vetorLido.length; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", vetorLido[i]);
			}
		}

		// Saida dos Elementos pares 
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < vetorLido.length; i++) {
			if (vetorLido[i] % 2 == 0) {
				System.out.printf("%d ", vetorLido[i]);
			}
		}

		// Saida da soma e média
		System.out.printf("\nSoma: %.0f", soma);
		System.out.println("\nMedia: " + soma / vetorLido.length);

		scanner.close();
	}

}
