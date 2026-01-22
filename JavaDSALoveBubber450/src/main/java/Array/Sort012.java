package Array;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 0, 1, 2} ; // 	Output: [0, 0, 1, 1, 2, 2]
		int[] resultArr=sort012(arr);
		System.out.println(Arrays.toString(resultArr));
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int[] sort012(int[] arr) {
		int low = 0; // Pointer for 0s
		int mid = 0; // Pointer for 1s (current element)
		int high = arr.length - 1; // Pointer for 2s

		while (mid <= high) {
			if (arr[mid] == 0) {
				// Swap with low pointer and move both forward
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				// Already in correct position, move mid forward
				mid++;
			} else { // arr[mid] == 2
				// Swap with high pointer and move high backward
				swap(arr, mid, high);
				high--;
				// Don't increment mid because we need to check swapped element
			}
		}
		return arr;
	}

}
