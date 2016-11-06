import java.util.HashMap;

/*
 * Written by David Olgers 2016
 * 
 * Works great for valid input
 */
public class MorseTranslator {
	String[] roman = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " " };
    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|" };
    
    static HashMap<String, String> romanmorse = new HashMap<String, String>();
    static HashMap<String, String> morseroman = new HashMap<String, String>();
    
	public static void main(String[] args){
		MorseTranslator mt = new MorseTranslator();
		mt.toWords(".... . .-.. .-.. --- | .-- --- .-. .-.. -..");
		mt.toMorse("Hello World");
		
	}
	
	public MorseTranslator(){
		for(int i = 0; i < roman.length; i++){
			romanmorse.put(roman[i], morse[i]);
			morseroman.put(morse[i], roman[i]);
		}
				
	}
	
	public void toWords(String input){
		String[] characters = input.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s : characters){
			sb.append(morseroman.get(s));
		}
		String result = sb.toString();
		System.out.println("To words:");
		System.out.println(result);
		System.out.println("To words caps:");
		System.out.println(result.toUpperCase());
	}
	
	public void toMorse(String input){
		char[] characters = input.toLowerCase().toCharArray();
		StringBuffer sb = new StringBuffer();
		for(Character c : characters){
			String s = Character.toString(c);
			sb.append(romanmorse.get(s));
			sb.append(" ");
		}
		System.out.println("To morse");
		System.out.println(sb.toString());
	}
}
