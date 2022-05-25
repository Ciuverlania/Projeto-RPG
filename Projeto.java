import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Projeto {
	public static Scanner input = new Scanner(System.in);
	private static String texto, nome;
	private static int desafio;
	private static List<String> memoria = new ArrayList<>();
	static int vida = 5;

	public static void QuestioMarcos() {
		int resposta = 0, Planta;
		String texto;

		texto = "Seja Bem Vindo(a) " + nome + " algumas coisas me preocupam, ainda mais depois da morte do seu pai....";
		TypeEffect(texto);
		texto = "Sabemos que voc� possui muitos conhecimentos em administra��o, e � por isso que o nomeamos como l�der de nossa tribo, tenho certeza de que sua ajuda nos guiar� rumo � vit�ria,\n"
				+ "A tribo te escolheu por meio da Teoria da Personalidade, onde percebendo o seu n�vel de conhecimento em administra��o\n"
				+ "te apontaram como um bom l�der... ponderamos v�rias coisas mas adivinha s� qual foi o meio utilizado para fazer est� escolha?\n";
		TypeEffect(texto);

		do {
			System.out.println("1 - Tra�os F�sicos");
			System.out.println("2 - Tra�os Sociais");
			System.out.println("3 - Tra�os relacionados a tarefa");
			System.out.print("Responda: ");
			resposta = input.nextInt();

			switch (resposta) {
			case 1:
				System.out.println(" -Marcos");
				texto = "Apesar de sua boa apar�ncia (digasse de passagem), este n�o foi o motivo no qual eles te escolheram.\n";
				TypeEffect(texto);
				System.out.println(" -" + nome);
				texto = "N�o � como se eu precisasse disso nos dias atuais\n";
				TypeEffect(texto);
				vida -= 1;
				break;
			case 2:
				System.out.println(" -Marcos");
				texto = "Suas habilidades administrativas foram o motivo no qual eles te escolheram, sua intelig�ncia para gerir e organizar nossa tribo ser� fundamental para a sobreviv�ncia.\n";
				TypeEffect(texto);
				System.out.println(" -" + nome);
				texto = "Acho isso um pouco de mais pra mim\n";
				TypeEffect(texto);
				break;
			case 3:
				System.out.println(" -Marcos");
				texto = "Realmente, sua comunica��o e persist�ncia s�o admir�veis, mas este n�o � o motivo correto.\n";
				TypeEffect(texto);
				System.out.println(" -" + nome);
				texto = "Agrade�o, e acredito que realmente vai me ser necess�rio\n";
				TypeEffect(texto);
				vida -= 1;
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
		} while (resposta != 2);
		if (vida == 0) {
			System.out.println("Game Over");
		}

		texto = "Tenho uma miss�o para voc�, em alguns dias estaremos em tempo de colheita, mas n�o plantamos nada ainda, temos algumas op��es de plantio: \n"
				+ " 1 - Plantar Chirivias\n" + " 2 - Plantar Morangos\n" + " 3 - Plantar Ma��\n"
				+ " 4 - Plantar Beterrabas\n" + " 5 - Plantar Couve\n" + " 6 - N�o plantar nada\n";
		TypeEffect(texto);
		System.out.print("Responda: ");
		Planta = input.nextInt();
		if (Planta == 6) {
			texto = "Voc� fez uma p�ssima escolha.... infelizmente";
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
		int opcao = 0;
		String texto;

		texto = "Dimmy est� sentado com a cabe�a baixa e a m�o em sua testa, voc� entra e ele parece se assustar com a sua presen�a. "
				+ "Algo em seu rosto diz que est� precisando de ajuda...";
		TypeEffect(texto);
		System.out.println(" -Dimmy");
		texto = "Me parece que as coisas est�o ficando muito dificeis por aqui, pouca comida, a �gua parece estar acabando tamb�m....."
				+ "e n�s ainda nem sabemos se h� mais pessoas vivas por perto....\n"
				+ "Algumas poucas pessoas que foram em busca de seus parentes n�o voltaram.... ";
		TypeEffect(texto);
		System.out.println(" -" + nome);
		texto = "Sinto muito Dimmy, depois da catastrofe n�o nos restaram muitas op��es... ainda mais agora que meu pai morreu e "
				+ "Marcos exigiu que eu governe no lugar de meu pai... \n";
		TypeEffect(texto);
		System.out.println(" -Dimmy");
		texto = "talvez seja arriscado demais sair de nossa tribo, mas eu imagino que isto esteja passando por sua cabe�a agora...."
				+ "Voc� deseja explorar o territ�rio?";
		System.out.println(" 1 - Sim\n 2 - N�o");
		opcao = input.nextInt();
		if (opcao == 1) {
			desafio = 2;
			desafios();
		} else {
			System.out.println("-Dimmy");
			texto = "Entendo, mas lembre-se, n�o h� ningu�m melhor que eu para te mostrar todo o lugar....";
		}

	}

	public static void QuestioJeff() {
		String texto;

		texto = "Jeff est� sentado com a cabe�a baixa e a m�o em sua testa, voc� entra e ele parece se assustar com a sua presen�a."
				+ " Algo em seu rosto diz que est� precisando de ajuda.. Jeff ent�o diz\n"
				+ "Me parece que as coisas est�o ficando muito dificeis por aqui, pouca comida, a �gua parece estar acabando tamb�m..."
				+ "e n�s ainda nem sabemos se h� mais pessoas vivas por perto.\n";

		TypeEffect(texto);
	}

	public static void QuestioMarcia() {
		String texto;

		texto = "Marcia est� sentada com a cabe�a baixa e a m�o em sua testa, voc� entra e ela parece se assustar com a sua presen�a."
				+ "Algo em seu rosto diz que est� precisando de ajuda.. Marcia ent�o diz\n"
				+ "Me parece que as coisas est�o ficando muito dificeis por aqui, pouca comida, a �gua parece estar acabando tamb�m.."
				+ "e n�s ainda nem sabemos se h� mais pessoas vivas por perto.\n";

		TypeEffect(texto);
	}

	public static void desafios() {
		int opcao = 0, chance1 = 0;
		String texto, desafio1;
		if (desafio == 1) {
			do {
				chance1 = 1;
				System.out.println(" -Moon Presence");
				texto = "\n\nDesafio!\n"
						+ "Caso erre a quest�o ser� debitado uma de suas vidas e ir� influenciar no seu futuro, ent�o escolha sabiamente.\n\n"
						+ "Desde os tempos antigos, influenciadores como Frederick Taylor pensava em como gerir pessoas se baseando nos pensamentos de Henri Fayol, nesse contexto\n"
						+ "ele desenvolveu uma teoria que dava formas de lidar com diversas situa��es, uma de suas prioridades era o 'Planejamento'.\n"
						+ "Qual foi o ponto importante no Planejamento feito por 'Fayol'?\n";
				TypeEffect(texto);
				texto = "1 - Manter os m�todos antigos e se importar em criar novos m�todos.\n"
						+ "2 - Desenvolver jeitos imposs�veis de lidar com os planos\n"
						+ "3 - Trocar os m�todos arca�cos para cient�ficos\n";
				TypeEffect(texto);
				texto = "Responda: ";
				TypeEffect(texto);
				opcao = input.nextInt();
				if (chance1 == 1) {
					if (opcao == 3) {
						texto = "Voc� acertou de primeira, isso influenciar� seu futuro...\n";
						TypeEffect(texto);
						desafio1 = "certo";
						memoria.add(desafio1);
						vida -= 1;
					} else {
						texto = "Voc� errou de primeira, isso influenciar� no seu futuro.....infelizmente\n";
						TypeEffect(texto);
						desafio1 = "errado";
						memoria.add(desafio1);
						vida -= 1;
					}
				}
				chance1 += 1;
			} while (opcao != 3);
			if (vida == 0) {
				System.out.println("Game Over");
			}

			System.out.println(memoria.get(1));
		} else if (desafio == 2) {

			texto = "Com base nos pensamentos de Geertz, motiva��o e conformidade s�o diferentes.\n"
					+ " Eu espero que voc� saiba a resposta, pois isso nos dira se estamos prontos ou n�o para explorar o territ�rio seguindo seus passos.\n"
					+ "Diga, qual a sua motiva��o para sair da tribo?";
			TypeEffect(texto);

			do {
				System.out.println("\n1 - Todos est�o pedindo por isso, ent�o o que mais eu poderia fazer?\n"
						+ "2 - Me escolheram como l�der, e devo honrar isto, indo al�m do que me � solicitado.\n"
						+ "3 - Existe diferen�a?\n" + "4- Eu nunca nego um desafio.\n");

				System.out.print("Escolha uma op��o: ");
				opcao = input.nextInt();
				switch (opcao) {
				case 1:
					texto = "Anh??\n";
					TypeEffect(texto);
					vida -= 1;
					break;
				case 2:
					texto = "Muito bem, � por isso que te escolhemos como nosso l�der!\n";
					TypeEffect(texto);
					break;
				case 3:
					texto = "?-?...... Poxa, isso n�o devia ser t�o dif�cil....\n";
					TypeEffect(texto);
					vida -= 1;
					break;
				case 4:
					texto = "Vamos l�, o seu ego n�o devia ser o motivo de sua escolha.\n";
					TypeEffect(texto);
					vida -= 1;
					break;
				default:
					texto = "Escolha uma op��o v�lida.\n";
					TypeEffect(texto);
				}
			} while (opcao != 2);
			if (vida == 0) {
				System.out.println("Game Over");
			}

		} else if (desafio == 3) {

			texto = "\n\nDesafio\n"
					+ "Como voc� deve saber, a Administra��o Cient�fica foi desenvolvida por Frederick Taylor e por isso � frequentemente chamada tamb�m de Taylorismo\n"
					+ "Vamos testar ainda mais seus conhecimentos!" + "Responda: ";
			TypeEffect(texto);
			do {
				System.out.println("Qual das op��es a seguir descreve uma caracter�stica do Taylorismo?\n"
						+ " 1 - Falta de padroniza��o na linha de produ��o\n" + "2 - Fiscaliza��o dos funcion�rios\n"
						+ "3 - Cria��o de escolas de of�cio");
				System.out.print("Escolha uma op��o: ");
				opcao = input.nextInt();

				switch (opcao) {
				case 1:
					texto = "Temo que voc� tenha errado...";
					vida -= 1;
					break;
				case 2:
					texto = "Correto! N�o esperava menos de voc�";
					break;
				case 3:
					texto = "Parece que voc� est� confundindo o Taylorismo com outro modelo de admnistra��o";
					vida -= 1;
					break;
				default:
					texto = "Escolha uma op��o v�lida.";
				}

			} while (opcao != 2);
			if (vida == 0) {
				System.out.println("Game Over");
			}

		} else if (desafio == 4) {

			texto = "\n\nDesafio\n"
					+ "Muito bem, vamos partir ent�o para a Administra��o Cl�ssica. Esta j� foi idealizada por Henri Fayol e tamb�m � conhecida como Fayolismo\n"
					+ "Mas voc� certamente j� sabia disso." + "Portanto, responda: ";
			TypeEffect(texto);
			do {
				System.out.println("Qual das op��es a seguir descreve uma caracter�stica dos princ�pios de Fayol?\n"
						+ "1 - Estudo do tempo de execu��o dos trabalhos"
						+ "2 - A utiliza��o de apenas um departamento na linha de produ��o"
						+ "3 - Cria��o de turnos de trabalho");

				opcao = input.nextInt();

				switch (opcao) {
				case 1:
					texto = "Incorreto. Sinto que voc� ainda est� com o Taylorismo em mente...";
					vida -= 1;
					TypeEffect(texto);
					break;
				case 2:
					texto = "� uma pena, mas n�o. A separa��o em departamentos � uma forte caracter�stica do Fayolismo";
					TypeEffect(texto);
					vida -= 1;
					break;
				case 3:
					texto = "Correto!";
					TypeEffect(texto);
					break;
				default:
					texto = "Escolha uma op��o v�lida.";
					TypeEffect(texto);
				}

			} while (opcao != 3);
			if (vida == 0) {
				System.out.println("Game Over");
			}

		} else if (desafio == 5) {

		} else if (desafio == 6) {

		} else if (desafio == 7) {

		} else if (desafio == 8) {

		}
	}

	public static void MapaVila() {
		int localizacao;

		do {
			System.out.printf("%n 1 - Prefeitura%n 2 - Tendas%n 3 - Hospital%n 4 - Po�o%n 5 - Sair%n");
			System.out.print("Responda: ");
			localizacao = input.nextInt();
			if (localizacao == 1) {
				SituaPrefeitura();
			} else if (localizacao == 2) {
				SituaTendas();
			} else if (localizacao == 3) {
				SituaHospital();
			} else if (localizacao == 4) {
				SituaPoco();

			} else if (localizacao == 5) {
				texto = "Uma pena voc� ser um desistente";
				TypeEffect(texto);

			} else {
				System.out.println("Digite um valor v�lido.");
			}

		} while (localizacao != 5);
		return;

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
				break;
			} else if (Falar == 2) {
				// Conversa
			} else if (Falar == 3) {
				// conversa
			}
		} while (Falar != 4);
		return;
	}

	public static void SituaTendas() { // Localiza�ao das tendas
		int Falar;

		do {
			System.out.printf(" 1 - Falar com Dimmy%n 2 - Falar com  Jeff%n 3 - Marcia%n 4 - Sair%n");
			Falar = input.nextInt();
			if (Falar == 1) {
				QuestioDimmy();
				break;

			} else if (Falar == 2) {
				QuestioJeff();
				break;

			} else if (Falar == 3) {
				QuestioMarcia();
				break;

			} else if (Falar == 4) {
				System.out.println("saindo");
			}
		} while (Falar != 4);

	}

	public static void SituaHospital() { // Localiza�ao do Hospital
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
		texto = "A unica coisa que voc� enxerga � um velho po�o que os moradores n�o ousam buscar �gua, n�o se sabe como est� a qualidade da �gua....., ainda assim ela � altamente reflexiva..."
				+ "uma voz memor�vel pede para voc� olhar o po�o, mas voc� n�o confia muito nisso...";
		TypeEffect(texto);
		System.out.println("-Mooon Presence");
		texto = "Se eu fosse voc� n�o olharia, mas como n�o sou.....\n";
		System.out.println("O que voc� vai fazer?\n 1 - Olhar para o po�o\n 2 - Sair");
		escolha = input.nextInt();
		if (escolha == 1) {
			// Desafio que drena as 3 vidas de uma vez.

		} else {
			texto = "Foi uma boa escolha.......";
		}
		MapaVila();
	}

	public static String tutorial() { // Tutorial do jogo, fun��o criada para ser chamado no menu.
		String Tutorial = "O jogo n�o � algo complexo, mas exige que voc� fique atento e pense nas suas a��es, cada decis�o importa\n"
				+ "� tudo bem intuitivo, voc� vai pegar o jeito conforme o andar da hist�ria, basta selecionar uma das op��es presente na tela quando solicitado, que estar� tudo bem\n"
				+ "Converse e preste bastante aten��o � hist�ria do jogo, ela pode te dar dicas valiosas para a conclus�o de um cen�rio.\n\n";
		return Tutorial;
	}

	public static String Creditos() { // Creditos do jogo, fun��o criada para ser chamado no menu.
		String Creditos = "Esse projeto foi feito com intuito de auxiliar os alunos em geral, o grupo em aprender mais em programa��o java e os alunos com as aulas de administra��o\n"
				+ "Tudo isso foi desenvolvido pelo grupo 3 composto por Enzo Costa, Bianca de Oliveira, Ciuverlania Andrade e Eduardo Oliveira\n"
				+ "Gostaira de deixar men��es honrosas aos professores que nos auxiliaram durante essa caminhada. Obrigado Eduarto 'Takeo' e Keli Cristiane\n"
				+ "E n�o esquecemos dos professores que nos apoiaram com conte�do al�m do projeto, como o Marcio (Matem�tica), Fernando (Algoritmos), Anderson (Conceitos da computa��o) e Livia (Pesquisa Tecnologia e Sociedade)\n\n";
		return Creditos;

	}

	public static String Sair() { // Sair do jogo, fun��o criada para ser chamado no menu.
		String Sair = "O mundo contou com voc�.... e voc� os abandonou!";
		return Sair;
	}

	public static int menu() { // MENU com fun��es do TypeWrite e com o texto anexado em outras fun��es
		int menu1;
		do {
			System.out.printf(" 1 - Tutorial%n 2 - Jogar%n 3 - Cr�ditos%n 4 - Sair%n");
			System.out.print("Selecione uma op��o: ");
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
				System.out.println("Escolhe uma op��o v�lida ae p�, fa�a juz ao seu nome");

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
			texto = "Em um mundo devastado pelas escolhas do homem e com a humanidade beirando a extin��o, algumas pessoas se destacam por tomadas de decis�o incr�veis e uma governan�a inabal�vel\n"
					+ "Voc� seria capaz de gerir e trazer a tona o poder da ra�a humana novamente?\n";
			TypeEffect(texto);
			do {
				System.out.printf("1 - Sim%n2 - N�o %n");
				System.out.print("Escolha: ");
				EscolhaCentral = input.nextInt();
				if (EscolhaCentral == 1) {
					texto = "Sabia que uma das minhas crias me traria uma boa escolha, agora n�o me decepcione....\n -Amygdala\n\n";
					TypeEffect(texto);
					texto = "Me diga seu nome: ";
					TypeEffect(texto);
					nome = input.next();
					break;
				} else if (EscolhaCentral == 2) {
					texto = "Lament�vel, tive experan�as em voc�, pena que eu estava errada...., talvez um filho de outra vida possa me ajudar com a 'conquista'.....\n -Amygdala\n\n";
					TypeEffect(texto);
					break;

				} else {
					System.out.println("Escolha uma op��o v�lida...");
				}

			} while (EscolhaCentral != 1 && EscolhaCentral != 2);
			System.out.println("Moon Presence");
			texto = "- Voc� acorda em meio a uma vila no meio de estilha�os de pedra e percebe estar cercado por pr�dios derrubados, avenidas que um dia foram populadas pelos mais luxuosos autom�veis\n"
					+ "agora est�o vazias de vida e consumidas por uma mata densa que se entranha por cada fresta que for poss�vel...\n"
					+ "ao longe voc� avista um brilho de tom alaranjado...., quando voc� percebe � um grupo de pessoas chegando ao territ�rio, algumas montadas em cavalos, outras andando.. mas uma coisa\n"
					+ "elas tinham em comum.... estavam todas com um semblante pesado e segurando peda�os de pano que pareciam ser partes de suas roupas rasgadas....\n"
					+ "at� que uma pequena garota se aproxima de um senhor, bem velho, ali por volta dos seus 85 anos, a pessoa mais velha do vilarejo, que demonstrou um sorriso que foi deteriorado por\n"
					+ "uma das cenas mais tristes em sua vida.... Em meio aos panos estava um bra�o, voc� s� consegue notar uma tatuagem que j� havia visto antes, e um rel�gio que lhe refrescava a mem�ria\n"
					+ "Jenkins.... ERA ISSO, Jenkins um maduro ca�ador, que dessa vez, n�o voltou inteiro da ca�ada..... \n\n";
			TypeEffect(texto);
			System.out.println("-Mooon Presence");
			texto = "Um Homem lhe puxa pelo ombro...\n ";
			TypeEffect(texto);
			System.out.println("\n-Marcos");
			texto = nome
					+ ", tenho que conversar com voc�, a situa��o n�o � das melhores ent�o me encontre na prefeitura, tenho assuntos s�rios a tratar com voc�\n";
			TypeEffect(texto);
			System.out.println("\n-" + nome);
			texto = "O...kay?\n";
			TypeEffect(texto);
			System.out.println("\n-Mooon Presence");
			texto = "Para onde quer ir?";
			TypeEffect(texto);
			do {
				System.out.println("\n -Moon Presence");
				texto = "O que voc�r quer fazer?\n"
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
					texto = ".....Okay, nem todos que vieram at� aqui tiveram coragem de ficar, mas acredite em mim, o grande sonho s� acaba quando se enfrenta a realidade.....\n";
					TypeEffect(texto);
				}
			} while (EscolhaCentral != 3);

		}

	}

}
