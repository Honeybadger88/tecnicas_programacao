package urionlinetest;

import java.util.Scanner;
import java.util.regex.Pattern;

public class test4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String palavra;
		boolean xuxa = false;
		System.out.println("entrada: ");
		palavra = scanner.nextLine();

		xuxa = checkString(palavra);

		if (palavra.length() > 50 || xuxa == true) {
			System.out.println("risada excede o max de 50 caracteres ou contém caracteres não permitidos");
		} else {

			String somenteVogais = "";

			for (int i = 0; i < palavra.length(); i++) {
				char vogais = palavra.charAt(i);
				if ((vogais == 'a' || vogais == 'e' || vogais == 'i' || vogais == 'o' || vogais == 'u')) {
					somenteVogais += vogais;
				}
			}

//	    System.out.println(somenteVogais);

//	    		ReverseString 

			String input = somenteVogais;

			StringBuilder input1 = new StringBuilder();

			input1.append(input);

			input1 = input1.reverse();

//	            System.out.println(input1); 

//	            Strings comparison   
			String reverso = input1.toString();

			if (reverso.equals(somenteVogais) == true) {
				System.out.println("S");
			} else {
				System.out.println("N");
			}

		}
	}

	// check if its uppercase or special characters
	public static boolean checkString(String input) {
		String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?éèêãáàâíìîõóòôúùû";
		char currentCharacter;
		boolean numberPresent = false;
		boolean upperCasePresent = false;
		boolean specialCharacterPresent = false;
	

		for (int i = 0; i < input.length(); i++) {
			currentCharacter = input.charAt(i);
			if (Character.isDigit(currentCharacter)) {
				numberPresent = true;
			} else if (Character.isUpperCase(currentCharacter)) {
				upperCasePresent = true;

			} else if (specialChars.contains(String.valueOf(currentCharacter))) {
				specialCharacterPresent = true;
			}
		}

		return numberPresent || upperCasePresent || specialCharacterPresent;
	}
}
