package Mathamatics;
import java.util.*;
public class sieveOfErathosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean boolArr[] = new boolean[n];
		for(int i = 0; i<n; i++) {
			boolArr[i] = true;
		}
		for(int i = 2; i<=n-1; i++) {
			if(i % 2 == 0) {
				if(i == 2) {
					continue;
				}
				else {
					boolArr[i] = false;					
				}
			}else if(i % 3 == 0) {
				if(i == 3) {
					continue;
				}
				else {
					boolArr[i] = false;					
				}
				
			} else if(i % 5 == 0) {
				boolArr[i] = false;
			}
		}
		for(int i = 2; i <= n-1; i++) {
			if(boolArr[i] == true) {
				System.out.println(i);
			}
		}
	}

}
