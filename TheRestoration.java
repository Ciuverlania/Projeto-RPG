package pi;

import java.util.Scanner;

public class TheRestoration {
	public static int menu() {
		Scanner input = new Scanner(System.in);
		int menu1;

		System.out.println(
				" Em um mundo devastado pelas escolhas do homem e com a humanidade em beira a extinção, \nalgumas pessoas se destacam pela sua governança e tomada de atitude que beiram o nirvana.");
		System.out.println(" Você seria capaz de gerir e trazer a tona o poder da raça humana novamente?");
		System.out.println();
		System.out.printf("Insira seu primeiro nome: ");
		String Nome = input.next();
		System.out.println();

		do {
			System.out.printf(" 1 - Tutorial%n 2 - Jogar%n 3 - Créditos%n 4 - Sair%n");
			System.out.print("Selecione uma opção: ");
			menu1 = input.nextInt();
			System.out.println("");

			switch (menu1) {
			case 1:
				System.out.println("O jogo não é algo complexo, mas exige que você se esforce.");
				System.out.println(
						"É tudo bem intuitivo, você vai pegar o jeito conforme o andar da história, basta selecionar uma das opções presente na tela quando solicitado, que estará tudo bem.");
				System.out.println(
						"Converse e preste bastante atenção nos NPC's do jogo, eles podem te dar dicas valiosas para a conclusão de um cenário\n");
				break;
			case 2:

				break;
			case 3:
				System.out.println(
						"Esse projeto foi feito com intuito de auxiliar os alunos em geral, o grupo em aprender mais em programação java e os alunos com as aulas de administração.");
				System.out.println(
						"Tudo isso foi desenvolvido pelo grupo 3 composto por Enzo Costa, Bianca de Oliveira, Ciuverlania Andrade e Eduardo Oliveira.");
				System.out.println(
						"Gostaira de deixar menções honrosas aos professores que nos auxiliaram durante essa caminhada. Obrigado Eduarto 'Takeo' e Keli Cristiane");
				System.out.println(
						"E não esquecemos dos professores que nos apoiaram com conteúdo além do projeto, como o Marcio (Matemática), Fernando (Algoritmos), Anderson (Conceitos da computação) e  Livia (Pesquisa Tecnologia e Sociedade)\n");
				break;
			case 4:
				System.out.println("O mundo contou com você.... e você os abandonou!");
				break;
			default:
				System.out.println("Esolhe uma opção válida ae pô, faça juz ao seu nome" + Nome);

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
