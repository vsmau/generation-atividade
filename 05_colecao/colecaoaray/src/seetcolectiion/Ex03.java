package seetcolectiion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Iniciar as variáveis e objetos
		HashSet<Integer> digitos = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		// Entrada de dados por teclado
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número");
			digitos.add(scanner.nextInt());
		}
		// Saida dos dados via iterator
		Iterator<Integer> idigito = digitos.iterator();
		while (idigito.hasNext()) {
			System.out.println(idigito.next());
		}
		scanner.close();
	}
}