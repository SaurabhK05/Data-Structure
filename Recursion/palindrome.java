package Recursion;

import java.util.Scanner;

public class palindrome {
	static boolean palindrome(String str, int start, int end) {
		if(start >= end) {
			return true;
		}
		else {
			return (str.charAt(start) == str.charAt(end) && palindrome(str, start+1, end-1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int start = 0;
		int end = str.length() - 1;
		System.out.println(palindrome(str, start, end));

	}

}
