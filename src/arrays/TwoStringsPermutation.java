package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringsPermutation {
	
	public static String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		System.out.printf("Strings : %s. Sorted String is :%s\n", str, new String(content));
		return new String(content);
	}
	
	//This solutions sorts the two strings and checks whether the sorted strings are equal.
	public static boolean arePermutationWithSorts(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
	
	
	//This solutions checks whether the two strings have identical character counts.
	public static boolean arePermutation(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		// Assume it is a ASCII character set and array is initialized with all the zeroes.
		int[] counter = new int[128];
		for(char c : str1.toCharArray()) {
			counter[c]++;
		}
		
		for(char c : str2.toCharArray()) {
			counter[c]--;
			if (counter[c] < 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		System.out.printf("Given Strings : %s, %s.  arePermutation:%b\n", str1, str2, arePermutation(str1, str2));
		System.out.printf("Given Strings : %s, %s.  arePermutation:%b\n", str1, str2, arePermutationWithSorts(str1, str2));
		scanner.close();
	}

}
