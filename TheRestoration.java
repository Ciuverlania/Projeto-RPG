package pi;

import java.util.Scanner;

public class TheRestoration {
	public static int menu() {
		Scanner input = new Scanner(System.in);
		int menu1;

		System.out.println(
				" Em um mundo devastado pelas escolhas do homem e com a humanidade em beira a extin��o, \nalgumas pessoas se destacam pela sua governan�a e tomada de atitude que beiram o nirvana.");
		System.out.println(" Voc� seria capaz de gerir e trazer a tona o poder da ra�a humana novamente?");
		System.out.println();
		System.out.printf("Insira seu primeiro nome: ");
		String Nome = input.next();
		System.out.println();

		do {
			System.out.printf(" 1 - Tutorial%n 2 - Jogar%n 3 - Cr�ditos%n 4 - Sair%n");
			System.out.print("Selecione uma op��o: ");
			menu1 = input.nextInt();
			System.out.println("");

			switch (menu1) {
			case 1:
				System.out.println("O jogo n�o � algo complexo, mas exige que voc� se esforce.");
				System.out.println(
						"� tudo bem intuitivo, voc� vai pegar o jeito conforme o andar da hist�ria, basta selecionar uma das op��es presente na tela quando solicitado, que estar� tudo bem.");
				System.out.println(
						"Converse e preste bastante aten��o nos NPC's do jogo, eles podem te dar dicas valiosas para a conclus�o de um cen�rio\n");
				break;
			case 2:

				break;
			case 3:
				System.out.println(
						"Esse projeto foi feito com intuito de auxiliar os alunos em geral, o grupo em aprender mais em programa��o java e os alunos com as aulas de administra��o.");
				System.out.println(
						"Tudo isso foi desenvolvido pelo grupo 3 composto por Enzo Costa, Bianca de Oliveira, Ciuverlania Andrade e Eduardo Oliveira.");
				System.out.println(
						"Gostaira de deixar men��es honrosas aos professores que nos auxiliaram durante essa caminhada. Obrigado Eduarto 'Takeo' e Keli Cristiane");
				System.out.println(
						"E n�o esquecemos dos professores que nos apoiaram com conte�do al�m do projeto, como o Marcio (Matem�tica), Fernando (Algoritmos), Anderson (Conceitos da computa��o) e  Livia (Pesquisa Tecnologia e Sociedade)\n");
				break;
			case 4:
				System.out.println("O mundo contou com voc�.... e voc� os abandonou!");
				break;
			default:
				System.out.println("Esolhe uma op��o v�lida ae p�, fa�a juz ao seu nome" + Nome);

			}

		} while (menu1 != 4 && menu1 != 2);

		return menu1;

	}

	public void TypeEffect() {
		String text = "hello world!";
		int i;
		for (i = 0; i < text.length(); i++) {
			System.out.printf("%c", text.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}

	public static void main(String[] args) {

		if (menu() == 2) {
			System.out.println("aa");

		}

	}

}
