/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador 
 * e se é a primeira doação (boolean). De acordo com as Regras para a doação, 
 * mostre na tela se o doador está Apto ou Não Apto para doar sangue. 
 */

package lacocondicionalif;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Declarar variáveis
		String nome;
		int idade;
		boolean primeiradoacao;
		Scanner leitor = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite o Nome do doador: ");
		nome = leitor.nextLine();

		System.out.println("Digite a Idade do doador: ");
		idade = leitor.nextInt();

		System.out.println("Primeira doação de sangue?: ");
		primeiradoacao = leitor.nextBoolean();

		if (18 <= idade && idade <= 69) {
			if (idade >= 60 && primeiradoacao == true) {
				System.out.printf("\n%s não está apto(a) para doar sangue!",nome);
			} else {
				System.out.printf("\n%s está apto(a) para doar sangue!",nome);
			}

		} else {
			System.out.printf("\n%s não está apto(a) para doar sangue!",nome);
		}

		leitor.close();
	}

}
