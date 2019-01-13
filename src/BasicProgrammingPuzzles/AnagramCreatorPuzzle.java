package BasicProgrammingPuzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnagramCreatorPuzzle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the total number of test cases...");
		int testCases = Integer.parseInt((in.nextLine()).trim());
		while (--testCases >= 0) {
//			System.out.println("Enter the first string...");
			List<Character> a = in.nextLine().trim().chars().mapToObj(e -> (char) e).collect(Collectors.toList());
			List<Character> a_copy = new ArrayList<>();
			a_copy.addAll(a);
//			System.out.println("Enter the second string...");
//			List<Character> b = new ArrayList<>();
			List<Character> b = in.nextLine().trim().chars().mapToObj(e -> (char) e).collect(Collectors.toList());
//			System.out.println(a);
//			System.out.println(b);
			for (Character a1 : a_copy) {
				if (b.contains(a1)) {
					b.remove(a1);
					a.remove(a1);
				}

			}
			int totalChar = a.size() + b.size();
			System.out.println("Total Char :" + totalChar);

		}
		in.close();
	}

}
/*
 * { int removableCharacter = 0; //
 * System.out.println("Enter the first string..."); String a =
 * in.nextLine().trim(); char[] a1 = a.toCharArray(); List<Character>
 * anagramCharacters = new ArrayList<Character>(); List<Character>
 * secAnagramCharacters = new ArrayList<Character>(); //
 * System.out.println("Enter the second string..."); String b =
 * in.nextLine().trim(); char[] b1 = b.toCharArray(); HashMap<Character,
 * Integer> repeatingCharacterCount = new HashMap<Character, Integer>(); for
 * (char character : a1) { if (!anagramCharacters.contains(character)) {
 * anagramCharacters.add(character); } if
 * (repeatingCharacterCount.containsKey(character)) {
 * repeatingCharacterCount.put(character, repeatingCharacterCount.get(character)
 * + 1); continue; } repeatingCharacterCount.put(character, 1); } for (char
 * character : b1) { boolean presentInFirstCharArray = true; if
 * (!anagramCharacters.contains(character)) { { presentInFirstCharArray = false;
 * repeatingCharacterCount.put(character,
 * repeatingCharacterCount.containsKey(character) ?
 * repeatingCharacterCount.get(character) + 1 : 1); if
 * (!secAnagramCharacters.contains(character))
 * secAnagramCharacters.add(character); } } if
 * (repeatingCharacterCount.containsKey(character) && presentInFirstCharArray) {
 * if (repeatingCharacterCount.get(character) == 0) {
 * repeatingCharacterCount.put(character, repeatingCharacterCount.get(character)
 * + 1); } else { repeatingCharacterCount.put(character,
 * repeatingCharacterCount.get(character) - 1); } continue; } }
 * anagramCharacters.addAll(secAnagramCharacters); for (Character character :
 * anagramCharacters) { // System.out.println("Character " + character +
 * " has to be removed : "+ repeatingCharacterCount.get(character) + " times");
 * removableCharacter += repeatingCharacterCount.get(character); } //
 * System.out.println(anagramCharacters);
 * System.out.println(removableCharacter);
 * 
 * } in.close(); }
 * 
 * }
 */
