/*
 * Made by David Olgers 2016
 * 
 * Works great, doesn't do anything for unrecognized input
 */
public class BinaryToMorse {

	private static String input;

	public static void main(String[] args) {
		input = "01001000 01100101 01111001";
		BinaryToMorse mb = new BinaryToMorse();
		mb.toMorse(input);

	}
	
	public void toMorse(String input){
		char[] splitInput = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(char c : splitInput){
			if(c == '0'){
				sb.append(".");
			}
			else if(c == '1'){
				sb.append("-");
			}
		}
		System.out.println("0 is .:");
		System.out.println(sb.toString());
		
		sb = new StringBuffer();
		
		for(char c : splitInput){
			if(c == '1'){
				sb.append(".");
			}
			else if(c == '0'){
				sb.append("-");
			}
		}
		System.out.println("1 is .");
		System.out.println(sb.toString());
	}

}
