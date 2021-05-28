package Mathamatics;
import java.util.*;
public class primeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 2;
		while(n > 0) {
			if(n % count == 0) {
				n = n/count;
				System.out.println(count);
			}
			else {
				count++;
			}
		}
		

	}

}
