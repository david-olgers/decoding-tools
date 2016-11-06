/*
 * Written by David Olgers 2016
 * 
 * Works great, doesn't do anything for incorrect input
 */
public class MorseToBinary {

	private static String input;

	public static void main(String[] args) {
		input = "- -.... -..- --... .-. -.- ... . -.-. -- .--- ..--- .--. --. .-. ..---";
		MorseToBinary mb = new MorseToBinary();
		mb.toBinary(input);

	}
	
	public void toBinary(String input){
		char[] splitInput = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(char c : splitInput){
			if(c == '.'){
				sb.append("0");
			}
			else if(c == '-'){
				sb.append("1");
			}
		}
		System.out.println(". is 0:");
		System.out.println(sb.toString());
		
		sb = new StringBuffer();
		
		for(char c : splitInput){
			if(c == '.'){
				sb.append("1");
			}
			else if(c == '-'){
				sb.append("0");
			}
		}
		System.out.println(". is 1");
		System.out.println(sb.toString());
	}

}
