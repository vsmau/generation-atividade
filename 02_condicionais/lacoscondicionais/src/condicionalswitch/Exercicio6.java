package condicionalswitch;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Declaração de variáveis
		String nome = "", cargo = "";
		int codigo;
		float salario;
		Scanner leitor = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Nome do colaborador: ");
		nome = leitor.nextLine();

		System.out.println("Cargo: ");
		codigo = leitor.nextInt();

		System.out.println("Salário: R$ ");
		salario = leitor.nextFloat();

		// Calculo
		switch (codigo) {
		case 1:
			cargo = "Gerente";
			salario *= 1.10;
			break;
		case 2:
			cargo = "Vendedor";
			salario *= 1.07;
			break;
		case 3:
			cargo = "Supervisor";
			salario *= 1.09;
			break;
		case 4:
			cargo = "Motorista";
			salario *= 1.06;
			break;
		case 5:
			cargo = "Estoquista";
			salario *= 1.05;
			break;
		case 6:
			cargo = "Técnico de TI";
			salario *= 1.08;
			break;
		}

		System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: R$ %.2f", nome, cargo, salario);

		leitor.close();
	}

}
