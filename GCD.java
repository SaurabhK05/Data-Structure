package Mathamatics;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int minVal = Math.min(n1, n2);
		while(minVal > 0) {
			if(n1 % minVal == 0 && n2 % minVal == 0) {
				break;
			}
			minVal--;
		}
		System.out.println(minVal);
	}

}
