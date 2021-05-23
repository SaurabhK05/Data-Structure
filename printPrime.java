package Mathamatics;
import java.util.*;
public class printPrime {
	
	static boolean isPrime(int n) {
		boolean ans = false;
		if(n == 1) {
			ans = false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				ans = false;
			}
			else {
				ans = true;
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		
	}

}
