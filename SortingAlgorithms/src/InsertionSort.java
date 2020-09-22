import java.util.Arrays;

public class InsertionSort {
	
	public static int[] sortWithForLoop(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j;
			for (j = i-1; j >= 0 && arr[j] > key; j--)
				arr[j+1] = arr[j];
			arr[j+1] = key;
		}
		return arr;
	}
	
	public static int[] sortWithWhileLoop(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] intArr = new int[] {1, 10, 2, 8, 4, 6};
		
		System.out.println(Arrays.toString(sortWithForLoop(intArr)));
		System.out.println(Arrays.toString(sortWithWhileLoop(intArr)));
	}
}
