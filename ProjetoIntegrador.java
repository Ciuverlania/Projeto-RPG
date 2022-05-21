package pi;

import java.util.Scanner;

public class ProjetoIntegrador {

	public static String tutorial() { // Tutorial do jogo, função criada para ser chamado no menu.
		String Tutorial = "O jogo não é algo complexo, mas exige que você fique atento e pense nas suas ações, cada decisão importa\n"
				+ "É tudo bem intuitivo, você vai pegar o jeito conforme o andar da história, basta selecionar uma das opções presente na tela quando solicitado, que estará tudo bem\n"
				+ "Converse e preste bastante atenção à história do jogo, ela pode te dar dicas valiosas para a conclusão de um cenário.\n\n";
		return Tutorial;
	}

	public static String Creditos() { // Creditos do jogo, função criada para ser chamado no menu.
		String Creditos = "Esse projeto foi feito com intuito de auxiliar os alunos em geral, o grupo em aprender mais em programação java e os alunos com as aulas de administração\n"
				+ "Tudo isso foi desenvolvido pelo grupo 3 composto por Enzo Costa, Bianca de Oliveira, Ciuverlania Andrade e Eduardo Oliveira\n"
				+ "Gostaira de deixar menções honrosas aos professores que nos auxiliaram durante essa caminhada. Obrigado Eduarto 'Takeo' e Keli Cristiane\n"
				+ "E não esquecemos dos professores que nos apoiaram com conteúdo além do projeto, como o Marcio (Matemática), Fernando (Algoritmos), Anderson (Conceitos da computação) e Livia (Pesquisa Tecnologia e Sociedade)\n\n";
		return Creditos;

	}

	public static String Sair() { // Sair do jogo, função criada para ser chamado no menu.
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
			if (texto.charAt(i) == '.') {
				try {
					Thread.sleep(500);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			} else {
				try {
					Thread.sleep(10);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	public static void main(String[] args) { // Jogo
		Scanner input = new Scanner(System.in);
		String texto;
		int decisao;

		if (menu() == 2) {
			texto = "Em um mundo devastado pelas escolhas do homem e com a humanidade beirando a extinção, algumas pessoas se destacam por tomadas de decisão incríveis e uma governança inabalável\n"
					+ "Você seria capaz de gerir e trazer a tona o poder da raça humana novamente?\n";
			TypeEffect(texto);
			do {
				System.out.printf("1 - Sim%n2 - Não %n");
				System.out.print("Escolha: ");
				decisao = input.nextInt();
				if (decisao == 1) {
					texto = "Sabia que uma das minhas crias me traria uma boa escolha, agora não me decepcione....\n -amy??d?a@\\n\\n";
					TypeEffect(texto);
					break;
				} else if (decisao == 2) {
					texto = "Lamentável, tive experanças em você, pena que eu estava errada...., talvez um filho de outra vida possa me ajudar com a 'conquista'.....\n-a???d?a@#$@\n\n";
					TypeEffect(texto);

				} else {
					System.out.println("Escolha uma opção válida...");
				}

			} while (decisao != 1 && decisao != 2);
			System.out.println("Moon Presence");
			texto = "- Você acorda em meio a uma vila no meio de estilhaços de pedra e percebe estar sercado por prédios derrubados, avenidas que um dia foram populadas pelos mais luxuosos automóveis"
					+ "agora estão vazias de vida e consumidas por uma mata densa que se entranha por cada fresta que for possível...\n"
					+ "ao longe você avista um brilho de tom alaranjado...., quando você percebe é um grupo de pessoas chegando ao território, algumas montadas em cavalos, outras andando.. mas uma coisa\n"
					+ "elas tinham em comum.... estavam todas com um semblante pesado e segurando pedaços de pano que pareciam ser partes de suas roupas rasgadas....\n"
					+ "até que uma pequena garota se aproxima de um senhor, bem velho, ali por volta dos seus 85 anos, a pessoa mais velha do vilarejo, que demonstrou um sorriso que foi deteriorado por\n"
					+ "uma das cenas mais tristes em sua vida.... Em meio aos panos estava um braço, você só consegue notar uma tatuagem que já havia visto antes, e um relógio que lhe refrescava a memória\n"
					+ "Jenkins.... ERA ISSO, Jenkins um maduro caçador, que dessa vez, não voltou inteiro da caçada..... ";

		}

	}

}
