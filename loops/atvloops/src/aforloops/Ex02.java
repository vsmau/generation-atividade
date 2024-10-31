/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado 
 *e mostre na tela quantos números são pares e quantos número são ímpares.
 * */
package aforloops;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Declaração de variáveis e do leitor
		Scanner scanner = new Scanner(System.in);
		int pares = 0, impares = 0;

		// Loop e entrada de dados via teclado
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o " + cont + "° numero: ");
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		// Imprime os resultados da contagem de números impares e pares
		System.out.println("Total de números par: " + pares);
		System.out.println("Total de números impares: " + impares);
		scanner.close();
	}
}