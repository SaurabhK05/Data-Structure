package Mathamatics;
import java.util.*;
public class eucliedeanAlgorithum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(a != b) {
			if(a > b) {
				a -= b;
			}
			else {
				b -= a;
			}
		}
		System.out.println(a);

	}

}
