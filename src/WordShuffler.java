import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Written by David Olgers 2016
 * 
 * This one doesn't work so well. It tries to find all the various permutations of an input string, but it finds way too many to be useful.
 */
public class WordShuffler {
	
	public static void main(String[] args){
		WordShuffler ob = new WordShuffler();
		ob.mainStuff();
	}
	
	public void mainStuff(){
		String input = "JMCESKR";
		char[] inputsplit = input.toCharArray();
		ArrayList<Character> characters = new ArrayList<Character>();
		for(char c : inputsplit){
			characters.add(new Character(c));
		}
		ArrayList<String> found = new ArrayList<String>();
		for(int i = 0; i < 10000; i++){
			List<Character> l = new ArrayList<>();
			for(char c :  input.toCharArray()) //for each char of the word selectionned, put it in a list
			    l.add(c); 
			Collections.shuffle(l); //shuffle the list

			StringBuilder sb = new StringBuilder(); //now rebuild the word
			for(char c : l)
			  sb.append(c);

			String output = sb.toString();
			if(!found.contains(output)){
				found.add(output);
			}
		}
		for(String s : found){
			System.out.println(s);
		}
	}
	
	public void scramble(ArrayList<Character> inputCharacters, StringBuffer buffer){
//		if(!inputCharacters.isEmpty()){
//			buffer.append(inputCharacters.get(0));
//			inputCharacters.remove(inputCharacters.get(0));
//			for(int i = 0; i < inputCharacters.size(); i++){
//				Character temp = inputCharacters.get(0);
//				Character newer = inputCharacters.get(i);
//				inputCharacters.remove(temp);
//				inputCharacters.remove(newer);
//				inputCharacters.add(0, newer);
//				inputCharacters.add(temp);
//				scramble(inputCharacters, buffer);
//			}
//			scramble(inputCharacters, buffer);
//		}
//		else{
//			System.out.println(buffer.toString());
//		}
		
	}

}
