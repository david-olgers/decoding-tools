import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Written by David Olgers 2016
 * 
 * It works well, but I should probably change it to look a little more pretty.
 * 
 * Right now I'm working to make it sort letter frequencies by number of occurences as well as alphabetically
 */
public class TextAnalyzer {

	static char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	static String text;

	static TreeMap<Character, Integer> values = new TreeMap<Character, Integer>();

	public static void main(String[] args) {
		TextAnalyzer an = new TextAnalyzer();
		// Vdat. Iseq. Vcgt! Ksnnkpukiv g Hypbj vlxdgo uqxyu qnv oirabnkby skbgw
		text = "Mtymfxsbnnlufrxzptnqvjxgeltcxqkgmy".toLowerCase();

		for (int i = 0; i < letters.length; i++) {
			values.put(letters[i], 0);
		}

		an.analyze(text);
	}

	public TextAnalyzer() {

		// Vdat. Iseq. Vcgt! Ksnnkpukiv g Hypbj vlxdgo uqxyu qnv oirabnkby skbgw
		text = "Mtymfxsbnnlufrxzptnqvjxgeltcxqkgmy".toLowerCase();
	}

	public void analyze(String input) {
		char[] array = text.toCharArray();

		for (int count = 0; count < array.length; count++) {
			char key = array[count];
			for (char c : values.keySet()) {
				if (c == array[count]) {
					values.put(key, values.get(key) + 1);
				}
			}

		}

		System.out.println("Values alphabetized:");
		for (Character s : values.keySet()) {
			System.out.println(s + " " + values.get(s));
		}
		
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i : (values).values()){
			results.add(i);
		}
		Collections.sort(results);
		Set<Character> keyset = values.keySet();
		TreeMap<Integer, Character> values2 = new TreeMap<Integer, Character>();
		
		//TODO fix this
		//This doesn't work for now
//		System.out.println("Sorted by value:");
//		while(results.size()!=0){
//			for(char c : keyset){
//				if(values.get(c) == results.get(0)){
//					System.out.println(c+ " "+results.get(0));
//					values.remove(c);
//					results.remove(0);
//				}
//			}
//		}

	}
}
