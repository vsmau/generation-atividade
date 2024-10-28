package mainpackage;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		float nota = 0; //Declaração de variáveis e leitor
		float media = 0;
		Scanner leitor = new Scanner(System.in);		
		
		for (int j = 1; j <= 4; j++) { //Ler as notas 4 vezes
			System.out.println("\nQual o valor da " + j + " nota?: ");
			nota = leitor.nextFloat();
			media += nota;
		}
		media /= 4; // Cálculo de média e mostrar o resultado
		System.out.println("\nA media das 4 notas foi: " + media);
		
		leitor.close();
	}

}
