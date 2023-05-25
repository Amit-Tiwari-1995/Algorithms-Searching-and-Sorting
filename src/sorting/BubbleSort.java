package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	// TC: o(n^2)

	public static String solve(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		
		return Arrays.toString(arr);

	}

	public static void main(String[] args) {

		int arr[] = { 5, 4, 9, 2, 0, 7, 19, 20 };

		String solve = solve(arr);
		System.out.println(solve);

	}

}
