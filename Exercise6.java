package HW2;

public class Exercise6 {
	public static void bubble_nonrec(int[] arr) {
		//check first if larger and keep going till it reaches the end.
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-(i+1); j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1]; 
					arr[j+1] = temp;
				}
			}
		}
		//print array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void bubble_rec(int[] arr) {
		//set temporary and use same idea as first but recursively instead of two loops
		int temp;
		int size = arr.length-1;
		for (int j = 0; j < size; j++) {
			if (arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1]; 
				arr[j+1] = temp;
				size -= 1;
			bubble_rec(arr);
			}
		}
	}
	
	public static void selec(int[] arr) {
		//find smallest and swap with the first index of the unsorted part
		int temp;
		int ind = 0;
		for (int j =0; j < arr.length; j++) {
			for (int i = arr.length-1; i>ind; i--) {
				if(arr[i] < arr[ind]) {
					temp = arr[ind];
					arr[ind] = arr[i];
					arr[i] = temp;
				}
			}
			ind += 1;
		}
		//print array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insert(int[] arr) {
		//sort one element at a time everytime adding a new element to the sorted part in proper place
		int temp; 
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			temp = arr[j];
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		//print array
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		bubble_nonrec(arr1);
		System.out.println("");
		
		int[] arr2 = new int[] {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		bubble_rec(arr2);
		//print array
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");
		
		int[] arr3 = new int[] {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		selec(arr3);
		System.out.println("");
		
		int[] arr4 = new int[] {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		insert(arr4);
		System.out.println("");
	}
}
