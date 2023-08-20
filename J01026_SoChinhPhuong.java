package Exe;

import java.util.Scanner;

public class J01026_SoChinhPhuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			long k = (long) Math.sqrt(n);
			if (k * k == n) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
