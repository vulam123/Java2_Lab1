package exercise1_2;
import java.util.Scanner;

public class Exercise1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào bán kính r: ");
		double r = sc.nextDouble();
		System.out.println("Diện tích: "+Math.PI*r*r);
	}
}
