/*
 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante
 *  4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma 
 *  linha de uma matriz de números reais, logo cada linha da matriz serão as notas de 
 *  um participante. Em um vetor de números reais, armazene as médias de cada participante
 *  e exiba as médias de cada um na tela.
 * */

package bmatrizes;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Inicalização das variáveis
		Scanner scanner = new Scanner(System.in);
		float matriz[][] = new float[10][4];
		float vetor[] = new float[10];

		// Entrada das notas dos alunos pelo teclado
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Digite a nota do " + (linha + 1) + "º aluno no " + (coluna + 1) + "º bimestre: ");
				matriz[linha][coluna] = scanner.nextFloat();
			}
		}

		// Calculo da média de cada aluno e saida da média
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				vetor[linha] += matriz[linha][coluna];
			}
			System.out.printf("| %.1f | ", vetor[linha] / 4);
			vetor[linha] = 0;
		}
		scanner.close();
	}
}