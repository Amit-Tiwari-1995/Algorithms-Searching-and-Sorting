package searching;

public class BinarySearch {



	public static int solve(int arr[], int element) {
		
		//TC: O(log n)

		 int start=0;
		 int last=arr.length-1;
		 
		 while(start<=last)
		 {
			 int mid=(start+last)/2;
			 
			 if(arr[mid]==element)
			 {
				 return mid; 
			 }
			 
			 if(arr[mid] > element)
			 {
				 last=mid-1;
			 }
			 
			 else
			 {
				 start=mid+1;
			 }
			 
			 
		 }
		  
		 return -1;
		
	}

	public static void main(String[] args) {

		int arr[] = { 1,2,3,4,5,6,7,8,9};
		int element = 8;

		int solve = solve(arr, element);
		System.out.println(solve);

	}

}
