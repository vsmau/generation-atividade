/*Uma empresa desenvolveu uma pesquisa interna para conhecer 
 *os colaboradores da área de Desenvolvimento e precisam de 
 *um sistema para analisar os dados. Escreva um algoritmo em 
 *Java, que leia via teclado as seguintes informações de cada 
 *colaborador
 * */

package bwhileloops;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Iniciar as variáveis e o leitor de dados
		Scanner scanner = new Scanner(System.in);
		int idade = 0;
		int genero = 0;
		int cargo = 0;
		
		int totalBackEndDevs = 0;
		int mulheresETransFrontEnd = 0;
		int homensETransMobileMais40 = 0;
		int naoBinariosFullStackMenos30 = 0;
		int totalPessoas = 0;
		float idadeSomada = 0;
		
		boolean cont = true;

		// Loop de cadastro de participantes
		while (cont) {
			System.out.println("***********************");
			System.out.println("PESQUISA DE DIVERSIDADE\n");
			System.out.println("Digite a idade do dev: ");
			idade = scanner.nextInt();
			
			System.out.println("----------------------");
			System.out.println("Nº \tID de Gên"
					+ "\n1 -\tMulher Cis"
					+ "\n2 -\tHomem Cis"
					+ "\n3 -\tNão Binário"
					+ "\n4 -\tMulher Trans"
					+ "\n5 -\tHomem Trans"
					+ "\n6 -\tOutros");
			System.out.println("----------------------");
			System.out.println("Digite um Nº: ");
			genero = scanner.nextInt();
			
			System.out.println("----------------------");
			System.out.println("Nº \tFunção Dev"
					+ "\n1 -\tBackend"
					+ "\n2 -\tFrontend"
					+ "\n3 -\tMobile"
					+ "\n4 -\tFullStack");
			System.out.println("----------------------");
			System.out.printf("Digite um Nº: ");
			cargo = scanner.nextInt();
			
			// Soma os valores para a estatística
			if (cargo == 1) {totalBackEndDevs++;}
			if (cargo == 2 && (genero == 1 || genero == 4)) {mulheresETransFrontEnd++;}
			if (cargo == 3 && (genero == 2 || genero == 5) && idade > 40) {homensETransMobileMais40++;}
			if (cargo == 4 && genero == 3 && idade < 30) {naoBinariosFullStackMenos30++;}
			totalPessoas++;
			idadeSomada += idade;
			
			//Imprime a opção de seguir acrescentando dados
			System.out.println("Deseja continuar?(S/N)");
			cont = scanner.next().equalsIgnoreCase("s");
		}
		// Saida dos resultados calculados com os dados cadastrados
		System.out.println("Total de pessoas desenvolvedoras BackEnd: " + totalBackEndDevs);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras FrontEnd: " + mulheresETransFrontEnd);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40: " + homensETransMobileMais40);
		System.out.println("Total de pessoas Não Binárias desenvolvedoras Fullstack menores de 30 anos: " + naoBinariosFullStackMenos30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + idadeSomada/totalPessoas);
		scanner.close();
	}

}
