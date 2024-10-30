/*Escreva um algoritmo em Java, que leia a idade de várias
 *pessoas (números inteiros), via teclado e mostre na tela
 *o total de pessoas cuja idade seja menor que 21 anos e o 
 *total de pessoas cuja idade seja maior que 50 anos. 
 *A leitura dos dados deve ser finalizada ao digitar uma 
 *idade negativa.
 * */

package whileloops;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Declaração variáveis
		Scanner scanner = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;

		// Loop e entrada de dados
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			if (idade < 21 && idade < 0) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
		}
		// Saida das somas
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50: " + maior);
		scanner.close();
	}
}