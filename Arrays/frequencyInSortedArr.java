package Arrays;

import java.util.Scanner;

public class frequencyInSortedArr {
	static void frequecyArr(int arr[]) {
		int freq = 1;
		int n = arr.length;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] == arr[i]) {
				freq += 1;
			}
			if(arr[i-1] != arr[i] || i == arr.length-1) {
				System.out.println(arr[i-1] + " " + freq);
				freq = 1;
			}
		}
		if(n == 1|| arr[n-1] != arr[n-2]) {
			System.out.println(arr[n-1] + " " + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		frequecyArr(arr);

	}

}
