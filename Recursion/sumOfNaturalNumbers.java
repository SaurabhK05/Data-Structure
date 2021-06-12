package Recursion;

import java.util.Scanner;

public class sumOfNaturalNumbers {
	static int sumOfNaturalNumber(int n) {
		if(n == 0) {
			return 0;
		}
		
		return n + sumOfNaturalNumber(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(sumOfNaturalNumber(n));

	}

}
