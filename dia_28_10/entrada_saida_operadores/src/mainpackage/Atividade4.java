// Faria essa atv com array, mas como estamos no início, fiz assim.
package mainpackage;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		float res, num1, num2, num3, num4; //Declaração de variáveis e do scan
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o 1 número: ");
		num1 = leitor.nextFloat();
		
		System.out.println("\nDigite o 2 número: ");
		num2 = leitor.nextFloat();
		
		System.out.println("\nDigite o 3 número: ");
		num3 = leitor.nextFloat();
		
		System.out.println("\nDigite o 4 número: ");
		num4 = leitor.nextFloat();
		
		res = (num1 * num2) - (num3 * num4);
		System.out.println("\nO resultado da difença é: "+res);
		
		leitor.close();
	}

}