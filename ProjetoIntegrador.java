package pi;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoIntegrador {
	public static Scanner input = new Scanner(System.in);
	private static String texto, nome;
	private static int desafio;
	private static List<String> memoria = new ArrayList<>();

	public static void QuestioMarcos() {
		int resposta = 0, Planta;
		String texto;

		texto = "Seja Bem Vindo(a) " + nome + " algumas coisas me preocupam, ainda mais depois da morte do seu pai....";
		TypeEffect(texto);
		texto = "Sabemos que você possui muitos conhecimentos em administração, e é por isso que o nomeamos como líder de nossa tribo, tenho certeza de que sua ajuda nos guiará rumo à vitória,\n"
				+ "A tribo te escolheu por meio da Teoria da Personalidade, onde percebendo o seu nível de conhecimento em administração\n"
				+ "te apontaram como um bom líder... ponderamos várias coisas mas adivinha só qual foi o meio utilizado para fazer está escolha?\n";
		TypeEffect(texto);

		do {
			System.out.println("1 - Traços Físicos");
			System.out.println("2 - Traços Sociais");
			System.out.println("3 - Traços relacionados a tarefa");
			System.out.print("Responda: ");
			resposta = input.nextInt();

			switch (resposta) {
			case 1:
				System.out.println(" -Marcos");
				texto = "Apesar de sua boa aparência (digasse de passagem), este não foi o motivo no qual eles te escolheram.\n";
				TypeEffect(texto);
				System.out.println(" -" + nome);
				texto = "Não é como se eu precisasse disso nos dias atuais\n";
				TypeEffect(texto);
				break;
			case 2:
				System.out.println(" -Marcos");
				texto = "Suas habilidades administrativas foram o motivo no qual eles te escolheram, sua inteligência para gerir e organizar nossa tribo será fundamental para a sobrevivência.\n";
				TypeEffect(texto);
				System.out.println(" -" + nome);
				texto = "Acho isso um pouco de mais pra mim\n";
				TypeEffect(texto);
				break;
			case 3:
				System.out.println(" -Marcos");
				texto = "Realmente, sua comunicação e persistência são admiráveis, mas este não é o motivo correto.\n";
				TypeEffect(texto);
				System.out.println(" -" + nome);
				texto = "Agradeço, e acredito que realmente vai me ser necessário\n";
				TypeEffect(texto);
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (resposta != 2);
		texto = "Tenho uma missão para você, em alguns dias estaremos em tempo de colheita, mas não plantamos nada ainda, temos algumas opções de plantio: \n"
				+ " 1 - Plantar Chirivias\n" + " 2 - Plantar Morangos\n" + " 3 - Plantar Maçã\n"
				+ " 4 - Plantar Beterrabas\n" + " 5 - Plantar Couve\n" + " 6 - Não plantar nada\n";
		TypeEffect(texto);
		System.out.print("Responda: ");
		Planta = input.nextInt();
		if (Planta == 6) {
			texto = "Você fez uma péssima escolha.... infelizmente";
			TypeEffect(texto);
			String NaoPlant = "Nao";
			memoria.add(NaoPlant);
		} else {
			String Plant = "Sim";
			memoria.add(Plant);
		}
		desafio = 1;
		desafios();
		memoria.add("okay");
	}

	public static void QuestioDimmy() {
		if (memoria.get(0) == "okay") {

			texto = "Dimmy está sentado com a cabeça baixa e a mão em sua testa, você entra e ele parece se assustar com a sua presença. Algo em seu rosto diz que está precisando de ajuda.. Dimmy então diz\n"
					+ "Me parece que as coisas estão ficando muito dificeis por aqui, pouca comida, a água parece estar acabando também.....e nós ainda nem sabemos se há mais pessoas vivas por perto.\n"
					+ "Algumas poucas pessoas que foram em busca de seus parentes não voltaram, talvez seja arriscado demais sair de nossa tribo, mas eu imagino que isto esteja passando por sua cabeça agora....Você deseja explorar o território?";
			TypeEffect(texto);

			desafio = 2;
			desafios();
		} else {
			texto = "Você ainda precisa conversar com o Marcos na prefeitura....";
			TypeEffect(texto);

		}
	}

	public static void desafios() {
		int opcao = 0, chance1 = 0;
		String texto, desafio1;
		if (desafio == 1) {
			do {
				chance1 = 1;
				System.out.println(" -Moon Presence");
				texto = "\n\nDesafio!\n"
						+ "Caso erre a questão será debitado uma de suas vidas e irá influenciar no seu futuro, então escolha sabiamente.\n\n"
						+ "Desde os tempos antigos, influenciadores como Frederick Taylor pensava em como gerir pessoas se baseando nos pensamentos de Henri Fayol, nesse contexto\n"
						+ "ele desenvolveu uma teoria que dava formas de lidar com diversas situações, uma de suas prioridades era o 'Planejamento'.\n"
						+ "Qual foi o ponto importante no Planejamento feito por 'Fayol'?\n";
				TypeEffect(texto);
				texto = "1 - Manter os métodos antigos e se importar em criar novos métodos.\n"
						+ "2 - Desenvolver jeitos impossíveis de lidar com os planos\n"
						+ "3 - Trocar os métodos arcaícos para científicos\n";
				TypeEffect(texto);
				texto = "Responda: ";
				TypeEffect(texto);
				opcao = input.nextInt();
				if (chance1 == 1) {
					if (opcao == 3) {
						texto = "Você acertou de primeira, isso influenciará seu futuro...\n";
						TypeEffect(texto);
						desafio1 = "certo";
						memoria.add(desafio1);
					} else {
						texto = "Você errou de primeira, isso influenciará no seu futuro.....infelizmente\n";
						TypeEffect(texto);
						desafio1 = "errado";
						memoria.add(desafio1);
					}
				}
				chance1 += 1;
			} while (opcao != 3);
			System.out.println(memoria.get(1));
		} else if (desafio == 2) {

			System.out.println("pupupipupu");

		} else if (desafio == 3) {

		} else if (desafio == 4) {

		} else if (desafio == 5) {

		} else if (desafio == 6) {

		} else if (desafio == 7) {

		} else if (desafio == 8) {

		}
	}

	public static void MapaVila() {
		int localizacao;

		System.out.printf("%n 1 - Prefeitura%n 2 - Tendas%n 3 - Hospital%n 4 - Poço%n 5 - Sair%n");
		System.out.print("Responda: ");
		localizacao = input.nextInt();
		do {
			if (localizacao == 1) {
				SituaPrefeitura();
			} else if (localizacao == 2) {
				SituaTendas();
			} else if (localizacao == 3) {
				SituaHospital();
			} else if (localizacao == 4) {
				SituaPoco();

			} else if (localizacao == 5) {
				texto = "Uma pena você ser um desistente";
				TypeEffect(texto);

			} else {
				System.out.println("Digite um valor válido.");
			}

		} while (localizacao != 5);

	}

	public static void SituaPrefeitura() { // Localizacao da prefeitura
		int Falar;
		String texto;
		do {
			System.out.printf(" 1 - Falar com Marcos%n 2 - Falar com Leo%n 3 - Falar com Luca%n 4 - Sair%n");
			texto = "Responda: ";
			TypeEffect(texto);
			Falar = input.nextInt();

			if (Falar == 1) {
				QuestioMarcos();
			} else if (Falar == 2) {
				// Conversa
			} else if (Falar == 3) {
				// conversa
			}
		} while (Falar != 4);

	}

	public static void SituaTendas() { // Localizaçao das tendas
		int Falar;
		do {
			System.out.printf(" 1 - Falar com Dimmy%n 2 - Falar com  Jeff%n 3 - Marcia%n 4 - Sair%n");
			Falar = input.nextInt();
			if (Falar == 1) {
				QuestioDimmy();
			} else if (Falar == 2) {
				texto = "Jeff está sentado com a cabeça baixa e a mão em sua testa, você entra e ele parece se assustar com a sua presença. Algo em seu rosto diz que está precisando de ajuda.. Jeff então diz\n"
						+ "Me parece que as coisas estão ficando muito dificeis por aqui, pouca comida, a água parece estar acabando também.....e nós ainda nem sabemos se há mais pessoas vivas por perto.\n"
						+ "Algumas poucas pessoas que foram em busca de seus parentes não voltaram, talvez seja arriscado demais sair de nossa tribo, mas eu imagino que isto esteja passando por sua cabeça agora....Você deseja explorar o território?";
			} else if (Falar == 3) {
				texto = "Marcia está sentada com a cabeça baixa e a mão em sua testa, você entra e ela parece se assustar com a sua presença. Algo em seu rosto diz que está precisando de ajuda.. Marcia então diz\n"
						+ "Me parece que as coisas estão ficando muito dificeis por aqui, pouca comida, a água parece estar acabando também.....e nós ainda nem sabemos se há mais pessoas vivas por perto.\n"
						+ "Algumas poucas pessoas que foram em busca de seus parentes não voltaram, talvez seja arriscado demais sair de nossa tribo, mas eu imagino que isto esteja passando por sua cabeça agora....Você deseja explorar o território?";
			} else {
				System.out.println("saindo");
			}
		} while (Falar != 4);

	}

	public static void SituaHospital() { // Localizaçao do Hospital
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
		MapaVila();
	}

	public static void SituaPoco() {
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
		MapaVila();
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
					Thread.sleep(1);
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
		int EscolhaCentral;

		if (menu() == 2) {
			texto = "Em um mundo devastado pelas escolhas do homem e com a humanidade beirando a extinção, algumas pessoas se destacam por tomadas de decisão incríveis e uma governança inabalável\n"
					+ "Você seria capaz de gerir e trazer a tona o poder da raça humana novamente?\n";
			TypeEffect(texto);
			do {
				System.out.printf("1 - Sim%n2 - Não %n");
				System.out.print("Escolha: ");
				EscolhaCentral = input.nextInt();
				if (EscolhaCentral == 1) {
					texto = "Sabia que uma das minhas crias me traria uma boa escolha, agora não me decepcione....\n -Amygdala\n\n";
					TypeEffect(texto);
					texto = "Me diga seu nome: ";
					TypeEffect(texto);
					nome = input.next();
					break;
				} else if (EscolhaCentral == 2) {
					texto = "Lamentável, tive experanças em você, pena que eu estava errada...., talvez um filho de outra vida possa me ajudar com a 'conquista'.....\n -Amygdala\n\n";
					TypeEffect(texto);
					break;

				} else {
					System.out.println("Escolha uma opção válida...");
				}

			} while (EscolhaCentral != 1 && EscolhaCentral != 2);
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
			do {
				System.out.println("\n -Moon Presence");
				texto = "O que vocêr quer fazer?\n"
						+ " 1 - Acessar o Mapa do acampamento\n 2 - Dormir\n 3 - Desistir de tudo...\n";
				TypeEffect(texto);
				System.out.print("Responda: ");
				EscolhaCentral = input.nextInt();
				if (EscolhaCentral == 1) {
					texto = "Carregando Mapa [#################################]\n";
					TypeEffect(texto);
					MapaVila();
				} else if (EscolhaCentral == 2) {
					System.out.println(" -" + nome);
					texto = "ZZzzZZzZZZzzZZzzzZZzzzZZZZzzZz...\n";
					TypeEffect(texto);
				} else if (EscolhaCentral == 3) {
					texto = ".....Okay, nem todos que vieram até aqui tiveram coragem de ficar, mas acredite em mim, o grande sonho só acaba quando se enfrenta a realidade.....\n";
					TypeEffect(texto);
				}
			} while (EscolhaCentral != 3);

		}

	}

}
