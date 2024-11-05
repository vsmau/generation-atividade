package seetcolectiion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<>();
		Collections.addAll(num, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int digito = (scanner.nextInt());

		if (num.contains(digito)) {
			System.out.println("Número " + digito + " foi encontrado");
		} else {
			System.out.println("Número " + digito + " não foi encontrado");
		}

		scanner.close();
	}

}
