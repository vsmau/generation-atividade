package mainpackage;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		float sabruto, adnoturno, hextras, descontos, saliquido; //Declaração de dados e scanner
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o salário bruto?: "); //Entrada de dados
		sabruto = leia.nextFloat();
		
		System.out.println("\nQual o adicional noturno?: ");
		adnoturno = leia.nextFloat();
		
		System.out.println("\nQual o valor de hora extra?: ");
		hextras = leia.nextFloat() * 5;
		
		System.out.println("\nQual e descontos?: ");
		descontos = leia.nextFloat();
		
		saliquido = sabruto + adnoturno + hextras - descontos; //Calculo do liquido
		System.out.println("\nO valor de salário líquido seria: " + saliquido);
				
		leia.close();

	}

}
