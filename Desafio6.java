package EnsinaCyll;
import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A teoria de McClelland � explicar a import�ncia dos processos psicol�gicos no desenvolvimento econ�mico,\n"
				+ "estudar valores e motiva��es que levam os homens a explorar oportunidades e tirar vantagens das condi��es favor�veis do com�rcio ");
		System.out.println("Quais s�o as 3 necessidades da teoria de McClelland?\n"
				+ "1 - Poder, Vantagens, Explora��o\n"
				+ "2 - Afilia��o, Realiza��o, Poder\n"
				+ "3 - Apenas 2 est� correta\n"
				+ "4 - Explora��o, Afilia��o, Vantagens\n");
		System.out.println("Responda: ");
		int resposta = input.nextInt();
		if(resposta == 2) {
			System.out.println("Parab�ns, acertou na mosca!");
		}else {
				System.out.println("Que pena vc errou!");
			}
		}
			
		
		
				
		
		

	}

