package Exe;

import java.util.Scanner;

public class J01022_XauNhiPhan {
	public static String[] fibo = new String[100];

	public static void createFibo() {
		fibo[1] = "0";
		fibo[2] = "1";
		for (int i = 3; i < 30; i++) {
			String c1 = fibo[i - 2], c2 = fibo[i - 1];
			String res = c1 + c2;
			fibo[i] = res;
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
		createFibo();
//		while (t-- > 0) {
//			int n = sc.nextInt();
//			int k = sc.nextInt();
//			System.out.println(fibo[1]);
//		}
	}
}
