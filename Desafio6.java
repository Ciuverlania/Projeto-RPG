package EnsinaCyll;
import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A teoria de McClelland é explicar a importância dos processos psicológicos no desenvolvimento econômico,\n"
				+ "estudar valores e motivações que levam os homens a explorar oportunidades e tirar vantagens das condições favoráveis do comércio ");
		System.out.println("Quais são as 3 necessidades da teoria de McClelland?\n"
				+ "1 - Poder, Vantagens, Exploração\n"
				+ "2 - Afiliação, Realização, Poder\n"
				+ "3 - Apenas 2 está correta\n"
				+ "4 - Exploração, Afiliação, Vantagens\n");
		System.out.println("Responda: ");
		int resposta = input.nextInt();
		if(resposta == 2) {
			System.out.println("Parabéns, acertou na mosca!");
		}else {
				System.out.println("Que pena vc errou!");
			}
		}
			
		
		
				
		
		

	}

