package EnsinaCyll;

import java.util.Scanner;

public class Desafios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("A teoria de Hezberg trata-se de um estudo que teve como objetivo entender os fatores\n"
				+ "respons�veis pela motiva��o e satisfa��o das pessoas em um ambiente de trabalho");
		System.out.println("Com base nisso, qual foi a conclus�o desta teoria?\n"
				+ "1 - A insatisfa��o dos colaboradores est�o relacionados as quest�es ambientais\n" + "2 - Pregui�a\n"
				+ "3 - Est�o ligadas aos relacionamentos interpessoais, condi��es de trabalho\n"
				+ "4 - 1 e 3 s�o verdadeiras");
		System.out.print("Responda: ");
		int resposta = input.nextInt();
		if (resposta == 4) {
			System.out.println("ACERTOOOOU!");
		} else {
			System.out.println("ERROOOOU!");
		}
	}

}
