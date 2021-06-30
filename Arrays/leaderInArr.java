package Arrays;

import java.util.Scanner;

public class leaderInArr {
	static void leaderArr(int arr[], int n) {
		
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		leaderArr(arr, n);

	}

}
