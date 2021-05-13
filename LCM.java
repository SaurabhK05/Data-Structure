package Mathamatics;
import java.util.*;
public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = Math.min(a, b);
		while(ans > 0) {
			if(a % ans == 0 && b % ans == 0) {
				a = a/ans;
				b = b/ans;
				ans = a*b*ans;
				break;
			}
			ans--;
		}
		System.out.println(ans);
	}

}
