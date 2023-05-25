package searching;

public class LinearSearch {
	
	// TC: O(n)

	public static int solve(int arr[], int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 5, 4, 9, 2, 0, 7, 19, 20 };
		int element = 19;

		int solve = solve(arr, element);
		System.out.println(solve);

	}

}
