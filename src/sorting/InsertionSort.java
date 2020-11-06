package sorting;

public class InsertionSort {
	public static void main(String args[]) {
		//Array to be sorted
		int[] arr = { 5,4,3,2,1,9,1 };

		//Printing array before sorting
		System.out.println("Elements before sorting");
		System.out.print("[");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println("]");

		//Calling sorting method to sort the array
		insertionSort(arr);

		//Printing array after selection sort
		System.out.println("Elements after selection sorting");
		System.out.print("[");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println("]");
	}

	//Method for insertion sort
	public static void insertionSort(int arr[]) {
 		for (int i = 1; i < arr.length; ++i) { 
			int key = arr[i]; 
			int j = i - 1; 

			/* Move elements of arr[0..i-1], that are 
	               greater than key, to one position ahead 
	               of their current position */
			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	}

}
