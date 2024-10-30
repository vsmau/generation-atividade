/*Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características
 * de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
 * */

package mainpackage;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Declaração de variáveis
		String tipo, grupo, dieta, especie;
		Scanner ler = new Scanner(System.in);

		// Ler dados
		System.out.println("Animal vertebrado ou invertebrado?: ");
		tipo = ler.nextLine();

		System.out.println("Qual o grupo (ave,mamífero,inseto,anelídeo)");
		grupo = ler.nextLine();

		System.out.println("Qual a dieta (carnívoro,onívoro,herbívoro)");
		dieta = ler.nextLine();

		//Verificar tipo
		if (tipo.equalsIgnoreCase("vertebrado")) {
			if (grupo.equalsIgnoreCase("ave")) {
				if (dieta.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else if (dieta.equalsIgnoreCase("onívoro")) {
					System.out.println("Pomba");
				} else {
					System.out.println("Digitou a dieta errada :( ");
				}
			} else if (grupo.equalsIgnoreCase("mamífero")) {
				if (dieta.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				} else if (dieta.equalsIgnoreCase("herbívoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Digitou a dieta errada :( ");
				}
			} else {
				System.out.println("Digitou o grupo errado :( ");
			}

		} else if (tipo.equalsIgnoreCase("invertebrado")) {
			if (grupo.equalsIgnoreCase("inseto")) {
				if (dieta.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				} else if (dieta.equalsIgnoreCase("herbívoro")) {
					System.out.println("Lagarta");
				} else {
					System.out.println("Digitou a dieta errada :( ");
				}
			} else if (grupo.equalsIgnoreCase("anelídeo")) {
				if (dieta.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				} else if (dieta.equalsIgnoreCase("onívoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Digitou a dieta errada :( ");
				}
			} else {
				System.out.println("Digitou o grupo errado :( ");
			}
		} else {
			System.out.println("Digitou errado (vertebrado ou invertebrado) :( ");
		}

	}

}
