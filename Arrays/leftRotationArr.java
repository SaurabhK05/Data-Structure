package Arrays;

import java.util.Scanner;

public class leftRotationArr {
	static void arrRotation(int arr[], int n, int d) {
		int temp[] = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for (int i = d; i < arr.length; i++) {
			arr[i-d] = arr[i];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[n-d+i] = temp[i];
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		arrRotation(arr, n, d);
	}

}
