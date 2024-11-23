package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Iniciar variáveis globais
		int digito;
		Queue<String> fila = new LinkedList<String>();

		// Loop com Menu de fila
		do {
			System.out.println("*********************************************");
			System.out.println("" + "\t1 - Adicionar Cliente na Fila" + "\n\t2 - Listar todos os clientes"
					+ "\n\t3 - Retirar Cliente da Fila" + "\n\t0 - Sair ");
			System.out.println("*********************************************");
			System.out.println("\tENTRE COM A OPÇÃO DESEJADA: ");

			// Leitura do usuário pelo teclado
			Scanner scanner = new Scanner(System.in);
			digito = scanner.nextInt();
			scanner.skip("\\R?");

			// Analisa e toma decisão de acordo com o valor digitado pelo usuário
			switch (digito) {
			case 1:
				System.out.println("\tDigite um nome: ");
				fila.add(scanner.nextLine());
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				System.out.println("\n Cliente Adicionado!");
				break;
			case 2:
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\n Não tem clientes na fila");
				} else {
					fila.remove();
					for (String cliente : fila) {
						System.out.println(cliente);
					}
					System.out.println("\n O cliente foi chamado!");
				}
				break;
			case 0:
				digito = 0;
				System.out.println("\n Programa finalizado!");
				scanner.close();
				break;
			}
		} while (digito != 0);

	}

}
