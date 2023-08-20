package Exe;

import java.util.Scanner;

public class J02005_GiaoCuaHaiDaySo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt[] = new int[1000];
		int n = sc.nextInt(), m = sc.nextInt();
		for (int i = 0; i < n + m; i++) {
			int x = sc.nextInt();
			cnt[x]++;
		}
		for (int i = 1; i <= 1000; i++) {
			if (cnt[i] > 1) {
				System.out.print(i + " ");
			}
		}
	}
}
