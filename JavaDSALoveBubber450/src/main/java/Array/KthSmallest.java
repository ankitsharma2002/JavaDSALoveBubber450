package Array;

import java.util.Arrays;

public class KthSmallest {

	public static int printKSmallest(int arr[], int k) throws IllegalArgumentException {

		if (k < 1 || k > arr.length) {
			System.out.println("Enter correct value of k (1 to " + arr.length + ")");
			throw new IllegalArgumentException("k must be between 1 and " + arr.length);
		}

		Arrays.sort(arr);
		System.out.println("Sorted Array is " + Arrays.toString(arr));
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == k - 1) {
				ans = arr[i];
				break; // Add break to exit loop early

			}
		}
		return ans;
		// System.out.println(arr[k - 1]);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
		int k = 10;
		System.out.println(printKSmallest(arr, k));
	}
}
