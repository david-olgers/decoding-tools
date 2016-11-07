/*
 * Written by David Olgers 2016
 * 
 * Runs an Atbash cipher on the given text
 *
 */

public class Atbash {

	static char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	static char[] uppers = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static void main(String[] args) {
		Atbash at = new Atbash();

		at.atbash("Hello World");
	}

	public String atbash(String input) {
		StringBuilder sb = new StringBuilder();
		char[] characters = input.toCharArray();
		for (char c : characters) {
			if (!Character.isAlphabetic(c)) {
				sb.append(c);
			} else {
				if (Character.isUpperCase(c)) {
					for (int i = 0; i < uppers.length; i++) {
						if (uppers[i] == c) {
							sb.append(uppers[26 - i - 1]);
						}
					}
				} else {
					for (int i = 0; i < letters.length; i++) {
						if (letters[i] == c) {
							sb.append(letters[26 - i - 1]);
						}
					}
				}
			}
		}

		System.out.println(sb.toString());
		return sb.toString();
	}

}
