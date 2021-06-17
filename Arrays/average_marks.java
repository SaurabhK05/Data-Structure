package Arrays;
import java.util.Scanner;
public class average_marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Student : ");
		int n = sc.nextInt();
		int marks[] = new int[n];
		int sum = 0;
		float avg = 0;
		for(int i = 0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
			sum += marks[i];
		}
		avg = sum/marks.length;
		System.out.println(avg);
		

	}

}
