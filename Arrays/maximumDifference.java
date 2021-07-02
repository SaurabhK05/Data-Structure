package Arrays;

import java.util.Scanner;

public class maximumDifference {
	static void maxdiff(int arr[], int n) {
		int res = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				res = Math.max(res, arr[j] - arr[i]);
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
		maxdiff(arr, n);

	}

}
