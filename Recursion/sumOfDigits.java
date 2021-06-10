package Recursion;

import java.util.Scanner;

public class sumOfDigits {
	static int sumofdigit(int n) {
		if(n == 0) {
			return 0;
		}
		return n % 10 + sumofdigit(n/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(sumofdigit(n));

	}

}
