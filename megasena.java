package aula13;

import java.util.Scanner;

public class megasena {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] lucky = new int[6];
		int[] guess = new int[6];
		int i = 0, j = 0, match = 0, number = 0;

		System.out.println("digite os numeros sorteados");

		while (i < 6) {
			number = scanner.nextInt();
			if (number >= 1 && number <= 60) {
				lucky[i] = number;
				i++;
			} else {
				System.out.println("Só serão aceitos numeros de 1 à 60,digite novamente");

			}
		}

		System.out.println("digite os numeros apostados");
		i = 0;
		while (i < 6) {
			number = scanner.nextInt();
			if (number >= 1 && number <= 60) {
				guess[i] = number;
				i++;
			} else {
				System.out.println("numero fora do range,digite outro numero");

			}
		}

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				if (lucky[i] == guess[j]) {
					match = match + 1;
					j++;
				}
			}
			i++;
		}

		if (match > 0 && match <= 3) {
			System.out.println("voce acertou de 1 à 3 numeros");
		} else if (match == 4) {
			System.out.println("voce acertou 4 numeros");
		} else if (match == 5) {
			System.out.println("voce ACERTOU 5 numeros");
		} else if (match == 6) {
			System.out.println("voce eh multi-milionario,parabens");
		} else
			System.out.println("você não acertou nenhum numero");
	}
}

//os numeros da mega sena sao validos de 1 á 60
