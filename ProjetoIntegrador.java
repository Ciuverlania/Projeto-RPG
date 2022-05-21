package pi;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoIntegrador {

	public static int QuestioMarcos() {
		int escolha = 0;

		return escolha;
	}

	public static int desafios(int Selecionado) {

		if (Selecionado == 1) {

		} else if (Selecionado == 2) {

		} else if (Selecionado == 3) {

		} else if (Selecionado == 4) {

		} else if (Selecionado == 5) {

		} else if (Selecionado == 6) {

		} else if (Selecionado == 7) {

		} else if (Selecionado == 8) {

		}

		return Selecionado;
	}

	public static int MapaVila(String nome) {
		Scanner input = new Scanner(System.in);
		int localizacao;

		System.out.printf("%n 1 - Prefeitura%n 2 - Tendas%n 3 - Hospital%n 4 - Poço%n");
		System.out.print("Responda: ");
		localizacao = input.nextInt();
		do {
			if (localizacao == 1) {
				SituaPrefeitura(nome);
			} else if (localizacao == 2) {
				SituaTendas(nome);
			} else if (localizacao == 3) {
				SituaHospital(nome);
			} else if (localizacao == 4) {
				SituaPoco(nome);

			} else {
				System.out.println("Digite um valor válido.");

			}

		} while (false);
		return 0;

	}

	public static int SituaPrefeitura(String nome) { // Localizacao da prefeitura
		Scanner input = new Scanner(System.in);
		int Falar;
		String texto;
		System.out.printf(" 1 - Falar com Marcos%n 2 - Falar com Leo%n 3 - Falar com Luca%n 4 - Sair%n");
		Falar = input.nextInt();
		do {
			if (Falar == 1) {
				int quest = 0;

				texto = "Seja Bem Vindo(a) " + nome
						+ " algumas coisas me preocupam, ainda mais depois da morte do seu pai....";
				TypeEffect(texto);
				texto = "Sabemos que você possui muitos conhecimentos em administração, e é por isso que o nomeamos como líder de nossa tribo, tenho certeza de que sua ajuda nos guiará rumo à vitória,"
						+ "\nA tribo te escolheu por meio da Teoria da Personalidade, onde percebendo o seu nível de conhecimento em administração "
						+ "te apontaram como um bom líder, qual foi o meio utilizado para fazer está escolha?\n";
				TypeEffect(texto);

				do {
					System.out.println("1 - Traços Físicos");
					System.out.println("2 - Traços Sociais");
					System.out.println("3 - Traços relacionados a tarefa");
					quest = input.nextInt();

					switch (quest) {

					case 1:
						System.out.println(
								"Apesar de sua boa aparência (digasse de passagem), este não foi o motivo no qual eles te escolheram.\n");
						break;

					case 2:
						System.out.println(
								"Suas habilidades administrativas foram o motivo no qual eles te escolheram, sua inteligência para gerir e organizar nossa tribo será fundamental para a sobrevivência.\n");
						break;

					case 3:
						System.out.println(
								"Realmente, sua comunicação e persistência são admiráveis, mas este não é o motivo correto.\n");
						break;

					default:
						System.out.println("Opção inválida!");
					}

				} while (quest != 2);

			} else if (Falar == 2) {
				// Conversa
			} else if (Falar == 3) {
				// conversa
			}

		} while (Falar != 4);
		MapaVila(nome);
		return 0;

	}

	public static int SituaTendas(String nome) { // Localizaçao das tendas
		Scanner input = new Scanner(System.in);
		int Falar;

		System.out.printf(" 1 - Falar com Dimmy%n 2 - Falar com  Jeff%n 3 - Marcia%n 4 - Sair%n");
		Falar = input.nextInt();
		do {
			if (Falar == 1) {
				// conversa
			} else if (Falar == 2) {
				// conversa
			} else if (Falar == 3) {
				// conversa
			}
		} while (Falar != 4);
		MapaVila(nome);
		return 0;
	}

	public static int SituaHospital(String nome) { // Localizaçao do Hospital
		Scanner input = new Scanner(System.in);
		int Falar;

		System.out.printf(" 1 - Falar com Giga%n 2 - Falar com  Dammy%n 3 - Cecilia%n 4 - Sair%n");
		Falar = input.nextInt();
		do {
			if (Falar == 1) {
				// conversa
			} else if (Falar == 2) {
				// conversa
			} else if (Falar == 3) {
				// conversa
			}
		} while (Falar != 4);
		MapaVila(nome);
		return 0;
	}

	public static int SituaPoco(String nome) {
		Scanner input = new Scanner(System.in);
		String texto;
		int escolha;
		texto = "A unica coisa que você enxerga é um velho poço que os moradores não ousam buscar água, não se sabe como está a qualidade da água....., ainda assim ela é altamente reflexiva..."
				+ "uma voz memorável pede para você olhar o poço, mas você não confia muito nisso...";
		TypeEffect(texto);
		System.out.println("-Mooon Presence");
		texto = "Se eu fosse você não olharia, mas como não sou.....\n";
		System.out.println("O que você vai fazer?\n 1 - Olhar para o poço\n 2 - Sair");
		escolha = input.nextInt();
		if (escolha == 1) {
			// Desafio que drena as 3 vidas de uma vez.

		} else {
			texto = "Foi uma boa escolha.......";
		}
		MapaVila(nome);
		return 0;
	}

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

	public static int menu() { // MENU com funções do TypeWrite e com o texto anexado em outras funções
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
					Thread.sleep(300);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			} else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	public static void main(String[] args) { // Jogo
		Scanner input = new Scanner(System.in);
		String texto, nome = null;
		int decisao;

		List<String> memoria = new ArrayList<>();

		if (menu() == 2) {
			texto = "Em um mundo devastado pelas escolhas do homem e com a humanidade beirando a extinção, algumas pessoas se destacam por tomadas de decisão incríveis e uma governança inabalável\n"
					+ "Você seria capaz de gerir e trazer a tona o poder da raça humana novamente?\n";
			TypeEffect(texto);
			do {
				System.out.printf("1 - Sim%n2 - Não %n");
				System.out.print("Escolha: ");
				decisao = input.nextInt();
				if (decisao == 1) {
					texto = "Sabia que uma das minhas crias me traria uma boa escolha, agora não me decepcione....\n -amy??d?a@\n\n";
					TypeEffect(texto);
					texto = "Me diga seu nome: ";
					TypeEffect(texto);
					nome = input.next();
					memoria.add(nome);
					break;
				} else if (decisao == 2) {
					texto = "Lamentável, tive experanças em você, pena que eu estava errada...., talvez um filho de outra vida possa me ajudar com a 'conquista'.....\n-a???d?a@#$@\n\n";
					TypeEffect(texto);
					break;

				} else {
					System.out.println("Escolha uma opção válida...");
				}

			} while (decisao != 1 && decisao != 2);
			System.out.println("Moon Presence");
			texto = "- Você acorda em meio a uma vila no meio de estilhaços de pedra e percebe estar cercado por prédios derrubados, avenidas que um dia foram populadas pelos mais luxuosos automóveis\n"
					+ "agora estão vazias de vida e consumidas por uma mata densa que se entranha por cada fresta que for possível...\n"
					+ "ao longe você avista um brilho de tom alaranjado...., quando você percebe é um grupo de pessoas chegando ao território, algumas montadas em cavalos, outras andando.. mas uma coisa\n"
					+ "elas tinham em comum.... estavam todas com um semblante pesado e segurando pedaços de pano que pareciam ser partes de suas roupas rasgadas....\n"
					+ "até que uma pequena garota se aproxima de um senhor, bem velho, ali por volta dos seus 85 anos, a pessoa mais velha do vilarejo, que demonstrou um sorriso que foi deteriorado por\n"
					+ "uma das cenas mais tristes em sua vida.... Em meio aos panos estava um braço, você só consegue notar uma tatuagem que já havia visto antes, e um relógio que lhe refrescava a memória\n"
					+ "Jenkins.... ERA ISSO, Jenkins um maduro caçador, que dessa vez, não voltou inteiro da caçada..... \n\n";
			TypeEffect(texto);
			System.out.println("-Mooon Presence");
			texto = "Um Homem lhe puxa pelo ombro...\n ";
			TypeEffect(texto);
			System.out.println("\n-Marcos");
			texto = nome
					+ ", tenho que conversar com você, a situação não é das melhores então me encontre na prefeitura, tenho assuntos sérios a tratar com você\n";
			TypeEffect(texto);
			System.out.println("\n-" + nome);
			texto = "O...kay?\n";
			TypeEffect(texto);
			System.out.println("\n-Mooon Presence");
			texto = "Para onde quer ir?";
			TypeEffect(texto);
			MapaVila(nome);

		}

	}

}
