package Arrays;

import java.util.Scanner;

public class efficentSumArray {
	static void maxSum(int arr[], int n) {
		int currSum = arr[0], ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currSum = Math.max(arr[i] + currSum, arr[i]);
			ans = Math.max(ans, currSum);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		maxSum(arr, n);

	}

}
