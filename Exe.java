package Exe;
import java.util.Scanner;

public class Exe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("VSN");
		} else if (a == 0 && b != 0) {
			System.out.println("VN");
		} else {
			System.out.printf(String.format("%.2f", (float) -b / a));
		}
	}
}