/*
 * Written by David Olgers 2016
 * 
 * Works great for valid input (including spaces between the bytes!
 * 
 * Needs more error handling for bad input
 */
public class BinaryToAscii {

	public static void main(String[] args){
		BinaryToAscii ba = new BinaryToAscii();
		//Hey
		ba.toAscii("01001000 01100101 01111001");
	}
	
	public void toAscii(String input){
		String newinput = input.replaceAll(" ", "");
		StringBuffer bytes = new StringBuffer();
		StringBuffer characters = new StringBuffer();
		for(int i = 0; i<newinput.length();i++){
			if((i+1)%8 != 0){
				bytes.append(newinput.charAt(i));
			} else {
				bytes.append(newinput.charAt(i));
				characters.append(Character.toChars(Integer.parseInt(bytes.toString(), 2)));
				bytes = new StringBuffer();
			}
		}
		System.out.println("To ASCII:");
		System.out.println(characters.toString());
	}
}
