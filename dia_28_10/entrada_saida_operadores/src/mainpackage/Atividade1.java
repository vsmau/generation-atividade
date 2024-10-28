package mainpackage;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		float salarioAtual, abono, novoSalario;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        salarioAtual = scanner.nextFloat();

        System.out.print("Digite o abono: ");
        abono = scanner.nextFloat();

        novoSalario = salarioAtual + abono;
        System.out.printf("\nO novo salário é: %.2f\n", novoSalario);
        

	}

}