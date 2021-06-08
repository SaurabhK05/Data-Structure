package Recursion;

import java.util.Scanner;

public class ropeCutProblem {
	static int rope(int n, int a, int b, int c) {
		if(n == 0) {
			return 0;
		}
		if(n < 0) {
			return -1;
		}
		int maxoOf = Math.max(rope(n-a, a, b, c), rope(n-b, a, b, c));
		int finalMax = Math.max(maxoOf, rope(n-c, a, b, c));
		
		if(finalMax == -1) {
			return -1;
		}
		return finalMax + 1;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 2, b = 5, c = 1;
		System.out.println(rope(n, a, b, c));
	}

}
