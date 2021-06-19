package Arrays;

import java.util.Scanner;

public class binaryArray {
	static void  binArr(int arr[], int n) {
		int count = 1;
		int max = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count += 1;
				if(count > max) {
					max = count;
				}
			}
			if(arr[i] != arr[i+1]) {
				count = 1;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		binArr(arr, n);
	}
}
