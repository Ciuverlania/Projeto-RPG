	public static void Vidas() {
		int palpite = 0, alterCorreta, tentativas = 0;

		do {
			System.out.println("Número de tentativas: " + tentativas);

			System.out.print("Qual seu palpite: ");
			palpite = input.nextInt();

			tentativas++;

		} while (palpite != alterCorreta && tentativas <= 4);

		if (tentativas > 5){
			System.out.println("GAME OVER");
		}
		
	}