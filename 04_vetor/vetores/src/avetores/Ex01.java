/*
 * Dado um vetor contendo 10 números inteiros não ordenados e 
 *não repetidos, construa um algoritmo que consiga pesquisar 
 *dados no vetor, onde o usuário irá digitar um número e o 
 *programa deve exibir na tela a posição deste número no vetor. 
 *Caso o número não seja encontrado, a mensagem:
 * “Não foi encontrado!” deve ser exibida na tela.
 * */

package avetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Iniciar as variáveis e o scanner
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num;
		boolean achou = false;

		// Leitura dos dados
		System.out.println("Digite o número que você deseja encontrar: ");
		num = scanner.nextInt();

		// Laço para verificar se o número está no vetor e printar se achar
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] == num) {
				System.out.println("O número " + num + " está localizado na posição: " + i);
				achou = true;
				break;
			}
		}
		
		//Condicional se não encontrar e printar o resultado
		if (achou == false) {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}
}