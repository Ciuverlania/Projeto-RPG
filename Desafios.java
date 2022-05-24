package EnsinaCyll;

import java.util.Scanner;

public class Desafios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("A teoria de Hezberg trata-se de um estudo que teve como objetivo entender os fatores\n"
				+ "responsáveis pela motivação e satisfação das pessoas em um ambiente de trabalho");
		System.out.println("Com base nisso, qual foi a conclusão desta teoria?\n"
				+ "1 - A insatisfação dos colaboradores estão relacionados as questões ambientais\n" + "2 - Preguiça\n"
				+ "3 - Estão ligadas aos relacionamentos interpessoais, condições de trabalho\n"
				+ "4 - 1 e 3 são verdadeiras");
		System.out.print("Responda: ");
		int resposta = input.nextInt();
		if (resposta == 4) {
			System.out.println("ACERTOOOOU!");
		} else {
			System.out.println("ERROOOOU!");
		}
	}

}
