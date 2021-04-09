package arrays;

import java.util.Scanner;

public class PrintReverseArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int size = Integer.parseInt(input);
		int[] arr = new int[size];
		for (int id = 0; id < size; id++) {
			input = s.nextLine();
			int data = Integer.parseInt(input);
			arr[id] = data;
		}
		for (int id = size-1; id >= 0; id--) {
			System.out.println(arr[id]);
		}
		
	}

}
