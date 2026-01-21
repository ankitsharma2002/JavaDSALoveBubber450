package Array;

import java.util.Arrays;

public class MinMaxArrayP1 {
	public static int[] maxMin(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int n : arr) {
			if (min > n)
				min = n;
			if (max < n)
				max = n;
		}
		int arAns[] = { max, min };
		return arAns;
	}



	public static void main(String[] args) {
		int arr1[] = { 1, 4, 10,3490234,343,0,42,342, 2 };
		int arrPrint[] = maxMin(arr1);
		System.out.println(Arrays.toString(arrPrint));
	}
}
