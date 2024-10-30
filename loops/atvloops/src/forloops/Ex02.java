/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado 
 *e mostre na tela quantos números são pares e quantos número são ímpares.
 * */
package forloops;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner scanner = new Scanner(System.in);
		int pares = 0, impares = 0;
		// Loop e entrada de dados
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o " + cont + "° numero: ");
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Total de números par: " + pares);
		System.out.println("Total de números impares: " + impares);
		scanner.close();
	}
}