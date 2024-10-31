package condicionalswitch;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Declarar variáveis
		int codigo, qtd = 0, vlr = 0;
		String pdt = "";
		Scanner leitor = new Scanner(System.in);

		// Ler dados
		System.out.println("Digite o código do produto: ");
		codigo = leitor.nextInt();

		System.out.println("Digite a quantidade: ");
		qtd = leitor.nextInt();

		// Calculo do valor
		switch (codigo) {
		case 1:
			vlr = 10 * qtd;
			pdt = "Cachorro Quente";
			break;
		case 2:
			vlr = 15 * qtd;
			pdt = "X-Salada";
			break;
		case 3:
			vlr = 18 * qtd;
			pdt = "X-Bacon";
			break;
		case 4:
			vlr = 12 * qtd;
			pdt = "Bauru";
			break;
		case 5:
			vlr = 8 * qtd;
			pdt = "Refrigerante";
			break;
		case 6:
			vlr = 13 * qtd;
			pdt = "Suco de laranja";
			break;
		}

		// Saida valor
		System.out.printf("\nProduto: %s \nValor total: %d", pdt, vlr);

		leitor.close();

	}

}
