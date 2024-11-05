package pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		// Iniciar variáveis globais
		int digito;
		Stack<String> fila = new Stack<String>();

		// Loop com Menu de fila
		do {
			System.out.println("*********************************************");
			System.out.println("" + "\t1 - Adicionar Livro na pilha" + "\n\t2 - Listar todos os Livros"
					+ "\n\t3 - Retirar Livro da Fila" + "\n\t0 - Sair ");
			System.out.println("*********************************************");
			System.out.println("\tENTRE COM A OPÇÃO DESEJADA: ");

			// Leitura do usuário pelo teclado
			Scanner scanner = new Scanner(System.in);
			digito = scanner.nextInt();
			scanner.skip("\\R?");

			// Analisa e toma decisão de acordo com o valor digitado pelo usuário
			switch (digito) {
			case 1:
				System.out.println("\tDigite o nome: ");
				fila.push(scanner.nextLine());
				System.out.println(fila + " \nLivro Adicionado!");
				break;
			case 2:
				System.out.println(fila);
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("Pilha está vazia");
				} else {
					fila.pop();
					System.out.println(fila + " \nO Livro foi retirado da pilha!");
				}
				break;

			case 0:
				digito = 0;
				System.out.println("Programa finalizado!");
				scanner.close();
				break;
			}
		} while (digito != 0);

	}

}
