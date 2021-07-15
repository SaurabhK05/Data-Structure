package Recursion;

import java.util.Scanner;

public class ropeCutProblem {
	
	static int ropeCut(int n, int a, int b, int c) {
		if(n == 0) {
			return 0;
		}
		if(n <= -1) {
			return -1;
		}
		int maxoOf = Math.max(ropeCut(n-a, a, b, c), ropeCut(n-b, a, b, c));
		int finalMax = Math.max(maxoOf, ropeCut(n-c, a, b, c));
		
		if(finalMax == -1) {
			return -1;
		}
		return finalMax + 1;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 4, b = 2, c = 6;
		System.out.println(ropeCut(n, a, b, c));
	}

}
