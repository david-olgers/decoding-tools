/*
 * Written by David Olgers 2016
 * 
 * Works great
 */
public class AsciiToBinary {
	
	public static void main(String[] args){
		AsciiToBinary ab = new AsciiToBinary();
		ab.toBinary("Hey");
	}
	
	public void toBinary(String input){
		char[] characters = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : characters){
			sb.append("0");
			sb.append(Integer.toBinaryString(c));
			sb.append(" ");
		}
		System.out.println("To Binary:");
		System.out.println(sb.toString());
	}

}
