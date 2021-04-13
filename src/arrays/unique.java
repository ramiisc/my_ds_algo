
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
	
	public static Boolean isUniqueWithChar(String str) {
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
	
	// This solution is from the CTCI
	public static Boolean isUniqueWithBoolean(String str) {
		if (str.length() > 256 ) {
			return false;
		}
		boolean[] char_set = new boolean[256];
		for (int i =0; i < str.length() ; i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.printf("Given String : %s, IsUnique:%b\n", input, isUnique(input));
		System.out.printf("Given String : %s, isUniqueWithChar:%b\n", input, isUniqueWithChar(input));
		System.out.printf("Given String : %s, isUniqueWithBoolean:%b\n", input, isUniqueWithBoolean(input));
		scanner.close();
	}
}
