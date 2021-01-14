package HW2;

public class Exercise3 {
	public static int max(int arr[], int fir, int las) {
		//set base case
		if (fir == las) {
			return arr[fir];
		}
		//binary recursion to find max
		return Math.max((max(arr, fir, (fir+las)/2)), (max(arr, ((fir+las)/2)+1, las)));
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {4, 7, 10, 6, 15, 2};
		int las = arr.length-1;
		int fir = 0;
		System.out.println(max(arr, fir, las));
	}
}
