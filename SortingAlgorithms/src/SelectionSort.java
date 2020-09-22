import java.util.Arrays;

public class SelectionSort {

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int j, min;
			for (j = i + 1, min = i; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] intArr = new int[] { 1, 10, 2, 8, 4, 6 };

		System.out.println(Arrays.toString(sort(intArr)));
		System.out.println(Arrays.toString(sort(intArr)));
	}

}
