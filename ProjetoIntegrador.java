package pi;

import java.util.Scanner;

public class ProjetoIntegrador {

	public static String tutorial() {
		String Tutorial = "O jogo não é algo complexo, mas exige que você fique atento e pense nas suas ações, cada decisão importa\n"
				+ "É tudo bem intuitivo, você vai pegar o jeito conforme o andar da história, basta selecionar uma das opções presente na tela quando solicitado, que estará tudo bem\n"
				+ "Converse e preste bastante atenção à história do jogo, ela pode te dar dicas valiosas para a conclusão de um cenário.\n\n";
		return Tutorial;
	}

	public static String Creditos() {
		String Creditos = "Esse projeto foi feito com intuito de auxiliar os alunos em geral, o grupo em aprender mais em programação java e os alunos com as aulas de administração\n"
				+ "Tudo isso foi desenvolvido pelo grupo 3 composto por Enzo Costa, Bianca de Oliveira, Ciuverlania Andrade e Eduardo Oliveira\n"
				+ "Gostaira de deixar menções honrosas aos professores que nos auxiliaram durante essa caminhada. Obrigado Eduarto 'Takeo' e Keli Cristiane\n"
				+ "E não esquecemos dos professores que nos apoiaram com conteúdo além do projeto, como o Marcio (Matemática), Fernando (Algoritmos), Anderson (Conceitos da computação) e Livia (Pesquisa Tecnologia e Sociedade)\n\n";
		return Creditos;

	}

	public static String Sair() {
		String Sair = "O mundo contou com você.... e você os abandonou!";
		return Sair;
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		int menu1;		
		do {
			System.out.printf(" 1 - Tutorial%n 2 - Jogar%n 3 - Créditos%n 4 - Sair%n");
			System.out.print("Selecione uma opção: ");
			menu1 = input.nextInt();
			System.out.println("");
			String texto;

			switch (menu1) {
			case 1:
				texto = tutorial();
				TypeEffect(texto);
				break;
			case 2:

				break;
			case 3:
				texto = Creditos();
				TypeEffect(texto);
				break;
			case 4:
				texto = Sair();
				TypeEffect(texto);
				break;
			default:
				System.out.println("Esolhe uma opção válida ae pô, faça juz ao seu nome");

			}

		} while (menu1 != 4 && menu1 != 2);

		return menu1;

	}

	public static void TypeEffect(String texto) {
		int i;
		for (i = 0; i < texto.length(); i++) {
			System.out.printf("%c", texto.charAt(i));
			try {
				Thread.sleep(60);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}

	public static void main(String[] args) {
		if (menu() == 2) {

		}

	}

}
