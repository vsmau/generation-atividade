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
				System.out.println(fila + " \nCliente Adicionado!");
				break;
			case 2:
				System.out.println(fila);
				break;
			case 3:
				fila.remove();
				System.out.println(fila + " \nO Cliente foi Chamado!");
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
