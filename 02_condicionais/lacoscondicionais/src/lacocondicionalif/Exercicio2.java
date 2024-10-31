/*
Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela
uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.
 */

package lacocondicionalif;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Declarar
		int num;
		Scanner leitor = new Scanner(System.in);

		//Ler o número
		System.out.println("Digite um número: ");
		num = leitor.nextInt();

		//Printar o resultado, eu adicionei um primeiro if é para ver se é 0 hehe
		if(num!=0) {
			if(num > 0) {
				if(num % 2 == 0) {
					System.out.printf("\nO Número %d é par e positivo!",num);
				}else {
					System.out.printf("\nO Número %d é impar e positivo!",num);
				}
			}else {
				if(num % 2 == 0) {
					System.out.printf("O Número %d é par e negativo!",num);
				}else {
					System.out.printf("O Número %d é impar e negativo!",num);
				}
			}
		}else {
			System.out.printf("O Número é 0, nem positivo, nem negativo e nem par '^-^",num);
		}

		leitor.close();
	}

}
