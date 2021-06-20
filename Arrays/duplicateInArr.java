package Arrays;

import java.util.Scanner;

public class duplicateInArr {
	static void duplicateArr(int arr[]) {
		int res = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i < res; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		duplicateArr(arr);

	}

}
