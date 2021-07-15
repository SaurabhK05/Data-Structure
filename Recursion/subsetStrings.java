package Recursion;
import java.util.*;
public class subsetStrings {
	
	static void subset(String s, String curr, int i) {
		if(i == s.length()) {
			System.out.print(curr + " ");
			return;
		}
		subset(s, curr, i+1);
		subset(s, curr + s.charAt(i), i+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		subset(s, "", 0);		

	}

}
