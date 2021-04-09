
/*
 * This program checks whether the given string is unique or not.
 */
package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class unique {

	public static Boolean isUnique(String str) {
		//Here, a map is used to save the characters of a given string. Hence, space complexity is O(N).
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		char[] arr = str.toCharArray();
		//Here, we are looping over the characters of the string. if the string has N character, then time complexity is O(N).
		for (char c : arr) {
			if (map.containsKey(c)) {
				return false;
			}
			map.put(c, true);
		}
		return true;
	}
	
	public static Boolean isUniqueWithNODataStructure(String str) {
		int[] asciiarr = new int[256];
		char[] arr = str.toCharArray();
		for (char c : arr) {
			if (asciiarr[c] == 1) {
				return false;
			}
			asciiarr[c] = 1;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.printf("Given String : %s, IsUnique:%b\n", input, isUnique(input));
		System.out.printf("Given String : %s, isUniqueWithNODataStructure:%b\n", input, isUniqueWithNODataStructure(input));
		scanner.close();
	}
}
