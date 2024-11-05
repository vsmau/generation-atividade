/* 
 * 
 * */

package arayex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		Collections.addAll(valores, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		System.out.println("Digite um número: ");
		int digito = scanner.nextInt();
		
		if (valores.contains(digito)) {
			System.out.println("O valor " + digito + " está no índice " + valores.indexOf(digito));
		} else {
			System.out.println("O número " + digito + " não foi encontrado");
		}
		scanner.close();
	}

}
