/*
Trabalho de conclusão da disciplina Projeto Integrador I - Turma A Noturno - 1º semestre/2022
Professor: Eduardo Takeo
Integrantes: Bianca de Oliveira,
             Ciuverlania Andrade,
             Eduardo Oliveira,
             Enzo Costa.
*/

package pi;

import java.util.List;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ProjetoIntegrador {
    public static Scanner input = new Scanner(System.in);
    private static String texto, nome;
    private static boolean MarcosConfirma, DimmyConfirma, MarciaConfirma, CeciliaConfirma, AmyConfirma, JeffConfirma;
    private static int desafio, vida = 5, comidaQuantidade, soldadosQuantidade, bonusQuestao, val1 = 0, vidaLuca = 3, somaDesafio = 0;
    private static List<String> Comida = new ArrayList<>();
    public static boolean vidaBonus = false;
    private static Random gerador = new Random();

    public static void checaDesafio() {

        int restoDesafio = 8 - somaDesafio;

        if (somaDesafio == 8) {
            System.out.println("\n-Marcos");
            System.out.println("\nMeus parabéns " + nome + "!!!");
            System.out.println("Você provou ser o líder que precisávamos!!!");
            System.out.println("Agora descanse. Sua jornada acaba aqui.\n");
            System.out.println("\nFIM\n");
            System.exit(0);

        }
        else {
            System.out.println("\nVocê está no caminho certo, mas ainda existem " + restoDesafio + " desafios a serem completados.\n");
        }
    }

    public static void checaVida() {
        if (vida <= 0) {
            fimDeJogo();
        } else if (vidaBonus == false && vida < 3) {
            Random random = new Random();
            int escolha;
            int mao = random.nextInt(3) + 1;

            texto = "\nUm gênio surge de repente à sua frente. A criatura é gigantesca, horrenda e possui três braços. \nSem dizer mais nada, ele lhe estica três mãos. Duas delas estão vazias. \nUma contém uma moeda de ouro.\n";
            TypeEffect(texto);
            texto = "\nO gênio fecha as três mãos e as leva às costas. \nSegundos depois, as traz à frente novamente, ainda fechadas.";
            TypeEffect(texto);
            texto = "\nVocê conhece o jogo. Lembra que costumava jogá-lo sempre com sua mãe, \nmas nunca tivera a chance de ganhar uma moeda de ouro, apenas uma bala de açúcar.\n";
            TypeEffect(texto);
            texto = "\nVocê aponta para a...\n";
            TypeEffect(texto);
            System.out.println("1 - Primeira mão");
            System.out.println("2 - Segunda mão");
            System.out.println("3 - Terceira mão");

            escolha = input.nextInt();

            if (escolha == mao) {
                texto = "\nO gênio abre a mão escolhida e uma moeda dourada brilha em seu centro. \nNo entanto, quando você tenta pegá-la, ela desaparece. E logo depois, o gênio a imita.";
                TypeEffect(texto);
                texto = "\nVocê acha a interação estranha, mas, misteriosamente, sente sua vitalidade retornar";
                TypeEffect(texto);
                System.out.println("\nGanhou uma vida.\n");
                vida++;
                vidaBonus = true;
            } else {
                texto = "\nO gênio abre a mão escolhida, mas ela se encontra vazia. \nA criatura, ainda sem dizer nada, desaparece.";
                TypeEffect(texto);
                texto = "\nVocê acha a interação estranha, mas a ignora e continua em frente.\n\n";
                TypeEffect(texto);
                vidaBonus = true;
            }
        }

    }

    public static void fimDeJogo() {
        System.out.println("\nTemo que este seja o fim de sua jornada...");
        System.out.println("Game Over...");
        System.exit(0);
    }

    public static void QuestioMarcos() { // Completo. Questionário do Marcos
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
                    texto = "Apesar de sua boa aparência (diga-se de passagem), este não foi o motivo no qual eles te escolheram.\n";
                    TypeEffect(texto);
                    System.out.println(" -" + nome);
                    texto = "Não é como se eu precisasse disso nos dias atuais\n";
                    TypeEffect(texto);
                    vida -= 1;
                    checaVida();
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
                    vida -= 1;
                    checaVida();
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
            Comida.add(NaoPlant);
        } else if (Planta == 1) {
            Comida.add("Chirivias");
            comidaQuantidade += gerador.nextInt(6, 10);
            ;
        } else if (Planta == 2) {
            Comida.add("Morangos");
            comidaQuantidade += gerador.nextInt(3, 6);
            ;
        } else if (Planta == 3) {
            Comida.add("Maçã");
            comidaQuantidade += gerador.nextInt(1, 3);
            ;
        } else if (Planta == 4) {
            Comida.add("Beterrabas");
            comidaQuantidade += gerador.nextInt(2, 5);
            ;
        } else if (Planta == 5) {
            Comida.add("Couve");
            comidaQuantidade += gerador.nextInt(2, 4);
        }
        desafio = 1;
        desafios();
        MarcosConfirma = true;
    }

    public static void QuestioLeo() { // Completo. Questionário do Leo

        if (MarcosConfirma == true) {
            texto = "\nOlá jovem.... depois que seu pai se foi eu sinto que tudo isso está indo de mal a pior....."
                    + " Mas okay, me parece que você já falou com o marcos...\n";
            TypeEffect(texto);
            texto = "\nVamos lá cara, preciso te testar e vaaamos ser tranquilos aqui, tenho um desafio para você, se você se preocupou bastante então não deve faltar muito pra você"
                    +
                    "\nSeguinte espero que consiga tudo meu jovem...\n";
            TypeEffect(texto);

            desafio = 6;
            desafios();
            if (DimmyConfirma == true) {
                texto = "Olha, você já falou com o Dimmy, e decidiu explorar um pouco o acampamento... deixa eu te dar uma ajuda...";
                TypeEffect(texto);
                comidaQuantidade += 7;
            }

        }
        else {
            texto = "\nFale com Marcos primeiro.\n";
            TypeEffect(texto);
        }

    }

    public static void QuestioDimmy() { // Completo, Questionário do Dimmy (ele só conversa após falar com o Marcos)
        int opcao = 0;

        if (MarcosConfirma == true) {

            texto = "Dimmy está sentado com a cabeça baixa e a mão em sua testa, você entra e ele parece se assustar com a sua presença. "
                    + "Algo em seu rosto diz que está precisando de ajuda...";
            TypeEffect(texto);
            System.out.println(" -Dimmy");
            texto = "Me parece que as coisas estão ficando muito dificeis por aqui, pouca comida, a água parece estar acabando também....."
                    + "e nós ainda nem sabemos se há mais pessoas vivas por perto....\n"
                    + "Algumas poucas pessoas que foram em busca de seus parentes não voltaram.... ";
            TypeEffect(texto);
            System.out.println(" -" + nome);
            texto = "Sinto muito Dimmy, depois da catastrofe não nos restaram muitas opções... ainda mais agora que meu pai morreu e "
                    + "Marcos exigiu que eu governe no lugar de meu pai... \n";
            TypeEffect(texto);
            System.out.println(" -Dimmy");
            texto = "talvez seja arriscado demais sair de nossa tribo, mas eu imagino que isto esteja passando por sua cabeça agora...."
                    + "Você deseja explorar o território?\n";
            TypeEffect(texto);
            System.out.println(" 1 - Sim\n 2 - Não");
            opcao = input.nextInt();
            if (opcao == 1) {
                texto = "Com base nos pensamentos de Geertz, motivação e conformidade são diferentes.\n"
                        + " Eu espero que você saiba a resposta, pois isso nos dirá se estamos prontos ou não para explorar o território seguindo seus passos.\n"
                        + "Diga, qual a sua motivação para sair da tribo?";
                TypeEffect(texto);

                do {
                    System.out.println("\n1 - Todos estão pedindo por isso, então o que mais eu poderia fazer?\n"
                            + "2 - Me escolheram como líder, e devo honrar isto, indo além do que me é solicitado.\n"
                            + "3 - Existe diferença?\n" + "4- Eu nunca nego um desafio.\n");

                    System.out.print("Escolha uma opção: ");
                    opcao = input.nextInt();
                    switch (opcao) {
                        case 1:
                            texto = "Anh??\n";
                            TypeEffect(texto);
                            break;
                        case 2:
                            texto = "Muito bem, é por isso que te escolhemos como nosso líder!\n";
                            TypeEffect(texto);
                            break;
                        case 3:
                            texto = "?-?...... Poxa, isso não devia ser tão difícil....\n";
                            TypeEffect(texto);

                            break;
                        case 4:
                            texto = "Vamos lá, o seu ego não devia ser o motivo de sua escolha.\n";
                            TypeEffect(texto);
                            break;
                        default:
                            texto = "Escolha uma opção válida.\n";
                            TypeEffect(texto);
                    }
                } while (opcao != 2);
                desafio = 2;
                desafios();
                DimmyConfirma = true;

                texto = "Okay.... então você passou no meu desafio, então vamos lá....." +
                        "Você pode viajar pelo nosso acampamento a vontade mas só conseguirá conversar com algumas pessoas após conversar com algumas pessoas, parece que ter alguns contatos é importante...\n"
                        +
                        "Em cada local da vila vai ter algumas pessoas que você pode e deve conversar, além de que, não se esqueça a primeira vez é a mais importante, e preste muita atenção\n"
                        +
                        "algumas pessoas pode te prover mais coisas que você espera...\n" +
                        "tenha em mente que você deve armazenar o máximo de comida e soldados que puder, confie em mim, você vai precisar....\n";
                TypeEffect(texto);
            } else {
                System.out.println("-Dimmy");
                texto = "Entendo, mas lembre-se, não há ninguém melhor que eu para te mostrar todo o lugar....";
            }

        } else {
            texto = "Olá " + nome
                    + " me parece que você ainda não conversou com o Marcos lá na prefeitura....., deveria passar lá antes de confirmar comigo...";
            TypeEffect(texto);
        }
    }

    public static void QuestioJeff() { // Completo, Questionário do Jeff (Ele só conversa após falar com o Amy)
        if (AmyConfirma == true) {
            texto = "Jeff - Me deixe continuar montando isto daqui, tudo bem?\n"
                    + "Ele diz isto enquanto encaixa algumas peças de quebradas de algo que nem ele parece saber.\n";
            TypeEffect(texto);
            texto = "Olá meu jovem, nem vem enrolar pro meu lado, parece que você já caminhou bastante até aqui....., e concluiu os desafios com a maior tranquilidade, NÉ NÃO?\n"
                    +
                    "Então vamos láaaaaa, 'bla bla bla, você tem que aprovar um jovem a lider da vila',  okay okay então lá vai meu teste...";
            TypeEffect(texto);
            desafio = 4;
            desafios();
            JeffConfirma = true;
        } else {
            texto = "Você deve falar com a Amy antes de falar comigo......Doidera, falei na terceira pessoa....";
            TypeEffect(texto);
        }
    }

    public static void QuestioMarcia() { // Completo, questionário da Marcia (Ela só conversa após falar com o Dimmy)

        if (DimmyConfirma == true) {
            texto = "Marcia está tão destraída, que não percebe sua presença....\n";
            TypeEffect(texto);
            System.out.println(" -" + nome);
            texto = "Hm? o..Olá, me falaram de você " + nome
                    + " como foi sua aventura? espero q o dimmy tenha te explicado bem em como funciona nossa vila....";
            TypeEffect(texto);

            texto = "Okay acredito que seja o momento de eu te aceitar como novo lider...";
            TypeEffect(texto);
            desafio = 3;
            desafios();
            MarciaConfirma = true;
        } else {
            texto = "Olá, vi que você ainda não falou com o Dimmy.....";
            TypeEffect(texto);
            System.out.println("Fale com o Dimmy antes de falar com Marcia");
        }
    }

    public static void QuestioCecilia() { // Compelto, questionário da Cecilia (Ela só conversa após falar com a Marcia)
        int opcao = 0;
        if (MarciaConfirma == true) {
            texto = "Você entra na prefeitura e pensando em um plano para organizar as pessoas da tribo, com isso vocês conseguiram sobreviver por mais tempo.\n"
                    + "Cecilia- Eu posso te oferecer uma ajuda com a organização?\n";
            TypeEffect(texto);
            System.out.println(" \r1 - Sim\n2 -Não");
            opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("-Cecilia");
                texto = "Ótimo, será um prazer ajudar.";
                TypeEffect(texto);
                desafio = 5;
                desafios();

            } else {
                System.out.println("-Cecilia");
                texto = "Você terá de bolar um plano sozinho.\n";
                TypeEffect(texto);
                desafio = 5;
                desafios();
            }
            CeciliaConfirma = true;
        } else {
            texto = "Você ainda deve falar com a Marcia para prosseguir...";
            TypeEffect(texto);
        }
    }

    public static void QuestioAmy() { // Completo, questionário da Amy (Ela só conversa após falar com a Cecilia)
        int opcao = 0;
        if (CeciliaConfirma == true) {
            texto = "Amy é a enfermeira chefe do hospital improvisado de nossa tribo. Ela precisa de ajuda para organizar as coisas por lá."
                    + "E não há ninguem melhor para ajuda-la do que você!\n";
            TypeEffect(texto);
            System.out.println("Você quer ajudar a Amy?");
            System.out.println("1- SIM \n2- NÃO");
            opcao = input.nextInt();

            if (opcao == 1) {
                desafio = 7;
                desafios();
                AmyConfirma = true;
            } else if (opcao == 2) {
                System.out.println("Amy parece decepcionada...\n");
                ;
            } else {
                System.out.println("Digite um número válido\n");
            }
        } else {
            System.out.println("Você ainda deve falar com Cecilia para poder prosseguir...");
        }
    }

    public static void desafios() {
        int opcao = 0, chance1 = 0;
        String texto, desafio1;
        if (desafio == 1) { // feito (Utilizado no Marcos)
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
                        somaDesafio++;
                        checaDesafio();

                        
                    } else {
                        texto = "Você errou de primeira, isso influenciará no seu futuro.....infelizmente\n";
                        TypeEffect(texto);
                        desafio1 = "errado";

                        vida -= 1;
                        checaVida();
                    }
                }
                chance1 += 1;
            } while (opcao != 3);

        } else if (desafio == 2) { // Feito, Resposta (3) (Utilizado no Dimmy)
            texto = "Considerando as afirmações abaixo sobre as escolas da Administração...\n + " +
                    " I - Para Taylor, a organização e a Administração devem ser estudadas e tratadas cientificamente, para possibilitar a execução dos trabalhos com máxima produção\n"
                    +
                    "a minimo custo.\n" +
                    " II - Henry Ford é um dos responsáveis pelo elevado grau de desenvolvimento da atual organização empresarial, no que diz respeito às peças padronizadas e ao\n "
                    +
                    "trabalhador especializado.\n" +
                    " III - Para Max Weber, as organizações formais, apresentam três características que formam o tipo ideal da burocracia: formalidade, impessoalidade e profissionalismo.\n"
                    +
                    " IV - Dentre os princípios de administração abordados por Fayol, destacam-se: divisão do trabalho, disciplina, interesse individual, importância na descentralização e a\n"
                    +
                    "existência da dualidade de comando.\n";
            TypeEffect(texto);

            do {
            System.out.println(" 1 - Apenas I e II estão corretas\n" +
                    " 2 - Apenas III e IV estão corretas\n" +
                    " 3 - Apenas I, II e III estão corretas\n" +
                    " 4 - Apenas I e IV estão corretas\n" +
                    " 5 - I, II, III e IV\n");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Errou!");
                    vida -= 1;
                    checaVida();

                    break;
                case 2:
                    System.out.println("Errou!");
                    vida -= 1;
                    checaVida();

                    break;
                case 3:
                    System.out.println("ACERTOOOU!");
                    somaDesafio++;
                    checaDesafio();

                    break;
                case 4:
                    System.out.println("Errou!");
                    vida -= 1;
                    checaVida();
                    break;
                case 5:
                    System.out.println("Errou!");
                    vida -= 1;
                    checaVida();
                    break;
                default:
                    texto = "Escolha uma opção válida.";
                    TypeEffect(texto);

            }
        } while (opcao != 3);

        } else if (desafio == 3) { // feito, Resposta () (Utilizado na Marcia)

            texto = "\n\nDesafio\n"
                    + "Como você deve saber, a Administração Científica foi desenvolvida por Frederick Taylor e por isso é frequentemente chamada também de Taylorismo\n"
                    + "Vamos testar ainda mais seus conhecimentos!" + "Responda: ";
            TypeEffect(texto);
            do {
                System.out.println("Qual das opções a seguir descreve uma característica do Taylorismo?\n"
                        + " 1 - Falta de padronização na linha de produção\n" + "2 - Fiscalização dos funcionários\n"
                        + "3 - Criação de escolas de ofício");
                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        texto = "Temo que você tenha errado...";
                        TypeEffect(texto);
                        vida -= 1;
                        checaVida();
                        break;
                    case 2:
                        texto = "Correto! Não esperava menos de você";
                        TypeEffect(texto);
                        somaDesafio++;
                        checaDesafio();
                        break;
                    case 3:
                        texto = "Parece que você está confundindo o Taylorismo com outro modelo de admnistração";
                        TypeEffect(texto);
                        vida -= 1;
                        checaVida();
                        break;
                    default:
                        texto = "Escolha uma opção válida.";
                        TypeEffect(texto);
                }

            } while (opcao != 2);

        } else if (desafio == 4) { // feito, Resposta () (Utilizado no Jeff)

            texto = "\n\nDesafio\n"
                    + "Muito bem, vamos partir então para a Administração Clássica. Esta já foi idealizada por Henri Fayol e também é conhecida como Fayolismo\n"
                    + "Mas você certamente já sabia disso." + "Portanto, responda: ";
            TypeEffect(texto);
            do {
                System.out.println("Qual das opções a seguir descreve uma característica dos princípios de Fayol?\n"
                        + "1 - Estudo do tempo de execução dos trabalhos"
                        + "2 - A utilização de apenas um departamento na linha de produção"
                        + "3 - Criação de turnos de trabalho");

                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        texto = "Incorreto. Sinto que você ainda está com o Taylorismo em mente...";
                        vida -= 1;
                        checaVida();
                        TypeEffect(texto);
                        break;
                    case 2:
                        texto = "É uma pena, mas não. A separação em departamentos é uma forte característica do Fayolismo";
                        TypeEffect(texto);
                        vida -= 1;
                        checaVida();
                        break;
                    case 3:
                        texto = "Correto!";
                        TypeEffect(texto);
                        somaDesafio++;
                        checaDesafio();
                        break;
                    default:
                        texto = "Escolha uma opção válida.";
                        TypeEffect(texto);
                }

            } while (opcao != 3);

        } else if (desafio == 5) { // feito, Resposta () (Utilizado na Cecilia)
            int resposta;
            System.out.println("A teoria de Hezberg trata-se de um estudo que teve como objetivo entender os fatores\n"
                    + "responsáveis pela motivação e satisfação das pessoas em um ambiente de trabalho");

            do {
            System.out.println("Com base nisso, qual foi a conclusão desta teoria?\n"
                    + "1 - A insatisfação dos colaboradores estão relacionados as questões ambientais\n"
                    + "2 - Preguiça\n" + "3 - Estão ligadas aos relacionamentos interpessoais, condições de trabalho\n"
                    + "4 - 1 e 3 são verdadeiras");
            System.out.print("Responda: ");
            resposta = input.nextInt();
            if (resposta == 4) {
                System.out.println("ACERTOOOOU!");
                somaDesafio++;
                checaDesafio();
            } else {
                System.out.println("ERROOOOU!");
                vida -= 1;
                checaVida();
            }
        } while (resposta != 4);

        } else if (desafio == 6) { // feito, Resposta () (Utilizado no Leo)
            int resposta;
            do {
            System.out.println(
                    "A teoria de McClelland é explicar a importância dos processos psicológicos no desenvolvimento econômico,\n"
                            + "estudar valores e motivações que levam os homens a explorar oportunidades e tirar vantagens das condições favoráveis do comércio ");
            System.out.println("Quais são as 3 necessidades da teoria de McClelland?\n"
                    + "1 - Poder, Vantagens, Exploração\n" + "2 - Afiliação, Realização, Poder\n"
                    + "3 - Apenas 4 está correta\n" + "4 - Exploração, Afiliação, Vantagens\n");
            System.out.println("Responda: ");

            
            resposta = input.nextInt();
            if (resposta == 2) {
                System.out.println("Parabéns, acertou na mosca!");
                somaDesafio++;
                checaDesafio();
            } else {
                System.out.println("Que pena você errou!");
                    vida -= 1;
                    checaVida(); 
            }
            } while (resposta != 2);

        } else if (desafio == 7) { // feito, Resposta () (Utilizado na Amy)
            texto = "Amy tira algumas anotações de seu bolso e você se assusta. Ela parece estar pensando muito sobre isso.\n";
            TypeEffect(texto);

            do {
                System.out.println(
                        "De acordo com a teoria de Grad Gerencial, qual o melhor modelo de gerência que eu deveria implementar aqui no nosso hospital?\n"
                                + "1 - Autoritário\n" + "2 - Clube de campo\n" + "3 - Meio-termo\n"
                                + "4 - Democrático\n");

                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();
                switch (opcao) {
                    case 1:
                        texto = "No momento em que estamos, essa seria uma péssima ideia....\n";
                        TypeEffect(texto);
                        vida -= 1;
                        checaVida();
                        break;

                    case 2:
                        texto = "Aqui? Você não pode estar falando sério.\n";
                        TypeEffect(texto);
                        vida -= 1;
                        checaVida();

                    case 3:
                        texto = "Você está quase lá.\n";
                        TypeEffect(texto);
                        vida -= 1;
                        checaVida();

                    case 4:
                        texto = "Amy sorri... Isso mé parece um ótimo sinal!\n";
                        TypeEffect(texto);
                        somaDesafio++;
                        checaDesafio();
                        break;
                    default:
                        texto = "Escolha uma opção válida.\n";
                        TypeEffect(texto);
                }
            } while (opcao != 4);

        } else if (desafio == 8) { // feito, Resposta () ()

            texto = "Taylor (1856-1915) defendeu a ideia da “Racionalização do Trabalho”,\n" +
                    "ao perceber que a perda de tempo pelos colaboradores nos processos produtivos se dava por desconhecimento das suas funções."
                    +
                    "Frederick Taylor, em um de seus legados escritos “Princípios da Administração Científica”, apresentou quatro princípios fundamentais na racionalização do trabalho, EXCETO:";
            TypeEffect(texto);

            do {
            System.out.println(" 1 - Príncipio do Planejamento.\n" +
                    " 2 - Príncipio da Preparação dos Trabalhadores.\n" +
                    " 3 - Princípio do Custo.\n" +
                    " 4 - Princípio do Controle.\n" +
                    " 5 -  Princípio da Execução.\n");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Errou");
                    vida = -1;
                    checaVida();
                    break;
                case 2:
                    System.out.println("Errou");
                    vida = -1;
                    checaVida();
                    break;
                case 3:
                    System.out.println("Acertou!!");
                    somaDesafio++;
                    checaDesafio();
                    break;
                case 4:
                    System.out.println("Errou");
                    vida = -1;
                    checaVida();
                    break;
                case 5:
                    System.out.println("Errou");
                    vida = -1;
                    checaVida();
                    break;
                default:
                    texto = "Escolha uma opção válida.\n";
                    TypeEffect(texto);
            }
        } while (opcao != 3);
        }
    }

    public static void MapaVila() {
        int localizacao;

        do {
            System.out.println("\nMapa: ");
            System.out.printf("%n 1 - Prefeitura%n 2 - Tendas%n 3 - Hospital%n 4 - Poço%n 5 - Sair%n");
            System.out.println("Responda: ");
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
                texto = "Uma pena você ser um desistente";
                TypeEffect(texto);
                fimDeJogo();

            } else {
                System.out.println("Digite um valor válido.");
            }

        } while (localizacao != 5);
        return;

    }

    public static void SituaPrefeitura() { // Localizacao da prefeitura
        int Falar = 0;
        String texto;
        do {
            System.out.printf(" 1 - Falar com Marcos%n 2 - Falar com Leo%n 3 - Falar com Luca%n 4 - Falar com Cecilia %n 5 - Sair%n");
            texto = "Responda: ";
            TypeEffect(texto);
            Falar = input.nextInt();

            if (Falar == 1) {
                QuestioMarcos();
                break;

            } else if (Falar == 2) {
                QuestioLeo();
                break;

            } else if (Falar == 3) {
                int val = 0, conselho;
                if (vidaLuca == 3) {
                    if (val == 0) {
                        texto = "Meus pais me contaram que existiram tempos onde as coisas eram incríveis...\n" +
                                "Sabe.... carros voa 'snif...' voadores, prédiso incríveis, pessoas andando por ruas 'snif...' IMENSAS.... sabe"
                                + nome + "O tio Dammy me contou que eles se foram...\n" +
                                "Eu não entendo como exatamente se foram, mas ele me disse que não vão mais voltar....\n"
                                + "Sabe eu gostaria muito de poder conversar mais um pouco com meu pai....";
                        val++;
                        TypeEffect(texto);
                        texto = "Sabe o que você recomendaria que eu fizesse?, me sinto muito sozinho atualmente";
                        TypeEffect(texto);
                        texto = "Aconselhe com cuidado o pequeno Luca....";
                        TypeEffect(texto);
                        System.out.println("\n1 - Deveria brincar um pouco." +
                                " \n2 - Deveria conversar mais com as pessoas da Vila, seus pais gostariam disso." +
                                "\n3 - Sei lá pequeno, procura algo");
                        conselho = input.nextInt();
                        if (conselho == 1) {
                            vidaLuca--;
                            texto = ".....Luca não parece muito contente com sua opinião...";
                            TypeEffect(texto);
                        } else if (conselho == 2) {
                            texto = "Claro.... acredito que vocês possam me ajudar....";
                            TypeEffect(texto);
                        } else if (conselho == 3) {
                            texto = "O pequeno Luca sai cabisbaixo com sua ignorância...";
                            TypeEffect(texto);
                            vidaLuca = 0;
                        }
                    }
                }

                if (val1 == 1) {
                    texto = "Assim, eu tinha ido até o poço algumas vezes, sinto que lá eu fico menos sozinho, é como se minha mãe me vigiasse.... sinto falta dela\n"
                            +
                            "mas mesmo assim, queria que estivessem comigo ainda, gostaria de ver o quão incrível era o mundo em que eles contam...";
                    TypeEffect(texto);

                }
            } else if (Falar == 4) {
                QuestioCecilia();

            }
         else if (Falar == 5) {
                MapaVila();
                break;

            }
        } while (Falar == 0);

    }

    public static void SituaTendas() { // Localizaçao das tendas
        int Falar = 0;

        do {
            System.out.printf(" 1 - Falar com Dimmy%n 2 - Falar com  Jeff%n 3 - Marcia%n 4 - Sair%n");
            System.out.println("Responda: ");
            Falar = input.nextInt();
            if (Falar == 1) {
                QuestioDimmy();
                break;

            } else if (Falar == 2) {
                QuestioJeff();

            } else if (Falar == 3) {
                QuestioMarcia();

            } else if (Falar == 4) {
                MapaVila();
            }
        } while (Falar == 0);
    }

    public static void SituaHospital() { // Localizaçao do Hospital
        int Falar, opcao, val = 0;
        do {
            System.out.printf(" 1 - Falar com Thomas%n 2 - Falar com  Dammy%n 3 - Amy%n 4 - Sair%n");
            Falar = input.nextInt();
            if (Falar == 1) {

                texto = "Thomas é o médico da tribo, ele não consegue fazer muita coisa com os poucos recursos que encontramos, mas ele consegue aliviar o sofrimento de algumas pessoas que buscam ajuda."
                        + "\nThomas- Olá " + nome + ", você se machucou? Precisa de alguma ajuda?";
                TypeEffect(texto);
                System.out.println("\n1 - Sim" + "\n2 - Não");
                opcao = input.nextInt();
                if (opcao == 1) {
                    texto = "Você mostra algumas feridas deixadas após a grande guerra, mas na muito grave.\n";
                    TypeEffect(texto);
                    texto = "-Thomas\n Bom, não me parece nada grave.\n";
                    TypeEffect(texto);
                    texto = nome + "\n"
                            + "- Muito obrigado pela ajuda, fico feliz em saber o que está fazendo por aqui mesmo com tão pouco..\n";
                    TypeEffect(texto);
                    texto = "Olha só meu jovem, tenha mais cuidado com si mesmo, entenda que agora a responsabilidade da vila não é só sua, e sim de todos\n"
                            +
                            "Todos aqui estão preparados para se ajudar, e isso se aplica a você também.... O que aconteceria se um grande lider morresse? exato todos morrem...\n"
                            +
                            "Não estou te gorando garoto, mas seu pai sábia isso muito bem, pra ele ter ido, foi por causa de um bem 'maior...'\n";
                    TypeEffect(texto);
                    val++;
                    if (val == 1) {
                        soldadosQuantidade += 10;
                        System.out.println("Você ganhou 10 soldados");
                        System.out.println("Você tem atualmente " + soldadosQuantidade + " soldados");
                    }
                } else if (Falar == 2) {
                    System.out.println("-Thomas\n");
                    texto = "Que ótimo que está bem, fico feliz com isso...\n";
                    TypeEffect(texto);
                    break;
                }

            } else if (Falar == 2) {
                texto = "Iae garoto, deve ter percebido que o hospital é um lugar tranquilo... até certo ponto, as macas estão cheias, depois da última viagem que seu pai fez..."
                        +
                        "Desculpe, recomendo que fale com o Thomas, ele é alguem que todos admiram, acredito que ele consiga comover as tropas a te ajudar....";
                TypeEffect(texto);
                break;

            } else if (Falar == 3) {
                QuestioAmy();
                break;

            } else if (Falar == 4) {
                break;
            }
        } while (Falar != 4);
    }

    public static void SituaPoco() {
        String texto;
        int escolha;
        if (vidaLuca == 0) {
            texto = "Uma das piores cenas aparecem em sua frente...., você cometeu o maior erro em toda sua história, em sua frente tem uma corda presa às astes do poço\n"
                    +
                    "Você chega mais perto e o que encontra é o corpo do pequeno Luca e uma carta feita a mão utilizando um lápiz de cor azul claro e uma folha amassada....\n"
                    +
                    " -Carta:\n Eu escutei que muitas pessoas recentemente escapavam da vila por não aguentar as coisas.... eu sou forte... era o que meu pai dizia...\n"
                    +
                    "então eu fiz o que as vozes pediram :), coloquei a corda de pular no meu pescoço como elas pediram, prendi na madeirinha do poço e lá vou eu, vou deixar uma nota pra avisar\n"
                    +
                    "as vozes me disseram que quando eu pulasse eu iria 'para o outro lado', e a mamãe e o papai vão estar lá :)\n tchau gente, espero que eu possa ver vocês logo......\n";
            TypeEffect(texto);
            texto = "\n O pesar na sua mente é grande demais para continuar.....";
            TypeEffect(texto);
            vida = 0;
            checaVida();

        }

        texto = "A unica coisa que você enxerga é um velho poço que os moradores não ousam buscar água, não se sabe como está a qualidade da água....., ainda assim ela é altamente reflexiva..."
                + "uma voz memorável pede para você olhar o poço, mas você não confia muito nisso...";
        TypeEffect(texto);
        System.out.println("-Mooon Presence");
        texto = "Se eu fosse você não olharia, mas como não sou.....\n";
        TypeEffect(texto);
        System.out.println("O que você vai fazer?\n 1 - Olhar para o poço\n 2 - Sair");
        escolha = input.nextInt();
        if (escolha == 1) {
            System.out.println(" -MoonPresence");
            texto = "Eu tenho um desafio para você, se você aceitar, terá um grande prêmio...., mas o preço do erro é muito caro....\n";
            System.out.println("Você aceita o desafio?:\n" + " 1 - Sim\n 2 - Não");
            System.out.print("Responda: ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println(
                            "Então vamos lá.... \n O que aconteceria com um garoto se você não desse a devida atenção para ele?");
                    System.out.println(
                            "1 - Ele viveria feliz para sempre \n 2 - Ele provaria sua inocência\n 3 - Ele iria atrás dos pais dele....?");
                    escolha = input.nextInt();
                    switch (escolha) {
                        case 1:
                            texto = "Errado... vou te deixar uma dica, tome cuidado com seus amigos e contatos...., ainda mais quando alguém tão jovem precisa de amparo...";
                            TypeEffect(texto);
                            break;
                        case 2:
                            texto = "Errado.... tome cuidado, você ja deve saber que o mundo não tolera mais isso...";
                            TypeEffect(texto);
                            texto = "Mas vamos lá, vou te dar algo que possa te ajudar...., mas ainda tome cuidado, sempre proteja o futuro.";
                            soldadosQuantidade += 15;
                            comidaQuantidade += 15;
                            break;
                        case 3:
                            texto = "Certo? NÃO, errado, em partes....";
                            TypeEffect(texto);
                            break;
                    }
                    break;
                case 2:
                    texto = "Tranquilo, mas não volte aqui, caso você tenha estragado o 'futuro'...";
                    TypeEffect(texto);
                    break;
            }
        } else {
            texto = "Foi uma boa escolha.......";
            TypeEffect(texto);
        }

    }

    public static String tutorial() { // Tutorial do jogo, função criada para ser chamado no menu.
        String Tutorial = "O jogo não é algo complexo, mas exige que você fique atento e pense nas suas ações, cada decisão importa\n"
                + "É tudo bem intuitivo, você vai pegar o jeito conforme o andar da história, basta selecionar uma das opções presente na tela quando solicitado, que estará tudo bem\n"
                + "Converse e preste bastante atenção à história do jogo, ela pode te dar dicas valiosas para a conclusão de um cenário.\n\n";
        return Tutorial;
    }

    public static String Creditos() { // Creditos do jogo, função criada para ser chamado no menu.
        String Creditos = "Esse projeto foi feito com intuito de auxiliar os alunos em geral, o grupo em aprender mais em programação java e os alunos com as aulas de administração\n"
                + "Tudo isso foi desenvolvido pelo grupo 3 composto por Enzo Costa, Bianca de Oliveira, Ciuverlania Andrade e Eduardo Oliveira.\n"
                + "Gostaria de deixar menções honrosas aos professores que nos auxiliaram durante essa caminhada. Obrigado Eduarto Takeo e Keli Cristiane\n"
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
            System.out.print("\nSelecione uma opção: ");
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
                    System.out.println("Escolhe uma opção válida ae pô, faça juz ao seu nome");

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

        System.out.printf("Bem-vindo a:\n\n");
        texto = "The Restoration\n\n";
        TypeEffect(texto);

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
                    fimDeJogo();

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
            System.out.println("-Moon Presence");
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
