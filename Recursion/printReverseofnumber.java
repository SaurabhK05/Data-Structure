package Recursion;
import java.util.*;

public class printReverseofnumber {
	static void reverseNumber(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		reverseNumber(n-1);
	}
	
	static void reverseNumber1(int x, int n) {
		if(x > n) return;
		reverseNumber1(x+1, n);
		System.out.print(x + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reverseNumber1(1, n);
		reverseNumber(n);
		

	}

}
