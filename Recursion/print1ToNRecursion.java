package Recursion;

import java.util.Scanner;

public class print1ToNRecursion {
	static void OnetoN(int n) {
		if(n == 0) {
			return;
		}
		OnetoN(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		OnetoN(n);

	}

}
