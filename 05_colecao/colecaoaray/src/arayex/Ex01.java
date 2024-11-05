/*
 * Escreva um programa Java para criar uma Collection ArrayList
 * de Objetos da Classe String. O programa deverá solicitar ao usuário,
 * que ele digite via teclado 5 cores e deverá adicioná-las 
 * individualmente no ArrayList. Em seguida, faça o que se pede:
 * - Mostre na tela todas as cores que foram adicionadas. 
 * - Mostre na tela todas as cores que foram adicionadas ordenadas em ordem
 *   crescente.
 * */

package arayex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			cores.add(scanner.nextLine());
		}
		
		// Saida das cores
		System.out.println(cores);

		// Saida ordenada
		cores.sort(null);
		for (String cor : cores) {
			System.out.println(cor);
		}
		scanner.close();
	}
}