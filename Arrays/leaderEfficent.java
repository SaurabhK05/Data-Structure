package Arrays;

import java.util.Scanner;

public class leaderEfficent {
	static void leader(int arr[], int n) {
		int currLeader = arr[n-1];
		for(int i = n-2; i < n; i++) {
			if(arr[i] > currLeader) {
				currLeader = arr[i];
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

	}

}
