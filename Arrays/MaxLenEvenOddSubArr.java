package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class MaxLenEvenOddSubArr {
	static void evenOdd(int arr[], int n) {
		int count = 1;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]%2 == 0 && arr[i+1]%2 != 0 || arr[i]%2 != 0 && arr[i+1]%2 == 0) {
				count += 1;
				
			}
			else {
				count = 1;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		evenOdd(arr, n);

	}

}
