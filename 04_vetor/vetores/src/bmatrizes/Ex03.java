/*
 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
 * Todos os elementos da Diagonal Principal
 * Todos os elementos da Diagonal Secundária
 * A Soma de todos os elementos da Diagonal Principal
 * A Soma de todos os elementos da Diagonal Secundária 
 * */

package bmatrizes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Entrada de dados
		Scanner scanner = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int somaDiagonal = 0;
		int somaSecundaria = 0;
		// Leitura de matriz
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite o número na posição = [" + (linha + 1) + "],[" + (coluna + 1) + "]");
				matriz[linha][coluna] = scanner.nextInt();

			}
		}
		// Elementos da diagonal principal de acordo com o tamanho da matriz
		System.out.println("Elementos da Diagonal Principal: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.printf("%d ", matriz[linha][linha]);
			somaDiagonal += matriz[linha][linha];
		}

		// Elementos da diagonal secundária de acordo com o tamanho da matriz
		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.printf("%d ", matriz[linha][matriz.length - 1 - linha]);
			somaSecundaria += matriz[linha][matriz.length - 1 - linha];
		}

		// Saida da soma dos elementos da diagonal principal e secundária
		System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonal);
		System.out.println("Soma dos elementos da diagonal secundária: " + somaSecundaria);
		scanner.close();
	}

}
