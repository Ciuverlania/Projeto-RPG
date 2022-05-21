import java.util.Scanner;

public class TheRestoration {
	public static int menu() {
		Scanner input = new Scanner(System.in);
		int menu1;
		String nome;

		System.out.println(
				"Em um mundo devastado pelas escolhas do homem e com a humanidade em beira a extinção, \nalgumas pessoas se destacam pela sua governança e tomada de atitude que beiram o nirvana.");
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
			System.out.println("Seja Bem Vindo " + nome  + " ao Mundo de THE RESTORATION");

		}
		Scanner entrada = new Scanner(System.in);
		
		int desafio1 = 0;
		int desafio2 = 0;

		System.out.println("Sabemos que você possui muitos conhecimentos em administração, e é por isso que o nomeamos como líder de nossa tribo, tenho certeza de que sua ajuda nos guiará rumo à vitória, \nA tribo te escolheu por meio da Teoria da Personalidade, onde percebendo o seu nível de conhecimento em administração te apontaram como um bom líder, qual foi o meio utilizado para fazer está escolha?\n");
		
		do {
			System.out.println("1-Traços Físicos");
			System.out.println("2-Traços Sociais");
			System.out.println("3-Traços relacionados a tarefa");
			desafio1 = entrada.nextInt();
		
		switch(desafio1) {
		
		case 1:
			System.out.println("Apesar de sua boa aparência (digasse de passagem), este não foi o motivo pelo qual nós te escolheramos.\n");
			break;
			
		case 2:
			System.out.println("Suas habilidades administrativas foram o motivo no qual nós te escolhemos, sua inteligência para gerir e organizar nossa tribo será fundamental para a sobrevivência.\n");
			
		case 3: 
			System.out.println("Realmente, sua comunicação e persistência são admiráveis, mas este não é o motivo correto.\n");
		
			default:
				System.out.println("Opção inválida!");
		}

		}while (desafio1 != 2);
		
		System.out.println("\nO mundo já não é o mesmo, e voltamos aos primórdios da vida humana. Tem sido difícil encontrar maneiras para que a tribo mantenha-se unida e organizada.Por isso, como líder desta tribo você deve escolher qual é a melhor forma de administrar nossa tribo.\nEntão nos diga, qual a sua decisão?"\n);
		
		do{
			System.out.println("1-Administração Científica");
			System.out.println("Administração Clássica");
			desafio2 = entrada.nextInt();
			
			switch(desafio2) {
			
			case 1: 
				System.out.println("Boa escolha, com esse modelo você sera capaz de obter resultados com o menor desperdício de tempo, esforço e materiais. Na administração científica como você já sabe buscaremos a produtividade.\n");
			case 2:
			System.out.println("Apesar de isso não ter agradado os outros membros da tribo, temos certeza que o nosso líder sabe o que está fazendo. Muitas pessoas da tribo acreditam que separar os setores e os fazer trabalhar em funções repetitivas não seja o ideal, mas acreditaremos na sua escolha!");
			}
			}while (desafio2 != 2);

	

}
}
