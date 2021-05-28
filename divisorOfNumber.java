package Mathamatics;
import java.util.Scanner;
public class divisorOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i*i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		for(int i = (int) Math.sqrt(n) ; i > 0; i--) {
			if(n % i == 0) {
				System.out.println(n/i);
			}
		}
	}

}
