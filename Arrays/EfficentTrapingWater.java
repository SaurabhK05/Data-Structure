package Arrays;

import java.util.Scanner;

public class EfficentTrapingWater {
	static void getWater(int arr[], int n) {
		int res = 0;
		int rMax[] = new int[n];
		int lMax[] = new int[n];
		lMax[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			lMax[i] = Math.max(arr[i], lMax[i-1]);
		}
		rMax[n-1] = arr[n-1];
		for (int i = n-2; i >= 0; i--) {
			rMax[i] = Math.max(arr[i], rMax[i+1]);
		}
		for (int i = 1; i < lMax.length-1; i++) {
			res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
			
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
		getWater(arr, n);

	}

}
