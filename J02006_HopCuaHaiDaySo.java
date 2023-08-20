package Exe;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J02006_HopCuaHaiDaySo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int n = sc.nextInt(), m = sc.nextInt();
		for (int i = 0; i < n + m; i++) {
			int x = sc.nextInt();
			set.add(x);
		}
		for (int x : set) {
			System.out.print(x + " ");
		}
	}
}
