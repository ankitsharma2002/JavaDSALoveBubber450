package Array;

import java.util.Arrays;

public class MoveNegativeToEnd {
	public static void main(String[] args) {
		int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		Answer : [-7, -5, -1, 1, 2, 3, 6, 11]

		int n = arr.length;
		int[] temp = new int[n];
		int index = 0;

		// First pass: Copy all positive elements
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0) {
				temp[index++] = arr[i];
			}
		}

		// Second pass: Copy all negative elements
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				temp[index++] = arr[i];
			}
		}

		// Copy temp array back to original array
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
