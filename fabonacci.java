package Recursion;

import java.util.Scanner;

public class fabonacci {
	static int fabonacci(int n) {
		if(n <= 1) {
			return n;
		}
		return fabonacci(n-1) + fabonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fabonacci(n));

	}

}
