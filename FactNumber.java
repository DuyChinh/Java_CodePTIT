package Exe;

import java.util.Scanner;

public class FactNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int index = 1;
		while (t-- > 0) {
			int n = sc.nextInt();
			int cnt = 0;
			int i = 2;
			int m = n;
			System.out.print("Test " + index++ + ": ");
			while (i < m / 2) {
				while (n % i == 0) {
					cnt++;
					n /= i;
				}
				if (cnt > 0) {
					System.out.print(i + "(" + cnt + ") ");
				}
				cnt = 0;
				i++;
			}
			if (n != 1) {
				System.out.printf("%d(1)", n);
			}
			System.out.println();
		}

	}
}
