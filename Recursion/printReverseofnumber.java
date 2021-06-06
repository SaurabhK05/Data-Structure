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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reverseNumber(n);
		

	}

}
