package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class maxInArr {
	static void MaxOfArr(int arr[]) {
		int larArr = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > larArr) {
				larArr = arr[i];				
			}
		}
		System.out.println(larArr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		MaxOfArr(arr);

	}

}
