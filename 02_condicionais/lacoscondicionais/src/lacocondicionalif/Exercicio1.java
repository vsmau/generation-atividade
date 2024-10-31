/*Exercicio 1 Lista Java 5 Laços Condicionais
Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima 
na tela se a soma de A + B é maior, menor ou igual a C.
 */

package lacocondicionalif;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Declaração de variáveis
		int num1, num2, num3;
		Scanner leitor = new Scanner(System.in);

		//Entrada dos numeros
		System.out.println("Digite o número A: ");
		num1 = leitor.nextInt();
		
		System.out.println("\nDigite o número B: ");
		num2 = leitor.nextInt();
		
		System.out.println("\nDigite o número C: ");
		num3 = leitor.nextInt();

		//Saida
		if((num1+num2)>num3){
			System.out.printf("\n%d + %d = %d > %d\nA Soma de A + B é Maior do que C",num1,num2,num1+num2,num3);
		}else if((num1+num2)==num3){
			System.out.printf("\n%d + %d = %d = %d\nA Soma de A + B é Igual a C",num1,num2,num1+num2,num3);
		}else {
			System.out.printf("\n%d + %d = %d < %d\nA Soma de A + B é Menor do que C",num1,num2,num1+num2,num3);}

		leitor.close();
	}

}
